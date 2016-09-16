
package com.anybuy.util.base;

import lombok.Data;

import java.util.Date;

/**
 * @author houbinbin
 * @since 2016/9/1
 * - 继承会导致各种非议与不适用。使用BeanUtils代替。
 */
@Data
public class Entity {
  private Date createdTime;
  private Date updatedTime;

  public Entity() {
  }

  /**
   * 设置创建/更新时间
   */
  public Entity(Date createdTime, Date updatedTime) {
    this.createdTime = createdTime;
    this.updatedTime = updatedTime;
  }
}


