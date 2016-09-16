package com.anybuy.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @author houbinbin
 * @since 16/9/15
 */
public class StringUtil {

  private StringUtil() {}

  /**
   * 字符串左右添加修饰符
   * @param original  原始字符串
   * @param sign  修饰符
   * @return
   */
  public static String bothSign(String original, String sign) {
    return String.format("%s%s%s", sign, original, sign);
  }

  /**
   * 过滤java正则表达式-特殊字符
   * @param keyword
   * @return
   */
  public static String escapeSpecialWord(String keyword) {
    if (!StringUtils.isEmpty(keyword)) {
      String[] fbsArr = { "\\", "$", "(", ")", "*", "+", ".", "[", "]", "?", "^", "{", "}", "|" };
      for (String key : fbsArr) {
        if (keyword.contains(key)) {
          keyword = keyword.replace(key, "\\" + key);
        }
      }
    }

    return keyword;
  }

}
