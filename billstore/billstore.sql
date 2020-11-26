/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : billstore

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-11-26 19:20:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for appcustomer
-- ----------------------------
DROP TABLE IF EXISTS `appcustomer`;
CREATE TABLE `appcustomer` (
  `customer_id` varchar(32) NOT NULL COMMENT '客户id',
  `truename` varchar(10) DEFAULT NULL COMMENT '真实姓名',
  `nickname` varchar(255) DEFAULT NULL COMMENT '昵称',
  `sex` int(1) DEFAULT NULL COMMENT '性别',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `id_card` varchar(18) DEFAULT NULL COMMENT '身份证号码',
  `avatar_url` varchar(255) DEFAULT NULL COMMENT '头像',
  `address` varchar(255) DEFAULT NULL COMMENT '居住地址',
  `open_id` varchar(255) DEFAULT NULL COMMENT '微信id',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户表';

-- ----------------------------
-- Records of appcustomer
-- ----------------------------

-- ----------------------------
-- Table structure for appgoods
-- ----------------------------
DROP TABLE IF EXISTS `appgoods`;
CREATE TABLE `appgoods` (
  `good_id` varchar(32) NOT NULL,
  `name` varchar(32) DEFAULT NULL COMMENT '商品名称',
  `fagId` varchar(32) DEFAULT NULL COMMENT '商品类型',
  `is_family` varchar(32) DEFAULT NULL COMMENT '商品大类',
  `is_selling` int(1) DEFAULT NULL COMMENT '是否销售',
  `order_id` int(1) DEFAULT NULL COMMENT '排序',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`good_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';

-- ----------------------------
-- Records of appgoods
-- ----------------------------

-- ----------------------------
-- Table structure for appgoodsprice
-- ----------------------------
DROP TABLE IF EXISTS `appgoodsprice`;
CREATE TABLE `appgoodsprice` (
  `goodsprice_id` varchar(32) NOT NULL COMMENT '商品价格id',
  `good_id` varchar(32) DEFAULT NULL COMMENT '商品id',
  `name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `price` decimal(32,2) DEFAULT NULL,
  `is_selling` int(1) DEFAULT NULL COMMENT '是否销售',
  `update_user_id` varchar(32) DEFAULT NULL COMMENT '更新人id',
  `update_user_name` varchar(20) DEFAULT NULL COMMENT '更新人名称',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`goodsprice_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品价格表';

-- ----------------------------
-- Records of appgoodsprice
-- ----------------------------

-- ----------------------------
-- Table structure for apppytype
-- ----------------------------
DROP TABLE IF EXISTS `apppytype`;
CREATE TABLE `apppytype` (
  `pyway_id` varchar(32) NOT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `order_id` int(1) DEFAULT NULL COMMENT '排序',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`pyway_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='支出类别表';

-- ----------------------------
-- Records of apppytype
-- ----------------------------

-- ----------------------------
-- Table structure for apppyway
-- ----------------------------
DROP TABLE IF EXISTS `apppyway`;
CREATE TABLE `apppyway` (
  `pyway_id` varchar(32) NOT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `is_finshed` int(1) DEFAULT NULL COMMENT '是否支付',
  `order_id` int(1) DEFAULT NULL COMMENT '排序',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`pyway_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='付款方式表';

-- ----------------------------
-- Records of apppyway
-- ----------------------------

-- ----------------------------
-- Table structure for appsuppliers
-- ----------------------------
DROP TABLE IF EXISTS `appsuppliers`;
CREATE TABLE `appsuppliers` (
  `suppliers_id` varchar(32) NOT NULL,
  `truename` varchar(10) DEFAULT NULL COMMENT '真实姓名',
  `nickname` varchar(255) DEFAULT NULL COMMENT '昵称',
  `sex` int(1) DEFAULT NULL COMMENT '性别',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `id_card` varchar(18) DEFAULT NULL COMMENT '身份证号码',
  `avatar_url` varchar(255) DEFAULT NULL COMMENT '头像',
  `address` varchar(255) DEFAULT NULL COMMENT '居住地址',
  `open_id` varchar(255) DEFAULT NULL COMMENT '微信id',
  `bank_id` varchar(32) DEFAULT NULL COMMENT '银行卡号',
  `bank_name` varchar(32) DEFAULT NULL COMMENT '银行名称',
  `bank_arrdress` varchar(32) DEFAULT NULL COMMENT '银行开户行',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`suppliers_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='供应商表';

-- ----------------------------
-- Records of appsuppliers
-- ----------------------------

-- ----------------------------
-- Table structure for appuser
-- ----------------------------
DROP TABLE IF EXISTS `appuser`;
CREATE TABLE `appuser` (
  `user_id` varchar(32) NOT NULL,
  `nickname` varchar(10) DEFAULT NULL COMMENT '昵称',
  `truename` varchar(10) DEFAULT NULL COMMENT '真实姓名',
  `sex` int(1) DEFAULT NULL COMMENT '性别',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `id_card` varchar(18) DEFAULT NULL COMMENT '身份证号码',
  `avatar_url` varchar(255) DEFAULT NULL COMMENT '头像',
  `is_admin` int(1) DEFAULT NULL COMMENT '是否管理员',
  `open_id` varchar(255) DEFAULT NULL COMMENT '微信openid',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人员表';

-- ----------------------------
-- Records of appuser
-- ----------------------------
INSERT INTO `appuser` VALUES ('09a0d7843bdb47dc91012bc8d7325de6', 'asd', 'ad', '0', 'as', '', '', '0', '', '2020-11-26 15:58:16', null);
INSERT INTO `appuser` VALUES ('2b257378b04b4a5b9c957abbe4c7b1af', 'asd', 'ad', '0', 'as', '', '', '0', '', '2020-11-26 15:58:04', null);
