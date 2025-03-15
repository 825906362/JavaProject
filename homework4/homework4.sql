/*
SQLyog Ultimate v8.32 
MySQL - 5.5.27 : Database - homework4
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`homework4` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `homework4`;

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `category` */

insert  into `category`(`type_id`,`type_name`) values (1,'黑色家电');
insert  into `category`(`type_id`,`type_name`) values (2,'白色家电');

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `goods_id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `type_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`goods_id`),
  KEY `FK_product` (`type_id`),
  CONSTRAINT `FK_product` FOREIGN KEY (`type_id`) REFERENCES `category` (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `product` */

insert  into `product`(`goods_id`,`goods_name`,`price`,`type_id`) values (1,'电视机',5000,1);
insert  into `product`(`goods_id`,`goods_name`,`price`,`type_id`) values (2,'冰箱',4000,2);
insert  into `product`(`goods_id`,`goods_name`,`price`,`type_id`) values (3,'空调',3000,2);
insert  into `product`(`goods_id`,`goods_name`,`price`,`type_id`) values (4,'洗衣机',2000,2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
