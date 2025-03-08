/*
SQLyog Community v13.1.7 (64 bit)
MySQL - 8.0.31 : Database - homework3
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`homework3` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `homework3`;

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `student_name` varchar(50) NOT NULL COMMENT '学生姓名',
  `major` varchar(50) DEFAULT NULL COMMENT '所属专业',
  `student_number` varchar(20) NOT NULL COMMENT '学号(唯一)',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  KEY `idx_student_name` (`student_name`),
  KEY `idx_major` (`major`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='学生信息表';

/*Data for the table `student` */

insert  into `student`(`id`,`student_name`,`major`,`student_number`,`create_time`,`update_time`) values 
(1,'李白','软工','235606','2025-03-08 17:49:49','2025-03-08 18:06:18'),
(2,'张三','软件工程','2023001','2025-03-08 18:06:06','2025-03-08 18:06:06'),
(3,'李四','计算机科学','2023002','2025-03-08 18:06:06','2025-03-08 18:06:06'),
(4,'王五','人软','2023003','2025-03-08 18:06:06','2025-03-08 18:06:30'),
(5,'批量1','CS','S2024001','2025-03-08 18:23:50','2025-03-08 18:23:50'),
(6,'批量2',NULL,'S2024002','2025-03-08 18:23:50','2025-03-08 18:23:50'),
(7,'批量3','Math','S2024003','2025-03-08 18:23:50','2025-03-08 18:23:50'),
(11,'批量1','CS','S2024001','2025-03-08 18:35:18','2025-03-08 18:35:18'),
(12,'批量2',NULL,'S2024002','2025-03-08 18:35:18','2025-03-08 18:35:18'),
(13,'批量3','Math','S2024003','2025-03-08 18:35:18','2025-03-08 18:35:18'),
(14,'批量1','CS','S2024001','2025-03-08 18:53:08','2025-03-08 18:53:08'),
(15,'批量2',NULL,'S2024002','2025-03-08 18:53:08','2025-03-08 18:53:08'),
(16,'批量3','Math','S2024003','2025-03-08 18:53:08','2025-03-08 18:53:08');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
