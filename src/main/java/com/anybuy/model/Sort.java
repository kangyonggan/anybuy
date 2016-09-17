package com.anybuy.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
public class Sort {
    /**
     * 主键,自增
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 分类代码
     */
    @Column(name = "sort_code")
    private String sortCode;

    /**
     * 分类名称
     */
    @Column(name = "sort_name")
    private String sortName;

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