drop database if EXISTS  mydb;
CREATE database mydb;
use mydb;
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `clazz`;
CREATE TABLE `clazz` (
  `ID` varchar(64) NOT NULL,
  `name` varchar(64) NOT NULL,
  `create_time` datetime DEFAULT NULL, 
  `sort` int(11) NOT NULL AUTO_INCREMENT,
  `remarks` varchar(255) DEFAULT NULL,
  `is_exist` int(11) DEFAULT '1',
  `start_time` datetime,
  `end_time` datetime ,
  `student_count` int(10) DEFAULT 0,
  `has_stugroup` int(2) DEFAULT NULL,
  `technology_direction` varchar(64) DEFAULT NULL,
  `reserved_one` varchar(255) DEFAULT NULL,
  `reserved_two` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `sort` (`sort`)
) ENGINE=InnoDB AUTO_INCREMENT=1 ;

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `ID` varchar(64) NOT NULL,
  `name` varchar(64) NOT NULL,
  `stu_num` varchar(64)  ,
   `sex` varchar(64)  ,
    `daxue` varchar(64)  ,
    `phone` varchar(64)  ,
     `clazz_id` varchar(64)  NULL,
   PRIMARY KEY (`ID`)
) ENGINE=InnoDB  ;

