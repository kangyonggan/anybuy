package com.anybuy.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
public class Address {
    /**
     * 主键,自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 邮编
     */
    @Column(name = "post_code")
    private String postCode;

    /**
     * 收件人姓名
     */
    private String username;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 收货地址
     */
    private String address;

    /**
     * 是否默认
     */
    @Column(name = "is_default")
    private Byte isDefault;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 是否删除 {0:未删除, 1:已删除}
     */
    @Column(name = "is_deleted")
    private Byte isDeleted;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 最后更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;
}