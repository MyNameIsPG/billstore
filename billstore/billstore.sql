/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : billstore

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-12-01 17:48:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for appcustomer
-- ----------------------------
DROP TABLE IF EXISTS `appcustomer`;
CREATE TABLE `appcustomer` (
  `customer_id` varchar(32) NOT NULL COMMENT '客户id',
  `truename` varchar(10) DEFAULT NULL COMMENT '真实姓名',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `id_card` varchar(18) DEFAULT NULL COMMENT '身份证号码',
  `address` varchar(255) DEFAULT NULL COMMENT '居住地址',
  `open_id` varchar(255) DEFAULT NULL COMMENT '微信id',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户表';

-- ----------------------------
-- Records of appcustomer
-- ----------------------------
INSERT INTO `appcustomer` VALUES ('774745937bad4f7d9ca6b651f0550dce', '彭贵', '18588773304', '', '', '', '2020-11-30 11:36:25', null);

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
INSERT INTO `appgoods` VALUES ('38de71497ead48cd8bd87104f94f68f3', '商品4', '小类4', '大类4', '0', '0', '2020-12-01 09:30:16', null);
INSERT INTO `appgoods` VALUES ('662347ac411a47468d1c8524d55720b6', '商品5', '小类5', '大类5', '0', '0', '2020-12-01 09:31:24', null);
INSERT INTO `appgoods` VALUES ('698067d99fa748469f7e5d20369839cf', '商品3', '小类3', '大类3', '0', '0', '2020-12-01 09:30:07', null);
INSERT INTO `appgoods` VALUES ('b93c21ab831542b4b312f2f6cb48189e', '商品1', '小类1', '大类1', '0', '0', '2020-12-01 09:29:32', null);
INSERT INTO `appgoods` VALUES ('d427fc25661442bdbdcc8ac4590b12bd', '商品2', '小类2', '大类2', '0', '0', '2020-12-01 09:30:04', null);

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
INSERT INTO `apppytype` VALUES ('3a2bce1521454760ae526d62e07e0bbd', '支出2', '0', '2020-12-01 09:12:40', null);
INSERT INTO `apppytype` VALUES ('41ceed2157584ec0967e8288c103b1dc', '支出3', '0', '2020-12-01 09:12:43', null);
INSERT INTO `apppytype` VALUES ('676aa9b7cc574b11a71b4f75fe37f04f', '支出1', '0', '2020-12-01 09:12:32', null);

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
INSERT INTO `apppyway` VALUES ('8aaa516010fe4363a4e091c347b84851', '付款方式3', '0', '0', '2020-12-01 09:17:25', null);
INSERT INTO `apppyway` VALUES ('8b919474a3474ed9a3b6b7dd50581f25', '付款方式1', '0', '0', '2020-12-01 09:17:19', null);
INSERT INTO `apppyway` VALUES ('a1ad8684600c401f9b5ce3035bde9f08', '付款方式2', '0', '0', '2020-12-01 09:17:21', null);

-- ----------------------------
-- Table structure for appsuppliers
-- ----------------------------
DROP TABLE IF EXISTS `appsuppliers`;
CREATE TABLE `appsuppliers` (
  `suppliers_id` varchar(32) NOT NULL,
  `truename` varchar(10) DEFAULT NULL COMMENT '真实姓名',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `id_card` varchar(18) DEFAULT NULL COMMENT '身份证号码',
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
  `truename` varchar(10) DEFAULT NULL COMMENT '真实姓名',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `id_card` varchar(18) DEFAULT NULL COMMENT '身份证号码',
  `is_admin` int(1) DEFAULT NULL COMMENT '是否管理员',
  `open_id` varchar(255) DEFAULT NULL COMMENT '微信openid',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人员表';

-- ----------------------------
-- Records of appuser
-- ----------------------------
INSERT INTO `appuser` VALUES ('7cfb8aa0c12741a692080a7febfc8087', '张三', '18588773301', '', '0', null, '2020-12-01 11:29:45', null);

-- ----------------------------
-- Table structure for appwxusers
-- ----------------------------
DROP TABLE IF EXISTS `appwxusers`;
CREATE TABLE `appwxusers` (
  `wx_id` varchar(32) NOT NULL,
  `open_id` varchar(32) DEFAULT NULL COMMENT '微信小程序id',
  `target_id` varchar(32) DEFAULT NULL COMMENT '目标id',
  `nickname` varchar(20) DEFAULT NULL COMMENT '昵称',
  `gender` int(1) DEFAULT NULL COMMENT '性别',
  `avatar_url` varchar(255) DEFAULT NULL COMMENT '头像',
  `mobile` varchar(50) DEFAULT NULL COMMENT '手机号码',
  `role` int(1) DEFAULT NULL COMMENT '1管理员 2员工 3供应商 3客户',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`wx_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='微信基础数据表';

-- ----------------------------
-- Records of appwxusers
-- ----------------------------
INSERT INTO `appwxusers` VALUES ('da7ef89e280e41a09bf83d6c627349f0', 'oBzz60KcpdjYEAe_rN91SL6r0cBU', '774745937bad4f7d9ca6b651f0550dce', '彭贵', '1', 'https://thirdwx.qlogo.cn/mmopen/vi_32/pbjIJqM0Sxv6iaIXmrrqb8saO0weAVqaBhC2u68tmNNxJ7BGGsebVeQgKye8b37ykZaYwzcK6cXuZMVrPDcFTmw/132', '18588773304', '4', '2020-11-30 11:36:46', '2020-11-30 11:36:53');
