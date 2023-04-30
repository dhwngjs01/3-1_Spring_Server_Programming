-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.11.2-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  12.4.0.6670
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

-- 테이블 basicboard.tbl_member 구조 내보내기
CREATE TABLE IF NOT EXISTS `tbl_member` (
  `userid` varchar(50) NOT NULL,
  `userpw` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `regdate` timestamp NULL DEFAULT current_timestamp(),
  `updatedate` timestamp NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 테이블 데이터 basicboard.tbl_member:~3 rows (대략적) 내보내기
DELETE FROM `tbl_member`;
INSERT INTO `tbl_member` (`userid`, `userpw`, `username`, `email`, `regdate`, `updatedate`) VALUES
	('user2', 'pw2', '대답을 정말 잘해주는 A반', 'user2@itc.ac.kr', '2023-04-11 05:01:16', '2023-04-11 05:01:18'),
	('user3', 'pw3', '사용자3', 'user3@itc.ac.kr', '2023-04-11 06:14:56', '2023-04-11 06:15:00'),
	('UserID 1', 'PW 1', 'Name 1', 'awer@itc.ac.kr', '2023-04-04 06:32:21', '2023-04-04 06:32:21');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
