/*
SQLyog Community v13.1.7 (64 bit)
MySQL - 8.0.31 : Database - pixiv
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`pixiv` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `pixiv`;

/*Table structure for table `card` */

DROP TABLE IF EXISTS `card`;

CREATE TABLE `card` (
  `card_id` int NOT NULL AUTO_INCREMENT,
  `card_type` varchar(25) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `card_title` varchar(25) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `card_img` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `card_content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci,
  `card_time` datetime DEFAULT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`card_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `card_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `card` */

insert  into `card`(`card_id`,`card_type`,`card_title`,`card_img`,`card_content`,`card_time`,`user_id`) values 
(1,'生活品味','中国人必须知道的常识','VCG41N1303010726.jpg','321','2025-04-25 19:51:19',1),
(2,'美食','大盘鸡','VCG211313709971.jpg','123','2025-04-25 22:44:28',1),
(3,'美食','牛角包的制作','VCG41N2193319722.jpg','12345','2025-04-25 23:09:51',2),
(9,'旅行','旅行必备','av.jpg','75757865786','2025-04-26 00:56:00',1),
(10,'电子竞技','电子竞技菜就多练','VCG41N1409046652.jpg','你好','2025-04-26 00:59:00',1),
(12,'电子竞技','电子竞技菜就多练',NULL,'','2025-04-27 02:01:00',3);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_code` varchar(25) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `user_name` varchar(25) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `user_password` varchar(25) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `user_state` varchar(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `user` */

insert  into `user`(`user_id`,`user_code`,`user_name`,`user_password`,`user_state`) values 
(1,'001','曲冠豪','123','男'),
(2,'002','小明','123','男'),
(3,'003','小红','123','女'),
(4,'曲冠豪','曲冠豪','123','男');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
