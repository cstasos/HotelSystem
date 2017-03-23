CREATE DATABASE  IF NOT EXISTS `Hotel_System` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `Hotel_System`;
-- MySQL dump 10.13  Distrib 5.6.30, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: Hotel_System
-- ------------------------------------------------------
-- Server version	5.6.30-0ubuntu0.15.10.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `CheckedIn`
--

DROP TABLE IF EXISTS `CheckedIn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CheckedIn` (
  `reservation_id` int(11) NOT NULL,
  KEY `reservation_id` (`reservation_id`),
  CONSTRAINT `CheckedIn_ibfk_1` FOREIGN KEY (`reservation_id`) REFERENCES `Reservation` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CheckedIn`
--

LOCK TABLES `CheckedIn` WRITE;
/*!40000 ALTER TABLE `CheckedIn` DISABLE KEYS */;
/*!40000 ALTER TABLE `CheckedIn` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Customer`
--

DROP TABLE IF EXISTS `Customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `AT` varchar(20) NOT NULL,
  `firstname` varchar(25) NOT NULL,
  `lastname` varchar(25) NOT NULL,
  `phone` varchar(25) DEFAULT NULL,
  `gender` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customer`
--

LOCK TABLES `Customer` WRITE;
/*!40000 ALTER TABLE `Customer` DISABLE KEYS */;
INSERT INTO `Customer` VALUES (1,'AT-111','Syleopoulos','Anastasios','1234567890','Male'),(2,'AT-222','Katsarou','Maria','','Female'),(3,'AT-333','Nari','Eleni','','Female'),(4,'AT-test','Test_Lname','Test_Fname','',' ');
/*!40000 ALTER TABLE `Customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `History`
--

DROP TABLE IF EXISTS `History`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `History` (
  `historyid` int(11) NOT NULL AUTO_INCREMENT,
  `reservation_id` int(11) NOT NULL DEFAULT '0',
  `checkin` date NOT NULL,
  `checkout` date NOT NULL,
  `customer_id` int(11) NOT NULL,
  PRIMARY KEY (`historyid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `History`
--

LOCK TABLES `History` WRITE;
/*!40000 ALTER TABLE `History` DISABLE KEYS */;
INSERT INTO `History` VALUES (1,2,'2016-06-08','2016-06-09',2);
/*!40000 ALTER TABLE `History` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Reservation`
--

DROP TABLE IF EXISTS `Reservation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Reservation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `checkin` date NOT NULL,
  `checkout` date NOT NULL,
  `customer_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `Reservation_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `Customer` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Reservation`
--

LOCK TABLES `Reservation` WRITE;
/*!40000 ALTER TABLE `Reservation` DISABLE KEYS */;
INSERT INTO `Reservation` VALUES (1,'2016-06-06','2016-06-09',1),(3,'2016-06-10','2016-06-12',3),(4,'2016-06-10','2016-06-12',2),(5,'2017-06-07','2017-06-10',4),(6,'2016-06-12','2016-06-12',3);
/*!40000 ALTER TABLE `Reservation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Reservation_Room`
--

DROP TABLE IF EXISTS `Reservation_Room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Reservation_Room` (
  `reservation_id` int(11) NOT NULL,
  `room_id` int(11) NOT NULL,
  PRIMARY KEY (`reservation_id`,`room_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Reservation_Room`
--

LOCK TABLES `Reservation_Room` WRITE;
/*!40000 ALTER TABLE `Reservation_Room` DISABLE KEYS */;
INSERT INTO `Reservation_Room` VALUES (1,8),(1,10),(1,17),(3,3),(3,13),(3,18),(4,9),(4,10),(4,16),(5,18),(5,19),(5,20),(6,19),(6,20);
/*!40000 ALTER TABLE `Reservation_Room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Room`
--

DROP TABLE IF EXISTS `Room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Room` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Room`
--

LOCK TABLES `Room` WRITE;
/*!40000 ALTER TABLE `Room` DISABLE KEYS */;
INSERT INTO `Room` VALUES (1,1,33),(2,2,44),(3,5,120),(4,1,38),(5,1,30),(6,1,45),(7,2,55),(8,2,42),(9,3,65),(10,3,60),(11,4,80),(12,4,85),(13,5,140),(14,5,120),(15,2,45),(16,3,70),(17,4,75),(18,6,220),(19,6,200),(20,6,195);
/*!40000 ALTER TABLE `Room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `room_pivot_reservation`
--

DROP TABLE IF EXISTS `room_pivot_reservation`;
/*!50001 DROP VIEW IF EXISTS `room_pivot_reservation`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `room_pivot_reservation` AS SELECT 
 1 AS `id`,
 1 AS `type`,
 1 AS `price`,
 1 AS `reservation_id`,
 1 AS `checkin`,
 1 AS `checkout`,
 1 AS `customer_id`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `room_reservation`
--

DROP TABLE IF EXISTS `room_reservation`;
/*!50001 DROP VIEW IF EXISTS `room_reservation`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `room_reservation` AS SELECT 
 1 AS `id`,
 1 AS `type`,
 1 AS `price`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `room_reservation_customer`
--

DROP TABLE IF EXISTS `room_reservation_customer`;
/*!50001 DROP VIEW IF EXISTS `room_reservation_customer`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `room_reservation_customer` AS SELECT 
 1 AS `id`,
 1 AS `type`,
 1 AS `price`,
 1 AS `reservation_id`,
 1 AS `checkin`,
 1 AS `checkout`,
 1 AS `customer_id`,
 1 AS `AT`,
 1 AS `firstname`,
 1 AS `lastname`,
 1 AS `phone`,
 1 AS `gender`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `room_pivot_reservation`
--

/*!50001 DROP VIEW IF EXISTS `room_pivot_reservation`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `room_pivot_reservation` AS select `Room`.`id` AS `id`,`Room`.`type` AS `type`,`Room`.`price` AS `price`,`Reservation_Room`.`reservation_id` AS `reservation_id`,`Reservation`.`checkin` AS `checkin`,`Reservation`.`checkout` AS `checkout`,`Reservation`.`customer_id` AS `customer_id` from ((`Reservation_Room` join `Reservation` on((`Reservation_Room`.`reservation_id` = `Reservation`.`id`))) join `Room` on((`Reservation_Room`.`room_id` = `Room`.`id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `room_reservation`
--

/*!50001 DROP VIEW IF EXISTS `room_reservation`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `room_reservation` AS select `Room`.`id` AS `id`,`Room`.`type` AS `type`,`Room`.`price` AS `price` from ((`Reservation_Room` join `Reservation` on((`Reservation_Room`.`reservation_id` = `Reservation`.`id`))) join `Room` on((`Reservation_Room`.`room_id` = `Room`.`id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `room_reservation_customer`
--

/*!50001 DROP VIEW IF EXISTS `room_reservation_customer`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `room_reservation_customer` AS select `Room`.`id` AS `id`,`Room`.`type` AS `type`,`Room`.`price` AS `price`,`Reservation_Room`.`reservation_id` AS `reservation_id`,`Reservation`.`checkin` AS `checkin`,`Reservation`.`checkout` AS `checkout`,`Reservation`.`customer_id` AS `customer_id`,`Customer`.`AT` AS `AT`,`Customer`.`firstname` AS `firstname`,`Customer`.`lastname` AS `lastname`,`Customer`.`phone` AS `phone`,`Customer`.`gender` AS `gender` from (((`Reservation_Room` join `Reservation` on((`Reservation_Room`.`reservation_id` = `Reservation`.`id`))) join `Room` on((`Reservation_Room`.`room_id` = `Room`.`id`))) join `Customer` on((`Customer`.`id` = `Reservation`.`customer_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-14 13:45:03
