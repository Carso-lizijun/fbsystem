/*
SQLyog Ultimate v8.32 
MySQL - 5.5.54 : Database - fbinfo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`fbinfo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `fbinfo`;

/*Table structure for table `fbnewinfo` */

DROP TABLE IF EXISTS `fbnewinfo`;

CREATE TABLE `fbnewinfo` (
  `time1` varchar(50) DEFAULT NULL,
  `time2` varchar(50) DEFAULT NULL,
  `time3` varchar(50) DEFAULT NULL,
  `time4` varchar(50) DEFAULT NULL,
  `gameproperty1` varchar(30) DEFAULT NULL,
  `gameproperty2` varchar(30) DEFAULT NULL,
  `gameproperty3` varchar(30) DEFAULT NULL,
  `gameproperty4` varchar(30) DEFAULT NULL,
  `teamname1` varchar(40) DEFAULT NULL,
  `teamname2` varchar(40) DEFAULT NULL,
  `teamname3` varchar(40) DEFAULT NULL,
  `teamname4` varchar(40) DEFAULT NULL,
  `teamname5` varchar(40) DEFAULT NULL,
  `teamname6` varchar(40) DEFAULT NULL,
  `teamname7` varchar(40) DEFAULT NULL,
  `teamname8` varchar(40) DEFAULT NULL,
  `gamenewsID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fbnewinfo` */

insert  into `fbnewinfo`(`time1`,`time2`,`time3`,`time4`,`gameproperty1`,`gameproperty2`,`gameproperty3`,`gameproperty4`,`teamname1`,`teamname2`,`teamname3`,`teamname4`,`teamname5`,`teamname6`,`teamname7`,`teamname8`,`gamenewsID`) values ('2014-10-11 20:30','2014-10-11 20:30','2014-10-11 20:30','2014-10-11 20:30','欧冠','欧冠','欧冠','欧冠','皇马','多特','拜仁','巴萨','切尔西','曼城','曼联','巴黎',1111);

/*Table structure for table `fbp` */

DROP TABLE IF EXISTS `fbp`;

CREATE TABLE `fbp` (
  `pid` char(30) NOT NULL,
  `pname` varchar(100) DEFAULT NULL,
  `page` int(11) DEFAULT NULL,
  `pcountry` varchar(50) DEFAULT NULL,
  `pclub` varchar(100) DEFAULT NULL,
  `pimage` varchar(200) DEFAULT NULL,
  `pposi` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `fbp` */

insert  into `fbp`(`pid`,`pname`,`page`,`pcountry`,`pclub`,`pimage`,`pposi`) values ('000010402','特尔斯特根',25,'德国','巴塞罗那','pimages/p192448.png','门将'),('000032402','皮克',30,'西班牙','巴塞罗那','pimages/p77152729.png','后卫'),('000040408','托尼.克罗斯',27,'德国','巴塞罗那','pimages/p91182521.png','中场'),('000042408','塞尔吉奥.拉莫斯',31,'西班牙','皇家马德里','pimages/p91155862.png','后卫'),('000052402','布斯克茨',29,'西班牙','巴塞罗那','pimages/p11189511.png','中场'),('000071608','C.罗纳尔多',32,'葡萄牙','皇家马德里','pimages/p20801.png','前锋'),('000090608','本泽马',30,'法国','皇家马德里','pimages/p77165153.png','前锋'),('000092302','路易斯.苏亚雷斯',30,'乌拉圭','巴塞罗那','pimages/p91176580.png','前锋'),('000092413','费尔南多.托雷斯',33,'西班牙','马德里竞技','pimages/p8049369.png','前锋'),('000100102','梅西',30,'阿根廷','巴塞罗那','pimages/p158023.png','前锋,中场'),('000112308','加雷斯.贝尔',28,'威尔士','皇家马德里','pimages/p77173731.png','前锋'),('000120208','马塞洛',29,'巴西','皇家马德里','pimages/p91176676.png','后卫'),('000140102','马斯切拉诺',33,'阿根廷','巴塞罗那','pimages/p142754.png','中场，后卫'),('000191108','莫德里奇',32,'克罗地亚','皇家马德里','pimages/p91177003.png','中场'),('111010618','洛里斯',31,'法国','托特纳姆热刺','pimages/p35167948.png','门将'),('111012413','德赫亚',27,'西班牙','曼联','pimages/p193080.png','门将'),('111012523','乔.哈特',30,'英格兰','西汉姆联','pimages/p150724.png','门将'),('111040213','孔帕尼',31,'比利时','曼城','pimages/p77139720.png','后卫'),('111060601','科斯切尔尼',32,'法国','阿森纳','pimages/p77165229.png','后卫'),('111072601','桑切斯',30,'智利','阿森纳','pimages/p53184941.png','前锋'),('111082402','伊涅斯塔',33,'西班牙','巴塞罗那','pimages/p91000041.png','中场'),('111082413','胡安.马塔',29,'西班牙','曼联','pimages/p35178088.png','中场,前锋'),('111100401','厄齐尔',29,'德国','阿森纳','pimages/p77176635.png','中场'),('111101813','伊布拉希莫维奇',36,'瑞典','曼联','pimages/p11041236.png','前锋'),('111130218','库尔图瓦',25,'比利时','切尔西','pimages/p23192119.png','门将'),('111180601','吉鲁',31,'法国','阿森纳','pimages/p35178509.png','前锋'),('111192418','迭戈.科斯塔',29,'西班牙','切尔西','pimages/p53179844.png','前锋'),('111222513','姆希塔良',28,'亚美尼亚','曼联','pimages/p192883.png','中场,前锋'),('111331001','切赫',35,'捷克','阿森纳','pimages/p77048940.png','门将'),('111421113','亚亚.图雷',34,'科特迪瓦','曼城','pimages/p12020289.png','中场'),('222010402','诺伊尔',31,'德国','拜仁慕尼黑','pimages/p91167495.png','门将'),('222050402','胡梅尔斯',29,'德国','拜仁慕尼黑','pimages/p77178603.png','后卫'),('222100802','罗本',33,'荷兰','拜仁慕尼黑','pimages/p77009014.png','前锋'),('222160102','阿拉巴',25,'奥地利','拜仁慕尼黑','pimages/p23197445.png','后卫,中场'),('222170402','J.博阿滕',29,'德国','拜仁慕尼黑','pimages/p53183907.png','后卫'),('222250402','托马斯.穆勒',28,'德国','拜仁慕尼黑','pimages/p69189596.png','前锋'),('333012525','布冯',38,'意大利','尤文图斯','pimages/p1179.png','门将'),('333102512','托蒂',38,'意大利','罗马','pimages/p63001238.png','中场,前锋'),('333192501','博努奇',30,'意大利','尤文图斯','pimages/p53184344.png','后卫'),('333992501','多纳鲁马',18,'意大利','AC米兰','pimages/p230621.png','门将'),('444020202','达尼.阿尔维斯',34,'巴西','巴黎圣日耳曼','pimages/p91146530.png','后卫'),('444050202','蒂亚戈.席尔瓦',33,'巴西','巴黎圣日耳曼','pimages/p91164240.png','后卫'),('444092302','卡瓦尼',30,'乌拉圭','巴黎圣日耳曼','pimages/p35179813.png','前锋'),('444100202','内马尔',25,'巴西','巴黎圣日耳曼','pimages/p53190871.png','前锋'),('555090801','亨特拉尔',34,'荷兰','阿贾克斯','pimages/p148803.png','前锋');

/*Table structure for table `gameodds` */

DROP TABLE IF EXISTS `gameodds`;

CREATE TABLE `gameodds` (
  `dgame` varchar(20) DEFAULT NULL,
  `odds1` double DEFAULT NULL,
  `odds2` double DEFAULT NULL,
  `odds3` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `gameodds` */

insert  into `gameodds`(`dgame`,`odds1`,`odds2`,`odds3`) values ('赛事1',2.68,3.01,2.54),('赛事2',2.42,2.87,2.64),('赛事3',2.2,3.21,2.4),('赛事4',2.92,3,2.87);

/*Table structure for table `susers` */

DROP TABLE IF EXISTS `susers`;

CREATE TABLE `susers` (
  `username` varchar(50) NOT NULL,
  `passw` varchar(50) NOT NULL,
  `email` varchar(80) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `susers` */

insert  into `susers`(`username`,`passw`,`email`) values ('carso','qq282848003','282848003@qq.com'),('lzj12333','qq282848003','26666@qq.com'),('qqq123','qqq123','2666611@qq.com');

/*Table structure for table `usermasks` */

DROP TABLE IF EXISTS `usermasks`;

CREATE TABLE `usermasks` (
  `username` varchar(50) DEFAULT NULL,
  `summasks` double DEFAULT NULL,
  `dgame1` varchar(20) DEFAULT NULL,
  `dmask1` double DEFAULT NULL,
  `dgame2` varchar(20) DEFAULT NULL,
  `dmask2` double DEFAULT NULL,
  `dgame3` varchar(20) DEFAULT NULL,
  `dmask3` double DEFAULT NULL,
  `dgame4` varchar(20) DEFAULT NULL,
  `dmask4` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `usermasks` */

insert  into `usermasks`(`username`,`summasks`,`dgame1`,`dmask1`,`dgame2`,`dmask2`,`dgame3`,`dmask3`,`dgame4`,`dmask4`) values ('carsoli',10000,'赛事1',200,'赛事2',300,'赛事3',400,'赛事4',600);

/*Table structure for table `users1` */

DROP TABLE IF EXISTS `users1`;

CREATE TABLE `users1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `users1` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
