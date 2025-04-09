/*
SQLyog Ultimate v8.32 
MySQL - 5.5.27 : Database - db89
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db89` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `db89`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `balance` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `account` */

insert  into `account`(`id`,`username`,`balance`) values (1,'张三',1000);
insert  into `account`(`id`,`username`,`balance`) values (2,'李四',1000);

/*Table structure for table `t_customer` */

DROP TABLE IF EXISTS `t_customer`;

CREATE TABLE `t_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `username` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户名',
  `jobs` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '工作',
  `phone` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '电话',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_customer` */

insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (1,'张三','教师','111');
insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (2,'娜扎','神话人物','123');
insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (3,'李四','学生','223');
insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (4,'李兰兰','学生','12345');
insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (5,'娜扎','神话人物','0377');
insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (6,'娜扎2','神话人物2','0378');

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_code` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户账号',
  `user_name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户名称',
  `user_password` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '密码',
  `user_state` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_user` */

insert  into `t_user`(`user_id`,`user_code`,`user_name`,`user_password`,`user_state`) values (1,'001','张明兰','123','1');
insert  into `t_user`(`user_id`,`user_code`,`user_name`,`user_password`,`user_state`) values (2,'002','李光鸣','123','1');
insert  into `t_user`(`user_id`,`user_code`,`user_name`,`user_password`,`user_state`) values (3,'003','黄海','123','1');

/*Table structure for table `tb_book` */

DROP TABLE IF EXISTS `tb_book`;

CREATE TABLE `tb_book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bookname` varchar(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `author` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `tb_book` */

insert  into `tb_book`(`id`,`bookname`,`price`,`author`) values (1,'Java',45.8,'黑马');
insert  into `tb_book`(`id`,`bookname`,`price`,`author`) values (2,'ssm',356,'黑马');
insert  into `tb_book`(`id`,`bookname`,`price`,`author`) values (4,'数据库',23.4,'qinghua');
insert  into `tb_book`(`id`,`bookname`,`price`,`author`) values (5,'数据库',23.4,'qinghua');
insert  into `tb_book`(`id`,`bookname`,`price`,`author`) values (6,'MySQL数据库',NULL,NULL);
insert  into `tb_book`(`id`,`bookname`,`price`,`author`) values (7,'MySQL数据库',NULL,NULL);
insert  into `tb_book`(`id`,`bookname`,`price`,`author`) values (9,'MySQL数据库',NULL,NULL);
insert  into `tb_book`(`id`,`bookname`,`price`,`author`) values (10,'MySQL数据库',NULL,NULL);
insert  into `tb_book`(`id`,`bookname`,`price`,`author`) values (11,'数据结构',NULL,NULL);

/*Table structure for table `tb_idcard` */

DROP TABLE IF EXISTS `tb_idcard`;

CREATE TABLE `tb_idcard` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `tb_idcard` */

insert  into `tb_idcard`(`id`,`code`,`address`) values (1,'152221198711020624','河南');
insert  into `tb_idcard`(`id`,`code`,`address`) values (3,'152201199008150317','北京');

/*Table structure for table `tb_orders` */

DROP TABLE IF EXISTS `tb_orders`;

CREATE TABLE `tb_orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_tb_orders` (`user_id`),
  CONSTRAINT `FK_tb_orders` FOREIGN KEY (`user_id`) REFERENCES `tb_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `tb_orders` */

insert  into `tb_orders`(`id`,`number`,`user_id`) values (1,'1000011',1);
insert  into `tb_orders`(`id`,`number`,`user_id`) values (2,'1000012',2);
insert  into `tb_orders`(`id`,`number`,`user_id`) values (3,'1000013',2);
insert  into `tb_orders`(`id`,`number`,`user_id`) values (4,'1000015',1);
insert  into `tb_orders`(`id`,`number`,`user_id`) values (5,'1000016',2);

/*Table structure for table `tb_ordersitem` */

DROP TABLE IF EXISTS `tb_ordersitem`;

CREATE TABLE `tb_ordersitem` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `orders_id` int(32) DEFAULT NULL,
  `product_id` int(32) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_tb_ordersitem` (`product_id`),
  KEY `FK_tb_ordersitem2` (`orders_id`),
  CONSTRAINT `FK_tb_ordersitem2` FOREIGN KEY (`orders_id`) REFERENCES `tb_orders` (`id`),
  CONSTRAINT `FK_tb_ordersitem` FOREIGN KEY (`product_id`) REFERENCES `tb_product` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `tb_ordersitem` */

insert  into `tb_ordersitem`(`id`,`orders_id`,`product_id`) values (1,1,1);
insert  into `tb_ordersitem`(`id`,`orders_id`,`product_id`) values (2,1,3);
insert  into `tb_ordersitem`(`id`,`orders_id`,`product_id`) values (3,1,5);
insert  into `tb_ordersitem`(`id`,`orders_id`,`product_id`) values (4,2,1);
insert  into `tb_ordersitem`(`id`,`orders_id`,`product_id`) values (5,2,2);

/*Table structure for table `tb_person` */

DROP TABLE IF EXISTS `tb_person`;

CREATE TABLE `tb_person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(1) COLLATE utf8_unicode_ci DEFAULT '男',
  `card_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `card_id` (`card_id`),
  CONSTRAINT `FK_tb_person` FOREIGN KEY (`card_id`) REFERENCES `tb_idcard` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `tb_person` */

insert  into `tb_person`(`id`,`name`,`age`,`sex`,`card_id`) values (1,'张三',20,'男',1);
insert  into `tb_person`(`id`,`name`,`age`,`sex`,`card_id`) values (2,'李四',18,'女',3);

/*Table structure for table `tb_product` */

DROP TABLE IF EXISTS `tb_product`;

CREATE TABLE `tb_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(32) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `tb_product` */

insert  into `tb_product`(`id`,`NAME`,`price`) values (1,'电视机',5000);
insert  into `tb_product`(`id`,`NAME`,`price`) values (2,'冰箱',4000);
insert  into `tb_product`(`id`,`NAME`,`price`) values (3,'空调',3000);
insert  into `tb_product`(`id`,`NAME`,`price`) values (4,'洗衣机',2000);
insert  into `tb_product`(`id`,`NAME`,`price`) values (5,'电脑',6000);
insert  into `tb_product`(`id`,`NAME`,`price`) values (6,'Java基础入门',44.5);
insert  into `tb_product`(`id`,`NAME`,`price`) values (10,'4545',NULL);

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `tb_user` */

insert  into `tb_user`(`id`,`username`,`address`) values (1,'小明','北京');
insert  into `tb_user`(`id`,`username`,`address`) values (2,'李华','上海');
insert  into `tb_user`(`id`,`username`,`address`) values (3,'李刚','上海');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `uname` varchar(20) COLLATE utf8_unicode_ci NOT NULL COMMENT '姓名',
  `uage` int(11) DEFAULT NULL COMMENT '年龄',
  `user_name` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `users` */

insert  into `users`(`uid`,`uname`,`uage`,`user_name`) values (1,'黑马程序员',30,'aa');
insert  into `users`(`uid`,`uname`,`uage`,`user_name`) values (2,'哪吒',3,'bb');
insert  into `users`(`uid`,`uname`,`uage`,`user_name`) values (3,'木吒',20,NULL);
insert  into `users`(`uid`,`uname`,`uage`,`user_name`) values (4,'木吒',20,NULL);
insert  into `users`(`uid`,`uname`,`uage`,`user_name`) values (6,'丽丽',NULL,NULL);
insert  into `users`(`uid`,`uname`,`uage`,`user_name`) values (9,'金吒',30,NULL);
insert  into `users`(`uid`,`uname`,`uage`,`user_name`) values (11,'金吒',30,NULL);
insert  into `users`(`uid`,`uname`,`uage`,`user_name`) values (12,'金吒',30,NULL);
insert  into `users`(`uid`,`uname`,`uage`,`user_name`) values (13,'金吒',30,NULL);
insert  into `users`(`uid`,`uname`,`uage`,`user_name`) values (14,'金吒',30,NULL);
insert  into `users`(`uid`,`uname`,`uage`,`user_name`) values (15,'金吒',30,NULL);
insert  into `users`(`uid`,`uname`,`uage`,`user_name`) values (16,'金吒',30,NULL);

/*Table structure for table `usersnonincrement` */

DROP TABLE IF EXISTS `usersnonincrement`;

CREATE TABLE `usersnonincrement` (
  `uid` int(11) NOT NULL,
  `uname` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `uage` int(11) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `usersnonincrement` */

insert  into `usersnonincrement`(`uid`,`uname`,`uage`) values (1,'木吒',20);
insert  into `usersnonincrement`(`uid`,`uname`,`uage`) values (2,'丽丽',NULL);
insert  into `usersnonincrement`(`uid`,`uname`,`uage`) values (3,'哪吒',20);
insert  into `usersnonincrement`(`uid`,`uname`,`uage`) values (4,'哪吒',20);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
