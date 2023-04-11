-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.11.2-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  12.4.0.6659
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- basicboard 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `basicboard` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `basicboard`;

-- 테이블 basicboard.tbl_sbjrecord 구조 내보내기
CREATE TABLE IF NOT EXISTS `tbl_sbjrecord` (
  `student_no` int(11) NOT NULL,
  `korean` int(11) NOT NULL,
  `english` int(11) NOT NULL,
  `math` int(11) NOT NULL,
  PRIMARY KEY (`student_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 테이블 데이터 basicboard.tbl_sbjrecord:~3 rows (대략적) 내보내기
DELETE FROM `tbl_sbjrecord`;
INSERT INTO `tbl_sbjrecord` (`student_no`, `korean`, `english`, `math`) VALUES
	(201766123, 60, 80, 90),
	(201844021, 80, 60, 30),
	(202312180, 60, 45, 80);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
