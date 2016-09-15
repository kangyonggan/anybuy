CREATE DATABASE anybuy
  DEFAULT CHARACTER SET utf8
  COLLATE utf8_general_ci;

USE anybuy;

CREATE TABLE demo
(
  id           BIGINT(20) PRIMARY KEY  AUTO_INCREMENT NOT NULL
  COMMENT '主键, 自增',
  is_deleted   TINYINT                                NOT NULL         DEFAULT 0
  COMMENT '是否删除 {0:未删除, 1:已删除}',
  created_time DATETIME                               NOT NULL
  COMMENT '创建时间',
  updated_time DATETIME                               NOT NULL
  COMMENT '最后更新时间'
)
  COMMENT '示例表';
CREATE UNIQUE INDEX id_UNIQUE ON demo (id);