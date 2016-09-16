package com.anybuy.util;

import com.anybuy.util.base.Entity;
import org.springframework.beans.BeanUtils;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

/**
 * @author houbinbin
 * @since 16/9/15
 *
 * 实体Bean工具类
 * - 可以直接给实体的create_time, update_time 进行赋值
 */
public class EntityUtil {
  private EntityUtil(){}

  /**
   * 设置对象的【创建】【更新】时间
   * - 不支持map对象
   * @param object  创建对象
   * @param date  时间
   */
  public static void create(Object object, Date date) {
    if(ArgUtil.isNull(object)) {
      return;
    }
    Entity entity = buildEntity(date);
    if(object instanceof Collection) {
      Collection collection = (Collection)object;
      for(Object obj : collection) {
        BeanUtils.copyProperties(entity, obj);
      }
    }
    if(object.getClass().isArray()) {
      Object[] objects = (Object[])object;
      for(Object obj : objects) {
        BeanUtils.copyProperties(entity, obj);
      }
    }
    if(object instanceof Map) {
      throw new UnsupportedOperationException("暂时不支持map类型");
    }
    BeanUtils.copyProperties(entity, object);
  }

  /**
   * 默认时间设置为当前时间
   * @param object
   */
  public static void create(Object object) {
    Date now = new Date();
    create(object, now);
  }


  /**
   * 设置对象的【更新】时间
   * @param object 跟新对象
   * @param date  时间
   */
  public void update(Object object, Date date) {
    //...
  }

  /**
   * 构建Entity
   */
  private static Entity buildEntity(Date date) {
    Entity entity = new Entity();
    entity.setCreatedTime(date);
    entity.setUpdatedTime(date);
    return entity;
  }
}
