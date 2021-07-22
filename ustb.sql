/*
Navicat MySQL Data Transfer

Source Server         : localhost_root
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : ustb

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2021-04-17 08:49:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admins
-- ----------------------------
DROP TABLE IF EXISTS `admins`;
CREATE TABLE `admins` (
  `admin_id` int(11) NOT NULL auto_increment,
  `admin_name` varchar(20) default NULL,
  `admin_pass` varchar(32) default NULL,
  `admin_role` int(11) default NULL,
  PRIMARY KEY  (`admin_id`),
  KEY `admin_role` (`admin_role`),
  CONSTRAINT `admins_ibfk_1` FOREIGN KEY (`admin_role`) REFERENCES `roles` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admins
-- ----------------------------
INSERT INTO `admins` VALUES ('1', 'admin', 'F3BD2C02D4088C840BF8F36C0781E770', '1');
INSERT INTO `admins` VALUES ('2', 'peter', 'F3BD2C02D4088C840BF8F36C0781E770', '2');
INSERT INTO `admins` VALUES ('3', 'sun', 'F3BD2C02D4088C840BF8F36C0781E770', '3');
INSERT INTO `admins` VALUES ('5', 'test', 'F3BD2C02D4088C840BF8F36C0781E770', '4');
INSERT INTO `admins` VALUES ('6', '孙老师', 'F3BD2C02D4088C840BF8F36C0781E770', '1');

-- ----------------------------
-- Table structure for collect
-- ----------------------------
DROP TABLE IF EXISTS `collect`;
CREATE TABLE `collect` (
  `collect_goods_id` int(11) NOT NULL,
  `collect_user_id` int(11) default NULL,
  KEY `collect_goods_id` (`collect_goods_id`),
  KEY `collect_user_id` (`collect_user_id`),
  CONSTRAINT `collect_ibfk_2` FOREIGN KEY (`collect_user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collect
-- ----------------------------

-- ----------------------------
-- Table structure for funs
-- ----------------------------
DROP TABLE IF EXISTS `funs`;
CREATE TABLE `funs` (
  `fun_id` int(11) NOT NULL auto_increment,
  `fun_name` varchar(200) default NULL,
  `fun_url` varchar(200) default NULL,
  `fun_pid` int(11) default NULL,
  `fun_target` varchar(20) default NULL,
  `fun_sort` int(11) default NULL,
  `fun_level` int(11) default NULL,
  PRIMARY KEY  (`fun_id`),
  KEY `fun_pid` (`fun_pid`),
  CONSTRAINT `funs_ibfk_1` FOREIGN KEY (`fun_pid`) REFERENCES `funs` (`fun_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of funs
-- ----------------------------
INSERT INTO `funs` VALUES ('1', '基础数据管理', null, null, null, '1000', '1');
INSERT INTO `funs` VALUES ('2', '订单管理', null, null, null, '2000', '1');
INSERT INTO `funs` VALUES ('3', '个人管理', null, null, null, '7000', '1');
INSERT INTO `funs` VALUES ('4', '商品维护', '/admin/goods/search.action', '1', 'I2', '1010', '2');
INSERT INTO `funs` VALUES ('5', '商品类型维护', '/admin/goodstype/search.action', '1', 'I2', '1020', '2');
INSERT INTO `funs` VALUES ('6', '未付款订单', '', '2', 'I2', '2010', '2');
INSERT INTO `funs` VALUES ('7', '待发货订单', '', '2', 'I2', '2020', '2');
INSERT INTO `funs` VALUES ('8', '退出', '/admin/exit.action', '3', '_top', '7010', '2');
INSERT INTO `funs` VALUES ('9', '全部订单', '', '2', 'I2', '2005', '2');
INSERT INTO `funs` VALUES ('11', '系统管理', null, null, null, '5000', '1');
INSERT INTO `funs` VALUES ('12', '功能管理', null, '11', 'I2', '5010', '2');
INSERT INTO `funs` VALUES ('13', '角色管理', null, '11', 'I2', '5020', '2');
INSERT INTO `funs` VALUES ('14', '权限管理', null, '11', 'I2', '5030', '2');
INSERT INTO `funs` VALUES ('15', '管理员管理', null, '11', 'I2', '5040', '2');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goods_id` int(11) NOT NULL auto_increment,
  `goods_name` varchar(200) default NULL,
  `goods_price` float default NULL,
  `goods_num` int(11) default NULL,
  `goods_img` varchar(200) default NULL,
  `goods_type_id` int(11) default NULL,
  `goods_create_time` datetime default NULL,
  `goods_priority` int(11) default NULL,
  `goods_detail` varchar(2000) default NULL,
  PRIMARY KEY  (`goods_id`),
  KEY `goods_type` (`goods_type_id`),
  CONSTRAINT `goods_ibfk_1` FOREIGN KEY (`goods_type_id`) REFERENCES `goods_type` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='InnoDB free: 3072 kB; (`goods_type`) REFER `no8/goods_type`(';

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', 'Blackmores EPO月见草II', '2300', '65', 'pro2.png', '4', '2018-08-16 10:07:27', '10', null);
INSERT INTO `goods` VALUES ('2', 'Sukin苏芊 玫瑰果补湿日霜 ', '130', '96', 'pro1.png', '4', '2018-08-16 10:07:27', '10', null);
INSERT INTO `goods` VALUES ('3', 'Swisse 澳洲活力胶原蛋白液', '150', '98', 'pro3.png', '4', '2018-08-16 10:07:27', '10', null);
INSERT INTO `goods` VALUES ('4', 'Doppelherz 双心 补充毛囊防脱头发营养胶囊', '159', '95', 'pro4.png', '4', '2018-08-16 10:07:27', '10', null);
INSERT INTO `goods` VALUES ('5', 'Swisse 发肤甲润泽口服液', '209', '99', 'pro5.png', '5', '2018-08-16 10:07:27', '10', null);
INSERT INTO `goods` VALUES ('6', 'GNC 健安喜 女性胶原蛋白营养片', '115', '100', 'pro6.png', '5', '2018-08-16 10:07:27', '10', null);
INSERT INTO `goods` VALUES ('7', 'HECH赫熙纯天然鱼子酱胶原蛋白肽粉胶囊', '200', '100', 'pro7.png', '5', '2018-08-16 10:07:27', '10', null);
INSERT INTO `goods` VALUES ('8', 'EltaMD 氨基酸泡沫卸妆洁面乳', '119', '100', 'pro21.png', '4', '2018-08-16 10:07:27', '10', null);
INSERT INTO `goods` VALUES ('9', 'Freeplus 芙丽芳丝 净润洗面霜 ', '108', '100', 'pro21.png', '4', '2018-08-16 10:07:27', '5', null);
INSERT INTO `goods` VALUES ('11', 'Freeplus 芙丽芳丝 净润洗面霜', '99', '99', 'pro21.png', '4', '2018-08-16 10:07:27', '10', null);
INSERT INTO `goods` VALUES ('15', 'Kanebo 佳丽宝 Suisai药用酵母酵素洗颜粉', '115', '100', 'pro21.png', '4', '2018-08-16 10:07:27', '10', null);
INSERT INTO `goods` VALUES ('17', '【3件装】Freeplus 芙丽芳丝 净润洗面霜', '289', '100', 'pro21.png', '11', '2018-08-16 10:07:27', '10', null);
INSERT INTO `goods` VALUES ('19', '测试', '1.1112e+006', '1', '0baf35a3bd8b4791bc5e37f9895bd0ea.png', '7', '2020-09-03 16:22:00', '100', null);
INSERT INTO `goods` VALUES ('20', '商品211', '9.1112e+006', '111111', '449815d6d7c94ec4a24db491c1aa78fa.png', '5', '2020-09-03 16:22:00', '100', null);
INSERT INTO `goods` VALUES ('21', 'a', '1', '1', '1', '1', '2020-09-03 15:32:28', '1', null);

-- ----------------------------
-- Table structure for goods_img
-- ----------------------------
DROP TABLE IF EXISTS `goods_img`;
CREATE TABLE `goods_img` (
  `img_id` int(11) NOT NULL auto_increment,
  `img_path` varchar(200) default NULL,
  `img_goods` int(11) default NULL,
  PRIMARY KEY  (`img_id`),
  KEY `img_goods` (`img_goods`),
  CONSTRAINT `goods_img_ibfk_1` FOREIGN KEY (`img_goods`) REFERENCES `goods` (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods_img
-- ----------------------------

-- ----------------------------
-- Table structure for goods_type
-- ----------------------------
DROP TABLE IF EXISTS `goods_type`;
CREATE TABLE `goods_type` (
  `type_id` int(11) NOT NULL auto_increment,
  `type_name` varchar(20) default NULL,
  `type_pid` int(11) default NULL,
  `type_level` int(11) default NULL,
  `type_path` varchar(200) default NULL,
  PRIMARY KEY  (`type_id`),
  KEY `type_pid` (`type_pid`),
  CONSTRAINT `goods_type_ibfk_1` FOREIGN KEY (`type_pid`) REFERENCES `goods_type` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods_type
-- ----------------------------
INSERT INTO `goods_type` VALUES ('1', '护肤', null, '1', '|1|');
INSERT INTO `goods_type` VALUES ('2', '个人洗护', null, '1', '|2|');
INSERT INTO `goods_type` VALUES ('3', '健康生活', null, '1', '|3|');
INSERT INTO `goods_type` VALUES ('4', '面部洗护', '1', '2', '|1||4|');
INSERT INTO `goods_type` VALUES ('5', '眼部护理', '1', '2', '|1||5|');
INSERT INTO `goods_type` VALUES ('6', '唇部护理', '1', '2', '|1||6|');
INSERT INTO `goods_type` VALUES ('7', '祛斑祛痘', '1', '2', '|1||7|');
INSERT INTO `goods_type` VALUES ('8', '手足洗护', '1', '2', '|1||8|');
INSERT INTO `goods_type` VALUES ('9', '眼部护理', '1', '2', '|1||9|');
INSERT INTO `goods_type` VALUES ('10', '防晒修复', '1', '2', '|1||10|');
INSERT INTO `goods_type` VALUES ('11', '沐浴护肤', '2', '2', '|2||11|');
INSERT INTO `goods_type` VALUES ('12', '洗发护发', '2', '2', '|2||12|');
INSERT INTO `goods_type` VALUES ('13', '口腔护理', '2', '2', '|2||13|');
INSERT INTO `goods_type` VALUES ('14', '消毒液', '3', '2', '|3||14|');
INSERT INTO `goods_type` VALUES ('15', '洗洁精', '3', '2', '|3||15|');

-- ----------------------------
-- Table structure for order_detail
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail` (
  `detail_id` int(11) NOT NULL auto_increment,
  `detail_order` varchar(32) default NULL,
  `detail_goods` int(11) default NULL,
  `detail_price` float default NULL,
  `detail_num` int(11) default NULL,
  PRIMARY KEY  (`detail_id`),
  KEY `detail_order` (`detail_order`),
  KEY `detail_goods` (`detail_goods`),
  CONSTRAINT `order_detail_ibfk_1` FOREIGN KEY (`detail_order`) REFERENCES `orders` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_detail
-- ----------------------------
INSERT INTO `order_detail` VALUES ('21', '5342ecb3780d4a6bbad7d9463f32f0c3', '17', '289', '2');
INSERT INTO `order_detail` VALUES ('22', '5342ecb3780d4a6bbad7d9463f32f0c3', '5', '209', '1');
INSERT INTO `order_detail` VALUES ('23', '5342ecb3780d4a6bbad7d9463f32f0c3', '7', '200', '1');
INSERT INTO `order_detail` VALUES ('24', '5342ecb3780d4a6bbad7d9463f32f0c3', '4', '159', '1');
INSERT INTO `order_detail` VALUES ('25', '874960aba95b41fdbe7fe2d99f7a3fcf', '1', '2300', '1');
INSERT INTO `order_detail` VALUES ('26', '874960aba95b41fdbe7fe2d99f7a3fcf', '5', '209', '1');
INSERT INTO `order_detail` VALUES ('27', '7212c2423c8d4eab9c85a08ca39086fc', '5', '209', '1');
INSERT INTO `order_detail` VALUES ('28', 'ab3c873690564c9889a75847afebeda7', '1', '2300', '1');
INSERT INTO `order_detail` VALUES ('29', 'f8ee7807a48e497784ebae3a8f6509df', '1', '2300', '2');
INSERT INTO `order_detail` VALUES ('30', 'f8ee7807a48e497784ebae3a8f6509df', '2', '130', '2');
INSERT INTO `order_detail` VALUES ('31', 'f8ee7807a48e497784ebae3a8f6509df', '4', '159', '1');
INSERT INTO `order_detail` VALUES ('32', '27c15f37daa34a32a0e258e34e9758aa', '1', '2300', '10');
INSERT INTO `order_detail` VALUES ('33', '27c15f37daa34a32a0e258e34e9758aa', '2', '130', '1');
INSERT INTO `order_detail` VALUES ('34', '27c15f37daa34a32a0e258e34e9758aa', '4', '159', '1');
INSERT INTO `order_detail` VALUES ('35', '5f4cc461decf4618b75fea196c8d3b6c', '1', '2300', '1');
INSERT INTO `order_detail` VALUES ('36', '5f4cc461decf4618b75fea196c8d3b6c', '1', '2300', '1');
INSERT INTO `order_detail` VALUES ('37', '5f4cc461decf4618b75fea196c8d3b6c', '11', '99', '1');
INSERT INTO `order_detail` VALUES ('38', '2af47f6d9af0429b9c34055902c188ec', '1', '2300', '9');
INSERT INTO `order_detail` VALUES ('39', '2af47f6d9af0429b9c34055902c188ec', '5', '209', '1');
INSERT INTO `order_detail` VALUES ('40', 'bd298a3e581842beb6b2e707e5fbc36f', '1', '2300', '9');
INSERT INTO `order_detail` VALUES ('41', 'fb2f21d1d0864eb49a7a015a56d42f46', '1', '2300', '9');
INSERT INTO `order_detail` VALUES ('42', 'fb2f21d1d0864eb49a7a015a56d42f46', '5', '209', '1');
INSERT INTO `order_detail` VALUES ('43', 'b3b9286ba84146e1ab1838842b4714c7', '1', '2300', '1');
INSERT INTO `order_detail` VALUES ('44', 'b3b9286ba84146e1ab1838842b4714c7', '2', '130', '1');
INSERT INTO `order_detail` VALUES ('45', '712052628f00468088fa664608a66b61', '1', '2300', '12');
INSERT INTO `order_detail` VALUES ('46', 'ac622710972447028332b16f34927e4b', '3', '150', '1');
INSERT INTO `order_detail` VALUES ('47', 'ac622710972447028332b16f34927e4b', '4', '159', '1');
INSERT INTO `order_detail` VALUES ('48', 'ac622710972447028332b16f34927e4b', '4', '159', '1');
INSERT INTO `order_detail` VALUES ('49', '5d0d08a2603d4429a19f52f1365ad932', '4', '159', '1');
INSERT INTO `order_detail` VALUES ('50', '8d355eb0f38f425eb7a38fc6867a7b29', '3', '150', '1');

-- ----------------------------
-- Table structure for order_recipients
-- ----------------------------
DROP TABLE IF EXISTS `order_recipients`;
CREATE TABLE `order_recipients` (
  `recipients_id` int(11) NOT NULL auto_increment,
  `recipients_name` varchar(200) default NULL,
  `recipients_address` varchar(200) default NULL,
  `recipients_phone` varchar(20) default NULL,
  `recipients_user` int(11) default NULL,
  `recipients_checked` int(11) default NULL,
  PRIMARY KEY  (`recipients_id`),
  KEY `recipients_user` (`recipients_user`),
  CONSTRAINT `order_recipients_ibfk_1` FOREIGN KEY (`recipients_user`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_recipients
-- ----------------------------
INSERT INTO `order_recipients` VALUES ('1', '西施', '春秋末期出生于越国苎萝村(今浙江省诸暨市苎萝村)', '158XXXX8793', '1', '1');
INSERT INTO `order_recipients` VALUES ('2', '王昭君', '西汉南郡秭归(今湖北省宜昌市兴山县)', '137XXXX5762', '1', '0');
INSERT INTO `order_recipients` VALUES ('3', '貂蝉', '东汉末年洛阳王司徒府', '185XXXX3344', '1', '0');
INSERT INTO `order_recipients` VALUES ('4', '杨玉环', '虢州阌乡(今河南灵宝)', '187XXXX3232', '1', '0');

-- ----------------------------
-- Table structure for order_status
-- ----------------------------
DROP TABLE IF EXISTS `order_status`;
CREATE TABLE `order_status` (
  `order_status_id` int(11) NOT NULL auto_increment,
  `order_status_name` varchar(200) default NULL,
  PRIMARY KEY  (`order_status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_status
-- ----------------------------
INSERT INTO `order_status` VALUES ('1', '报关中');
INSERT INTO `order_status` VALUES ('2', '报关成功，待付款');
INSERT INTO `order_status` VALUES ('3', '付款成功，待发货');
INSERT INTO `order_status` VALUES ('4', '已发货');
INSERT INTO `order_status` VALUES ('5', '交易成功');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `order_id` varchar(32) NOT NULL,
  `order_user` int(11) default NULL,
  `order_address` varchar(200) default NULL,
  `order_phone` varchar(11) default NULL,
  `order_name` varchar(20) default NULL,
  `order_status` int(11) default NULL,
  `order_price` float default NULL,
  `order_time` timestamp NULL default NULL,
  PRIMARY KEY  (`order_id`),
  KEY `order_user` (`order_user`),
  KEY `order_status` (`order_status`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`order_user`) REFERENCES `users` (`user_id`),
  CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`order_status`) REFERENCES `order_status` (`order_status_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('27c15f37daa34a32a0e258e34e9758aa', '1', '东汉末年洛阳王司徒府', '185XXXX3344', '貂蝉', '1', '23289', '2018-08-23 11:32:15');
INSERT INTO `orders` VALUES ('2af47f6d9af0429b9c34055902c188ec', '1', '春秋末期出生于越国苎萝村(今浙江省诸暨市苎萝村)', '158XXXX8793', '西施', '1', '20909', '2018-08-23 11:32:49');
INSERT INTO `orders` VALUES ('5342ecb3780d4a6bbad7d9463f32f0c3', '1', '东汉末年洛阳王司徒府', '185XXXX3344', '貂蝉', '3', '1146', '2018-03-22 10:18:12');
INSERT INTO `orders` VALUES ('5d0d08a2603d4429a19f52f1365ad932', '1', '春秋末期出生于越国苎萝村(今浙江省诸暨市苎萝村)', '158XXXX8793', '西施', '3', '159', '2018-08-23 13:52:13');
INSERT INTO `orders` VALUES ('5f4cc461decf4618b75fea196c8d3b6c', '1', '西汉南郡秭归(今湖北省宜昌市兴山县)', '137XXXX5762', '王昭君', '1', '4699', '2018-08-23 11:32:24');
INSERT INTO `orders` VALUES ('712052628f00468088fa664608a66b61', '1', '春秋末期出生于越国苎萝村(今浙江省诸暨市苎萝村)', '158XXXX8793', '西施', '1', '27600', '2018-08-23 11:33:38');
INSERT INTO `orders` VALUES ('7212c2423c8d4eab9c85a08ca39086fc', '1', '虢州阌乡(今河南灵宝)', '187XXXX3232', '杨玉环', '1', '209', '2018-03-22 14:59:47');
INSERT INTO `orders` VALUES ('874960aba95b41fdbe7fe2d99f7a3fcf', '1', '西汉南郡秭归(今湖北省宜昌市兴山县)', '137XXXX5762', '王昭君', '1', '2509', '2018-03-22 10:22:29');
INSERT INTO `orders` VALUES ('8d355eb0f38f425eb7a38fc6867a7b29', '1', '西汉南郡秭归(今湖北省宜昌市兴山县)', '137XXXX5762', '王昭君', '2', '165', '2018-08-23 13:53:55');
INSERT INTO `orders` VALUES ('ab3c873690564c9889a75847afebeda7', '1', '西汉南郡秭归(今湖北省宜昌市兴山县)', '137XXXX5762', '王昭君', '5', '2300', '2018-03-22 15:02:05');
INSERT INTO `orders` VALUES ('ac622710972447028332b16f34927e4b', '1', '东汉末年洛阳王司徒府', '185XXXX3344', '貂蝉', '3', '468', '2018-08-23 11:38:44');
INSERT INTO `orders` VALUES ('b3b9286ba84146e1ab1838842b4714c7', '1', '春秋末期出生于越国苎萝村(今浙江省诸暨市苎萝村)', '158XXXX8793', '西施', '1', '2430', '2018-08-23 11:32:58');
INSERT INTO `orders` VALUES ('bd298a3e581842beb6b2e707e5fbc36f', '1', '西汉南郡秭归(今湖北省宜昌市兴山县)', '137XXXX5762', '王昭君', '1', '20700', '2018-08-23 11:32:51');
INSERT INTO `orders` VALUES ('f8ee7807a48e497784ebae3a8f6509df', '1', '虢州阌乡(今河南灵宝)', '187XXXX3232', '杨玉环', '1', '5019', '2018-08-22 17:32:30');
INSERT INTO `orders` VALUES ('fb2f21d1d0864eb49a7a015a56d42f46', '1', '西汉南郡秭归(今湖北省宜昌市兴山县)', '137XXXX5762', '王昭君', '1', '20909', '2018-08-23 11:32:53');

-- ----------------------------
-- Table structure for permissions
-- ----------------------------
DROP TABLE IF EXISTS `permissions`;
CREATE TABLE `permissions` (
  `permission_role` int(11) default NULL,
  `permission_fun` int(11) default NULL,
  KEY `permission_role` (`permission_role`),
  KEY `permission_fun` (`permission_fun`),
  CONSTRAINT `permissions_ibfk_1` FOREIGN KEY (`permission_role`) REFERENCES `roles` (`role_id`),
  CONSTRAINT `permissions_ibfk_2` FOREIGN KEY (`permission_fun`) REFERENCES `funs` (`fun_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permissions
-- ----------------------------
INSERT INTO `permissions` VALUES ('1', '3');
INSERT INTO `permissions` VALUES ('2', '1');
INSERT INTO `permissions` VALUES ('2', '3');
INSERT INTO `permissions` VALUES ('3', '2');
INSERT INTO `permissions` VALUES ('3', '3');
INSERT INTO `permissions` VALUES ('1', '11');
INSERT INTO `permissions` VALUES ('4', '1');
INSERT INTO `permissions` VALUES ('4', '2');
INSERT INTO `permissions` VALUES ('4', '3');
INSERT INTO `permissions` VALUES ('4', '11');

-- ----------------------------
-- Table structure for roles
-- ----------------------------
DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles` (
  `role_id` int(11) NOT NULL auto_increment,
  `role_name` varchar(20) default NULL,
  PRIMARY KEY  (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of roles
-- ----------------------------
INSERT INTO `roles` VALUES ('1', '超级管理员');
INSERT INTO `roles` VALUES ('2', '基础数据管理员');
INSERT INTO `roles` VALUES ('3', '订单管理员');
INSERT INTO `roles` VALUES ('4', '好用管理员');

-- ----------------------------
-- Table structure for shopitems
-- ----------------------------
DROP TABLE IF EXISTS `shopitems`;
CREATE TABLE `shopitems` (
  `item_id` int(11) NOT NULL auto_increment,
  `item_goods` int(11) default NULL,
  `item_num` int(11) default NULL,
  `item_user` int(11) default NULL,
  PRIMARY KEY  (`item_id`),
  KEY `item_user` (`item_user`),
  KEY `item_goods` (`item_goods`),
  CONSTRAINT `shopitems_ibfk_1` FOREIGN KEY (`item_user`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shopitems
-- ----------------------------

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `user_id` int(11) NOT NULL auto_increment,
  `user_name` varchar(20) default NULL,
  `user_pass` varchar(32) default NULL,
  `user_address` varchar(200) default NULL,
  `user_phone` varchar(11) default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'peter', '123456', '北京市', '15810848579');
INSERT INTO `users` VALUES ('2', 'sun', '123456', '北京市', '15810848579');
INSERT INTO `users` VALUES ('3', 'puma', '123456', '北京市', '12345678901');
INSERT INTO `users` VALUES ('5', '老张', '123456', '北京市', '13298309999');
INSERT INTO `users` VALUES ('6', 'MI2', '123456', '北京市', '158XXXX1084');
INSERT INTO `users` VALUES ('7', '王五', '098098', '北京市', '1238676');
INSERT INTO `users` VALUES ('8', 'qq', 'qqbugouchang', '北京市', 'qq');
INSERT INTO `users` VALUES ('9', 'yuketang', 'C7YVQ', '北京市', '158XXXX7412');
