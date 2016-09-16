package com.anybuy.util;

import lombok.extern.log4j.Log4j2;

import java.util.Collection;
import java.util.Map;

/**
 * @author houbinbin
 * @since 16/9/15
 *
 * Java类-工具类
 */
@Log4j2
public class ClassUtil {
  /**
   * 判断类的类型字段
   */
  private static final String TYPE = "TYPE";

  private ClassUtil(){}

  /**
   * 是否为字符串
   * @param object
   * @return
   */
  public static Boolean isString(Object object) {
    return object instanceof String;
  }

  /**
   * 是否为集合
   * @param object
   * @return
   */
  public static Boolean isCollection(Object object) {
    return object instanceof Collection;
  }

  /**
   * 是否为Map
   * @param object
   * @return
   */
  public static Boolean isMap(Object object) {
    return object instanceof Map;
  }

  /**
   * 是否为数组
   * @param object
   * @return
   */
  public static Boolean isArray(Object object) {
    return object.getClass().isArray();
  }

  /**
   * 是否为Java8大基本类型
   * - 基本类型是 CLASS 的子集
   * @param object
   * @return
   */
  public static Boolean isPrimitive(Object object) {
    try {
      return ((Class) object.getClass().getField(TYPE).get(null)).isPrimitive();
    } catch (IllegalAccessException | NoSuchFieldException e) {
      log.error("判断是否为基本类型，出现错误:{}", object.toString());
      return false;
    }
  }

  public static Boolean isPrimitive(Class clazz) {
    try {
      return ((Class) clazz.getField(TYPE).get(null)).isPrimitive();
    } catch (IllegalAccessException | NoSuchFieldException e) {
      log.error("判断是否为基本类型，出现错误:{}", clazz.toString());
      return false;
    }
  }
}
