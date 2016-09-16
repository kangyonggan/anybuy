package com.anybuy.util;

import com.anybuy.util.base.IsEmpty;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/**
 * @author houbinbin
 * @since 16/9/15
 *
 * 参数工具类
 */
public class ArgUtil {

  private ArgUtil(){}


  /**
   * 判断当前对象是否为空
   * - 对象为空
   * - 空字符串
   * - 空集合/map
   * - 空数组
   * - 自定义空类型
   * @param object
   * @return
   */
  public static Boolean isNull(Object object) {
    if (null == object) {
      return true;
    }
    if (object instanceof String) {
      String string = (String) object;
      return StringUtils.isEmpty(string);
    }
    if (object instanceof Collection) {
      Collection collection = (Collection) object;
      return CollectionUtils.isEmpty(collection);
    }
    if (object instanceof Map) {
      Map map = (Map) object;
      return MapUtils.isEmpty(map);
    }
    if (object.getClass().isArray()) {
      return Array.getLength(object) == NumberUtils.INTEGER_ZERO;
    }
    if (object instanceof IsEmpty) {
      IsEmpty isEmpty = (IsEmpty) object;
      return isEmpty.isEmpty();
    }

    return false;
  }

}
