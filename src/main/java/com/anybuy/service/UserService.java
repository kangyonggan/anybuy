package com.anybuy.service;

import com.anybuy.model.User;

import java.util.List;

/**
 * @author houbinbin
 * @since 2016/09/17
 */
public interface UserService {

    List<User> findAllUsersByPage(int pageNum);

    User getUser(Long id);

    /**
     * 根据手机号查询用户
     * @param mobile
     * @return
     */
    User getUserByMobile(String mobile);

    /**
     * 根据user不为null的字段进行查询
     * @param user User对象
     * @return  List<User>
     */
    List<User> getUserList(User user);

    int saveUser(User user);

    int updateUser(User user);

    int deleteUser(Long id);

    /**
     * 设定安全的密码，生成随机的salt并经过N次 sha-1 hash
     * @param user
     */
    void entryptPassword(User user);

}