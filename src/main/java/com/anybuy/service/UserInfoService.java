package com.anybuy.service;

import com.anybuy.model.UserInfo;

import java.util.List;

/**
 * @author houbinbin
 * @since 2016/09/17
 */
public interface UserInfoService {

    List<UserInfo> findAllUserInfosByPage(int pageNum);

    UserInfo getUserInfo(Long id);

    int saveUserInfo(UserInfo userInfo);

    int updateUserInfo(UserInfo userInfo);

    int deleteUserInfo(Long id);

}