package com.anybuy.config.shiro;

import com.anybuy.constant.ShiroConstant;
import com.anybuy.model.ShiroUser;
import com.anybuy.model.User;
import com.anybuy.service.UserService;
import com.anybuy.util.EncodeUtil;
import lombok.extern.log4j.Log4j2;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * @author kangyonggan
 * @since 16/5/15
 */
@Log4j2
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    /**
     * 设定Password校验的Hash算法与迭代次数.
     */
    @PostConstruct
    public void initCredentialsMatcher() {
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher(ShiroConstant.HASH_ALGORITHM);
        matcher.setHashIterations(ShiroConstant.HASH_INTERATIONS);

        setCredentialsMatcher(matcher);
    }

    /**
     * 权限认证，为当前登录的Subject授予角色和权限
     * 经测试：本例中该方法的调用时机为需授权资源被访问时
     * 经测试：并且每次访问需授权资源时都会执行该方法中的逻辑，这表明本例中默认并未启用AuthorizationCache
     * 经测试：如果连续访问同一个URL（比如刷新），该方法不会被重复调用，Shiro有一个时间间隔（也就是cache时间，在ehcache-shiro.xml中配置），超过这个时间间隔再刷新页面，该方法会被执行
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        ShiroUser shiroUser = (ShiroUser) principalCollection.getPrimaryPrincipal();
        log.info("Shiro权限认证, mobile={}", shiroUser.getMobile());

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        return info;
    }

    /**
     * 登录认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authenticationToken) throws AuthenticationException {
        //UsernamePasswordToken对象用来存放提交的登录信息
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        String mobile = token.getUsername();
        log.info("Shiro登录认证, mobile={}", mobile);

        User user = userService.getUserByMobile(mobile);
        if(null == user) {
            throw new UnknownAccountException();
        }

        byte[] salt = EncodeUtil.decodeHex(user.getSalt());
        ShiroUser shiroUser = new ShiroUser();
        shiroUser.setId(user.getId());
        shiroUser.setMobile(user.getMobile());
        shiroUser.setNickname(user.getNickname());
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(shiroUser,
                user.getPassword(), ByteSource.Util.bytes(salt), getName());

        return simpleAuthenticationInfo;
    }

}
