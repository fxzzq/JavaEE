/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50514
Source Host           : localhost:3306
Source Database       : student_select_course

Target Server Type    : MYSQL
Target Server Version : 50514
File Encoding         : 65001

Date: 2013-04-13 17:23:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `clspnt` varchar(255) DEFAULT NULL,
  `cname` varchar(255) DEFAULT NULL,
  `count` int(11) NOT NULL,
  `grdName` varchar(255) DEFAULT NULL,
  `pfsName` varchar(255) DEFAULT NULL,
  `point` int(11) NOT NULL,
  `teacher` varchar(255) DEFAULT NULL,
  `wk` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('6', '教学楼A栋 A111', '五', 'Database Design', '500', '大二', '软件工程', '2', '吴天锡', '星期一');
INSERT INTO `course` VALUES ('7', '教学楼D栋 D3123', '二', 'Design Dodel', '500', '大三', '软件工程', '4', '霍元甲', '星期二');
INSERT INTO `course` VALUES ('10', '教学楼A栋 A4222', '四', 'Java ME', '500', '大四', '通讯工程', '5', '李元芳', '星期三');
INSERT INTO `course` VALUES ('11', '教学楼B栋 B311', '六', 'Based on Java', '500', '大三', '软件工程', '3', '熊阔海', '星期四');
INSERT INTO `course` VALUES ('12', '教学楼H栋 H1121', '七', 'Java EE', '500', '大三', '软件工程', '3', '大刀王五', '星期二');

-- ----------------------------
-- Table structure for `manager`
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `mid` int(11) NOT NULL,
  `mname` varchar(255) DEFAULT NULL,
  `mpassword` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES ('110', 'Really Go', 'ok');

-- ----------------------------
-- Table structure for `prefession`
-- ----------------------------
DROP TABLE IF EXISTS `prefession`;
CREATE TABLE `prefession` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `level` varchar(255) DEFAULT NULL,
  `pfsName` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of prefession
-- ----------------------------
INSERT INTO `prefession` VALUES ('1', '4', '软件工程', null);

-- ----------------------------
-- Table structure for `select_result`
-- ----------------------------
DROP TABLE IF EXISTS `select_result`;
CREATE TABLE `select_result` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of select_result
-- ----------------------------
INSERT INTO `select_result` VALUES ('1', 'English', 'Vector');
INSERT INTO `select_result` VALUES ('3', '操作系统', '周星驰');
INSERT INTO `select_result` VALUES ('4', 'Data Structure', '刘德华');
INSERT INTO `select_result` VALUES ('5', '会计学', '瑛姑');
INSERT INTO `select_result` VALUES ('6', 'C语言', '刘德华');
INSERT INTO `select_result` VALUES ('7', 'Based on Java', '孙悟空');
INSERT INTO `select_result` VALUES ('8', 'JavaEE', '猪八戒');
INSERT INTO `select_result` VALUES ('9', '管理经济学', '唐三藏');
INSERT INTO `select_result` VALUES ('10', '组织行为学', '朱贵');
INSERT INTO `select_result` VALUES ('11', '市场营销学', '李阳');
INSERT INTO `select_result` VALUES ('12', '企业战略管理', '欧阳峰');
INSERT INTO `select_result` VALUES ('16', 'Java Design patterns', '孙悟空');
INSERT INTO `select_result` VALUES ('17', '毛泽东思想概论', '孙悟空');
INSERT INTO `select_result` VALUES ('18', '数据库设计', '孙悟空');
INSERT INTO `select_result` VALUES ('19', 'Orcale', 'Test');
INSERT INTO `select_result` VALUES ('21', 'Oracle', 'xxyfhjl');
INSERT INTO `select_result` VALUES ('22', 'Orcale', 'Test');
INSERT INTO `select_result` VALUES ('28', 'Based on Java', 'xxyfhjl');
INSERT INTO `select_result` VALUES ('29', 'Design Dodel', 'xxyfhjl');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `grdName` varchar(255) DEFAULT NULL,
  `pfsName` varchar(255) DEFAULT NULL,
  `saddress` varchar(255) DEFAULT NULL,
  `sname` varchar(255) DEFAULT NULL,
  `spassword` varchar(255) DEFAULT NULL,
  `sxtp` varchar(255) DEFAULT NULL,
  `tel` int(11) NOT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('2', '大三', '软件工程', '青岛', 'xxyfhjl', '123', '男', '1687878748');
INSERT INTO `student` VALUES ('4', '大四', '电子商务', '北京', '高尔夫', 'gaoerfu', '女', '123465789');
INSERT INTO `student` VALUES ('6', '大四', '机械工程', '北京', '萧十一郎', 'xsyl', '男', '123456');
INSERT INTO `student` VALUES ('10', '大三', '体育系', '河南', '朱元璋', '123654', '男', '147852369');
INSERT INTO `student` VALUES ('16', '大二', '土木工程', '中文可以吗', '你好', 'nh', '男', '123');
INSERT INTO `student` VALUES ('17', '大一', '外语系', '中文可以吗', '测试一下', 'csyx', '男', '123');
INSERT INTO `student` VALUES ('18', '大四', '工商管理', '哈哈', '倒计时', 'djs', '男', '123');
INSERT INTO `student` VALUES ('20', '大三', '软件工程', '上海', '传说', 'zsw', '男', '1357894561');
INSERT INTO `student` VALUES ('21', '大一', '软件工程', '1', '1', '1', '男', '1');
INSERT INTO `student` VALUES ('22', '大二', '土木工程', '3', '2', '2', '男', '3');
INSERT INTO `student` VALUES ('23', '大三', '软件工程', '香港', '周星驰', 'love_myIdol', '男', '1687878748');
