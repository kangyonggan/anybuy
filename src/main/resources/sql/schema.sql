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


CREATE TABLE `user`(
  id BIGINT(20) AUTO_INCREMENT NOT NULL PRIMARY KEY COMMENT '主键,自增',
  mobile VARCHAR(20) NOT NULL COMMENT '手机号',
  password VARCHAR(64) NOT NULL COMMENT '密码',
  nickname VARCHAR(32) NOT NULL DEFAULT '' COMMENT '昵称'
) COMMENT '用户表';
CREATE UNIQUE INDEX id_UNIQUE ON `user` (id);




CREATE TABLE 'address'(
  id BIGINT(20) AUTO_INCREMENT NOT NULL PRIMARY KEY COMMENT '主键,自增',
  post_code CHAR(6) NOT NULL COMMENT '邮编',
  username VARCHAR(20) NOT NULL COMMENT '收件人姓名',
  mobile VARCHAR(20) NOT NULL COMMENT '手机号',
  address VARCHAR(128) NOT NULL COMMENT '收货地址',
  is_default TINYINT NOT NULL DEFAULT 0 COMMENT '是否默认',
  user_id BIGINT(20) NOT NULL COMMENT '用户ID'
) COMMENT '收货地址表';

CREATE UNIQUE INDEX id_UNIQUE ON address (id);
