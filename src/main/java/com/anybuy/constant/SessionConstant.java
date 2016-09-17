package com.anybuy.constant;

/**
 * @author houbinbin
 * @since 16/9/17
 * HttpSession 常量定义
 */
public class SessionConstant {

    /**
     * session 是否已验证 KEY
     * - 用于注册,拖拽进度条验证成功:IS_VERIFY
     *
     * - 注册成功后设置为 NOT_VERIFY
     * - 刚进入注册页面设置为 NOT_VERIFY
     */
    public static final String SESSION_IS_VERIFY_KEY = "session_is_verify_key";

    /**
     * 是否验证畅想
     */
    public static final String IS_VERIFY = "is_verify";
    public static final String NOT_VERIFY = "not_verify";

}
