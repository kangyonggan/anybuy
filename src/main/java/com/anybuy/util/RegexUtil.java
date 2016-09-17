package com.anybuy.util;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author houbinbin
 * @since 16/9/17
 */
public class RegexUtil {

    /**
     * 大陆手机号码正则表达式
     * [](http://blog.csdn.net/centralperk/article/details/7360590)
     */
    private static final String MOBILE_REGEX = "^[1]([3][0-9]{1}|59|58|88|89)[0-9]{8}$";


    /**
     * 是否为大陆手机号码
     * @param phone
     * @return
     */
    public static boolean isChinaMobile(String phone) {
        if (StringUtils.isEmpty(phone))
            return false;
        if (phone.length() < 11)
            return false;

        Pattern p = Pattern.compile(MOBILE_REGEX);
        Matcher m = p.matcher(phone);
        return m.matches();
    }
}
