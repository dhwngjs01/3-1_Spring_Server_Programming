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

-- 테이블 basicboard.tbl_studentinfo 구조 내보내기
CREATE TABLE IF NOT EXISTS `tbl_studentinfo` (
  `student_no` varchar(10) NOT NULL,
  `student_name` varchar(16) NOT NULL,
  `student_dept` int(11) DEFAULT NULL,
  `student_address` varchar(100) NOT NULL,
  `student_phone` varchar(16) NOT NULL,
  `student_email` varchar(50) NOT NULL,
  PRIMARY KEY (`student_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- 테이블 데이터 basicboard.tbl_studentinfo:~5 rows (대략적) 내보내기
DELETE FROM `tbl_studentinfo`;
INSERT INTO `tbl_studentinfo` (`student_no`, `student_name`, `student_dept`, `student_address`, `student_phone`, `student_email`) VALUES
	('201123', '김또깡', 44, '인천광역시 인하로 100', '010-7777-8888', '201844123@itc.ac.kr'),
	('2014789', '김민수', 44, '인천광역시 인하로 100', '010-4567-4562', '201844789@itc.ac.kr'),
	('201844021', '오또깡', 45, '인천광역시 용현동 33-22', '010-7777-8888', 'ohDdoo@itc.ac.kr'),
	('201844123', '김또깡', 44, '인천광역시 인하로 100', '010-7777-8888', '201844123@itc.ac.kr'),
	('201844789', '김민수', 44, '인천광역시 인하로 100', '010-4567-4562', '201844789@itc.ac.kr');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
