-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        10.5.2-MariaDB - mariadb.org binary distribution
-- 服务器OS:                        Win64
-- HeidiSQL 版本:                  10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for billstore
CREATE DATABASE IF NOT EXISTS `billstore` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `billstore`;

-- Dumping structure for table billstore.appcustomer
CREATE TABLE IF NOT EXISTS `appcustomer` (
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

-- Data exporting was unselected.

-- Dumping structure for table billstore.appgoods
CREATE TABLE IF NOT EXISTS `appgoods` (
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

-- Data exporting was unselected.

-- Dumping structure for table billstore.appgoodsprice
CREATE TABLE IF NOT EXISTS `appgoodsprice` (
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

-- Data exporting was unselected.

-- Dumping structure for table billstore.apppytype
CREATE TABLE IF NOT EXISTS `apppytype` (
  `pyway_id` varchar(32) NOT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `order_id` int(1) DEFAULT NULL COMMENT '排序',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`pyway_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='支出类别表';

-- Data exporting was unselected.

-- Dumping structure for table billstore.apppyway
CREATE TABLE IF NOT EXISTS `apppyway` (
  `pyway_id` varchar(32) NOT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `is_finshed` int(1) DEFAULT NULL COMMENT '是否支付',
  `order_id` int(1) DEFAULT NULL COMMENT '排序',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`pyway_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='付款方式表';

-- Data exporting was unselected.

-- Dumping structure for table billstore.appsuppliers
CREATE TABLE IF NOT EXISTS `appsuppliers` (
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

-- Data exporting was unselected.

-- Dumping structure for table billstore.appuser
CREATE TABLE IF NOT EXISTS `appuser` (
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

-- Data exporting was unselected.

-- Dumping structure for table billstore.appwxusers
CREATE TABLE IF NOT EXISTS `appwxusers` (
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

-- Data exporting was unselected.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
