CREATE DATABASE anybuy
  DEFAULT CHARACTER SET utf8
  COLLATE utf8_general_ci;

USE anybuy;

CREATE TABLE `user` (
  id           BIGINT(20) AUTO_INCREMENT NOT NULL PRIMARY KEY
  COMMENT '主键,自增',
  mobile       VARCHAR(20)               NOT NULL
  COMMENT '手机号',
  password     VARCHAR(64)               NOT NULL
  COMMENT '密码',
  nickname     VARCHAR(32)               NOT NULL         DEFAULT ''
  COMMENT '昵称',
  is_deleted   TINYINT                   NOT NULL         DEFAULT 0
  COMMENT '是否删除 {0:未删除, 1:已删除}',
  created_time DATETIME                  NOT NULL
  COMMENT '创建时间',
  updated_time DATETIME                  NOT NULL
  COMMENT '最后更新时间'
)
  COMMENT '用户表';
CREATE UNIQUE INDEX id_UNIQUE
  ON `user` (id);
CREATE UNIQUE INDEX mobile_UNIQUE
  ON `user` (`mobile`);


CREATE TABLE `user_info` (
  id            BIGINT(20) AUTO_INCREMENT NOT NULL PRIMARY KEY
  COMMENT '主键,自增',
  identity_card CHAR(18)                  NOT NULL
  COMMENT '身份证',
  real_name     VARCHAR(10)               NOT NULL
  COMMENT '真是姓名',
  is_deleted    TINYINT                   NOT NULL         DEFAULT 0
  COMMENT '是否删除 {0:未删除, 1:已删除}',
  created_time  DATETIME                  NOT NULL
  COMMENT '创建时间',
  updated_time  DATETIME                  NOT NULL
  COMMENT '最后更新时间'
)
  COMMENT '用户信息表';

CREATE UNIQUE INDEX id_UNIQUE
  ON `user_info` (id);
CREATE UNIQUE INDEX identity_card_UNIQUE
  ON `user_info` (`identity_card`);


CREATE TABLE `address` (
  id           BIGINT(20) AUTO_INCREMENT NOT NULL PRIMARY KEY
  COMMENT '主键,自增',
  post_code    CHAR(6)                   NOT NULL
  COMMENT '邮编',
  username     VARCHAR(20)               NOT NULL
  COMMENT '收件人姓名',
  mobile       VARCHAR(20)               NOT NULL
  COMMENT '手机号',
  address      VARCHAR(128)              NOT NULL
  COMMENT '收货地址',
  is_default   TINYINT                   NOT NULL         DEFAULT 0
  COMMENT '是否默认',
  user_id      BIGINT(20)                NOT NULL
  COMMENT '用户ID',
  is_deleted   TINYINT                   NOT NULL         DEFAULT 0
  COMMENT '是否删除 {0:未删除, 1:已删除}',
  created_time DATETIME                  NOT NULL
  COMMENT '创建时间',
  updated_time DATETIME                  NOT NULL
  COMMENT '最后更新时间'
)
  COMMENT '收货地址表';

CREATE UNIQUE INDEX id_UNIQUE
  ON address (id);


CREATE TABLE `card_history` (
  id           BIGINT(20) AUTO_INCREMENT NOT NULL PRIMARY KEY
  COMMENT '主键,自增',
  card_no      VARCHAR(64)               NOT NULL
  COMMENT '银行卡号',
  bank_no      VARCHAR(32)               NOT NULL
  COMMENT '银行编号',
  user_id      BIGINT(20)                NOT NULL
  COMMENT '用户ID',
  is_deleted   TINYINT                   NOT NULL         DEFAULT 0
  COMMENT '是否删除 {0:未删除, 1:已删除}',
  created_time DATETIME                  NOT NULL
  COMMENT '创建时间',
  updated_time DATETIME                  NOT NULL
  COMMENT '最后更新时间'
)
  COMMENT '绑卡记录';
CREATE UNIQUE INDEX id_UNIQUE
  ON `card_history` (id);


CREATE TABLE `bank` (
  id           BIGINT(20) AUTO_INCREMENT NOT NULL PRIMARY KEY
  COMMENT '主键,自增',
  bank_no      VARCHAR(64)               NOT NULL
  COMMENT '银行编号',
  bank_name    VARCHAR(64)               NOT NULL
  COMMENT '银行名称',
  is_deleted   TINYINT                   NOT NULL         DEFAULT 0
  COMMENT '是否删除 {0:未删除, 1:已删除}',
  created_time DATETIME                  NOT NULL
  COMMENT '创建时间',
  updated_time DATETIME                  NOT NULL
  COMMENT '最后更新时间'
)
  COMMENT '银行表';
CREATE UNIQUE INDEX id_UNIQUE
  ON `bank` (id);

CREATE UNIQUE INDEX bank_no_UNIQUE
  ON `bank` (bank_no);