package com.anybuy.service.impl;

import com.anybuy.model.UserInfo;
import com.anybuy.service.UserInfoService;
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
public class UserInfoServiceImpl extends BaseService<UserInfo> implements UserInfoService {

    @Override
    public int saveUserInfo(UserInfo userInfo) {
        return super.insertSelective(userInfo);
    }

    @Override
    public int updateUserInfo(UserInfo userInfo) {
        return super.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public int deleteUserInfo(Long id) {
        return super.deleteByPrimaryKey(id);
    }

    @Override
    public List<UserInfo> findAllUserInfosByPage(int pageNum) {
        Example example = new Example(UserInfo.class);
        example.setOrderByClause("id desc");
        return super.selectByExample4Page(pageNum, example);
    }

    @Override
    public UserInfo getUserInfo(Long id) {
        return super.selectByPrimaryKey(id);
    }
}
