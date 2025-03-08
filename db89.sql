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

/*Table structure for table `t_customer` */

DROP TABLE IF EXISTS `t_customer`;

CREATE TABLE `t_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `jobs` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `phone` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_customer` */

insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (1,'哪吒','神话任务','123345');
insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (2,'逆天','华语','123758');
insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (3,'李四','学生','138987');
insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (5,'张天佑','老师','129387');
insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (6,'哪吒','神话任务','0377');
insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (7,'nit','神话任务','0377');
insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (8,'哪吒','神话任务','0377');
insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (9,'nit','神话任务','0377');
insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (10,'哪吒','神话任务','0377');
insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (11,'哪吒','神话任务','0377');
insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (12,'nit','神话任务','0377');
insert  into `t_customer`(`id`,`username`,`jobs`,`phone`) values (13,'扬子',NULL,NULL);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `u_name` varchar(20) COLLATE utf8_unicode_ci NOT NULL COMMENT '姓名',
  `u_age` int(11) DEFAULT NULL COMMENT '年龄',
  `user_pass` int(11) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `user` */

insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (1,'黑马程序员',30,123);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (2,'传智播客',10,234);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (4,'杨幂',18,563);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (5,'小刚',14,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (6,'小刚',18,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (7,'小刚',16,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (9,'小刚1',17,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (11,'小刚1',18,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (17,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (18,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (19,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (20,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (21,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (22,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (23,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (24,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (25,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (26,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (27,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (28,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (29,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (30,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (31,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (32,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (33,'金吒',30,NULL);
insert  into `user`(`u_id`,`u_name`,`u_age`,`user_pass`) values (34,'金吒',30,NULL);

/*Table structure for table `user2345` */

DROP TABLE IF EXISTS `user2345`;

CREATE TABLE `user2345` (
  `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `uname` varchar(20) COLLATE utf8_unicode_ci NOT NULL COMMENT '姓名',
  `uage` int(11) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `user2345` */

insert  into `user2345`(`uid`,`uname`,`uage`) values (1,'扬子',20);
insert  into `user2345`(`uid`,`uname`,`uage`) values (2,'哪吒',3);

/*Table structure for table `usernozeng` */

DROP TABLE IF EXISTS `usernozeng`;

CREATE TABLE `usernozeng` (
  `uid` int(11) NOT NULL,
  `uname` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `uage` int(11) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `usernozeng` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
