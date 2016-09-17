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
    public List<User> findAllUsersByPage(int pageNum) {
        Example example = new Example(User.class);
        example.setOrderByClause("id desc");
        return super.selectByExample4Page(pageNum, example);
    }

    @Override
    public User getUser(Long id) {
        return super.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getUserList(User user) {
        return super.select(user);
    }
}
