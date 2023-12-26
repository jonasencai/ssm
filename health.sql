/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 8.0.34 : Database - healthdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`healthdb` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `healthdb`;

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `stuid` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `tittle1` varchar(255) DEFAULT NULL,
  `reporter` varchar(255) DEFAULT NULL,
  `tittle2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `comment` */

insert  into `comment`(`id`,`stuid`,`username`,`date`,`tittle1`,`reporter`,`tittle2`) values 
(1,'20231014','张三三','2023-10-18','心情不好1',NULL,NULL),
(2,'20231015','王菲','2023-10-19','考试没考好','王菲','加油，下次一定2'),
(3,'20231014','张三三','2023-10-18','87945664',NULL,NULL),
(6,'20231014','张三三','2023-10-19','难受，想哭','王菲','别哭了'),
(7,'20231024','王五','2023-10-24','最近压力好大，难受','李可','压力大，需要就医');

/*Table structure for table `healthcode` */

DROP TABLE IF EXISTS `healthcode`;

CREATE TABLE `healthcode` (
  `id` int NOT NULL AUTO_INCREMENT,
  `healthstatus` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `score` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `healthcode` */

insert  into `healthcode`(`id`,`healthstatus`,`score`) values 
(1,'非常健康',30),
(2,'挺健康的',40),
(3,'有点严重',50),
(4,'非常严重',60),
(5,'心态非常好',20),
(6,'最健康的娃',0);

/*Table structure for table `healthstatus` */

DROP TABLE IF EXISTS `healthstatus`;

CREATE TABLE `healthstatus` (
  `id` int NOT NULL AUTO_INCREMENT,
  `stuid` varchar(255) DEFAULT NULL,
  `illid` int DEFAULT NULL,
  `sportid` int DEFAULT NULL,
  `pexaminationid` int DEFAULT NULL,
  `lifeid` int DEFAULT NULL,
  `questionscoreid` int DEFAULT NULL,
  `date` varchar(255) NOT NULL,
  `suggestion` varchar(255) DEFAULT NULL,
  `healthscore` int DEFAULT NULL,
  `healthstatus` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`,`date`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `healthstatus` */

insert  into `healthstatus`(`id`,`stuid`,`illid`,`sportid`,`pexaminationid`,`lifeid`,`questionscoreid`,`date`,`suggestion`,`healthscore`,`healthstatus`) values 
(9,'20231014',4,2,5,12,21,'2023-10-23','继续保持',15,'最健康的娃'),
(10,'20231015',0,0,0,0,22,'2023-10-23',NULL,0,NULL),
(11,'20231019',0,0,0,0,23,'2023-10-23',NULL,0,NULL),
(13,'20231024',5,5,7,15,25,'2023-10-24','多多努力',20,'最健康的娃'),
(14,'20231024',5,5,7,15,26,'2023-10-30','最近压力很大呀',30,'心态非常好');

/*Table structure for table `ill` */

DROP TABLE IF EXISTS `ill`;

CREATE TABLE `ill` (
  `id` int NOT NULL AUTO_INCREMENT,
  `stuid` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `tittle` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `ill` */

insert  into `ill`(`id`,`stuid`,`username`,`date`,`tittle`) values 
(1,'20231014','张三','2023-10-15 ','感冒'),
(3,'20231015','李四','2222-11-20','223'),
(4,'20231014','张三三','2023-10-19','腿断了，去医院打石膏了'),
(5,'20231024','王五','2023-10-24','咳嗽');

/*Table structure for table `life` */

DROP TABLE IF EXISTS `life`;

CREATE TABLE `life` (
  `id` int NOT NULL AUTO_INCREMENT,
  `stuid` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `tittle` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `life` */

insert  into `life`(`id`,`stuid`,`username`,`date`,`time`,`tittle`) values 
(11,'1','张三','555','555','5555'),
(12,'20231014','张三三','2023-10-19','6:00','起床了，吃饭了'),
(13,'20231014','张三三','2023-10-15','8.00','晨跑'),
(14,'20231014','张三三','2023-10-24','9.00','9632153'),
(15,'20231024','王五','2023-10-24','6：00','早起');

/*Table structure for table `pexamination` */

DROP TABLE IF EXISTS `pexamination`;

CREATE TABLE `pexamination` (
  `id` int NOT NULL AUTO_INCREMENT,
  `stuid` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `pic` varchar(255) DEFAULT NULL,
  `tittle` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `pexamination` */

insert  into `pexamination`(`id`,`stuid`,`username`,`date`,`pic`,`tittle`) values 
(2,'20231014','张三三','2023-10-15','/upload/20231023001115893845.jpg','正常'),
(4,'20231014','张三三','2023-10-16','/upload/20231021000982287255.jpg','健康的鸭皮'),
(5,'20231014','张三三','2023-10-19','/upload/20231024000553537277.jpg','外力古德'),
(6,'20231014','张三三','2023-10-24','','一切正常'),
(7,'20231024','王五','2023-10-24','/upload/20231024000570831259.jpg','没事');

/*Table structure for table `questionnaire` */

DROP TABLE IF EXISTS `questionnaire`;

CREATE TABLE `questionnaire` (
  `id` int DEFAULT NULL,
  `questionNo` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `questionnaire` */

insert  into `questionnaire`(`id`,`questionNo`) values 
(1,1),
(1,2),
(1,3),
(1,4),
(1,5),
(1,6),
(1,7),
(1,8),
(1,9),
(1,10),
(2,1),
(2,2),
(2,5),
(2,7),
(2,8),
(2,10),
(2,11),
(2,12),
(2,13),
(2,15),
(3,4),
(3,5),
(3,6),
(3,7),
(3,8),
(3,9),
(3,10),
(3,11),
(3,12),
(3,23);

/*Table structure for table `questionnairescore` */

DROP TABLE IF EXISTS `questionnairescore`;

CREATE TABLE `questionnairescore` (
  `id` int NOT NULL AUTO_INCREMENT,
  `questionnaireid` int DEFAULT NULL,
  `stuid` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `score` int DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `questionnairescore` */

insert  into `questionnairescore`(`id`,`questionnaireid`,`stuid`,`date`,`score`) values 
(21,1,'20231014','2023-10-23',6),
(22,1,'20231015','2023-10-23',0),
(23,1,'20231019','2023-10-23',0),
(24,2,'20231014','2023-10-24',24),
(25,3,'20231024','2023-10-24',12),
(26,2,'20231024','2023-10-24',42);

/*Table structure for table `questions` */

DROP TABLE IF EXISTS `questions`;

CREATE TABLE `questions` (
  `id` int NOT NULL AUTO_INCREMENT,
  `question` varchar(255) DEFAULT NULL,
  `optA` varchar(255) DEFAULT NULL,
  `optB` varchar(255) DEFAULT NULL,
  `optC` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `questions` */

insert  into `questions`(`id`,`question`,`optA`,`optB`,`optC`) values 
(1,'看到自己最近一次拍摄的照片，你有什么感想?','A.觉得不称心','B.觉得很好','C.觉得还可以'),
(2,'你是否想到在若干年后会有什么使自己极为不安的事?','A.经常想到','B.从来没想过','C.偶尔想过'),
(3,'你是否被朋友、同事、同学起过绰号、挖苦过?','A.\n这是经常的事','B.从来没有过','C.偶尔有过'),
(4,'你上床以后，是否经常再起来看看门窗是否关好?','A.\n经常如此','B.从不如此','C.偶尔如此'),
(5,'你对你关系最密切的人是否满意? ','A.不满意','B.非常满意','C.基本满意'),
(6,'你在半夜的时候是否经常想到什么令人害怕的事?','A.\n经常','B.从来没有','C.极少有这种情况'),
(7,'你是否经常因梦见什么可怕的事情而惊醒?','A.经常','B.没有','C.极少'),
(8,'你是否有多次做同一个梦的而情况?','A.有','B.没有','C.记不清'),
(9,'有没有一种食物让你吃后呕吐?','A.有','B.没有','C.记不清'),
(10,'除了看见的世界外，你心里有没有另外一个世界?','A.有','B.没有','C.记不清'),
(11,'你心里是否常想到自己可能不是父母亲生的?','A.有','B.没有','C.偶尔有'),
(12,'你是否觉得没有人爱过你或尊重你?','A.有','B.否','C.记不清'),
(13,'你是否常常觉得你的家人对你不好，但是你又明白他们对你的确好?','A.有','B.否','C.偶尔'),
(14,'你是否认为没有人十分了解你?','A.有','B.否','C.说不清'),
(15,'你在早晨起床的时候最经常的感觉是?','A.忧郁','B.快乐','C.说不清'),
(16,'每年秋天，你经常感觉到的是?','A.贬低枯叶','B.秋高气爽','C.说不清'),
(17,'你在高处的时候，是否觉得站不稳? ','A.有','B.否','C.有时是这样'),
(18,'你平时是否觉得自己很强健?','A.有','B.否','C.不清楚'),
(19,'你是否一回家就立刻把自己的房门关上 (就是把自己关在房里) ?','A.有','B.否','C.不清楚'),
(20,'你在小房间里把门关上后，是否还觉得心理不安?','A.是','B.否','C.偶尔'),
(22,'看到自己最近的照片，你有什么感觉？','A.感觉自己很帅','B.帅不帅是我的事','C.比较在意别人的眼光'),
(23,'你是否经常因梦见什么可怕的事情而惊醒?','A.天天','B.没有','C.几乎没有');

/*Table structure for table `sport` */

DROP TABLE IF EXISTS `sport`;

CREATE TABLE `sport` (
  `id` int NOT NULL AUTO_INCREMENT,
  `stuid` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `tittle` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `sport` */

insert  into `sport`(`id`,`stuid`,`username`,`date`,`tittle`) values 
(1,'20231014','张三三','2020-10-16','5公里'),
(2,'20231014','张三三','2020-10-16','5公里3333'),
(5,'20231024','王五','2023-10-24','散步半小时');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `stuid` int DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `college` varchar(255) DEFAULT NULL,
  `classname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `birthday` varchar(255) DEFAULT NULL,
  `role` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `user` */

insert  into `user`(`id`,`account`,`stuid`,`username`,`password`,`sex`,`age`,`college`,`classname`,`tel`,`birthday`,`role`) values 
(1,'admin',NULL,'admin','admin',NULL,NULL,NULL,NULL,NULL,NULL,1),
(2,'0001',20231014,'张三三','0002','男',21,'计算机学院','计科一班','13218090521','1990-01-01',3),
(3,'0002',20231015,'李四','0002','男',21,'计算机学院','计科二班1','13218090522','1990-01-01',3),
(4,'d001',NULL,'王菲','d0001','女',30,NULL,NULL,'13218090520',NULL,2),
(9,'0005',20231019,'李四四','0005','男',20,'计算机学院','信管一班','13218090522','1989-10-25',3),
(10,'20231024',20231024,'王五','0001','男',20,'通信学院','计科一班','13218090522','2003-10-24',3),
(11,'d20231024',NULL,'李可','0001','女',35,NULL,NULL,'13775485086','1988-10-24',2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
