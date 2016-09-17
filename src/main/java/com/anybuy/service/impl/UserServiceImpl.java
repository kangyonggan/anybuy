package com.anybuy.service.impl;

import com.anybuy.model.User;
import com.anybuy.service.UserService;
import tk.mybatis.mapper.entity.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author houbinbin
 * @since 2016/09/17
 */
@Service
@Transactional
public class UserServiceImpl extends BaseService<User> implements UserService {

    @Override
    public int saveUser(User user) {
        return super.insertSelective(user);
    }

    @Override
    public int updateUser(User user) {
        return super.updateByPrimaryKeySelective(user);
    }

    @Override
    public int deleteUser(Long id) {
        return super.deleteByPrimaryKey(id);
    }

    @Override
    public void entryptPassword(User user) {
        byte[] salt = DigestUtil.generateSalt(ShiroConstant.SALT_SIZE);
        user.setSalt(EncodeUtil.encodeHex(salt));

        byte[] hashPassword = DigestUtil.sha1(user.getPassword().getBytes(), salt, ShiroConstant.HASH_INTERATIONS);
        user.setPassword(EncodeUtil.encodeHex(hashPassword));
    }

    @Override
    public List<User> findAllUsersByPage(int pageNum) {
        Example example = new Example(User.class);
        example.setOrderByClause("id desc");
        return super.selectByExample4Page(pageNum, example);
    }

    @Override
    public ShiroUser getShiroUser() {
        try {
            return (ShiroUser) SecurityUtils.getSubject().getPrincipal();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public User getUser(Long id) {
        return super.selectByPrimaryKey(id);
    }

    @Override
    public User getUserByMobile(String mobile) {
        User user = new User();
        user.setMobile(mobile);
        return super.selectOne(user);
    }

    @Override
    public List<User> getUserList(User user) {
        return super.select(user);
    }
}
