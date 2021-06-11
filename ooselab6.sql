-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 28, 2021 at 06:05 AM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ooselab6`
--

-- --------------------------------------------------------

--
-- Table structure for table `aboutinfo`
--

CREATE TABLE `aboutinfo` (
  `same` varchar(225) DEFAULT NULL,
  `email` varchar(225) DEFAULT NULL,
  `description` varchar(225) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `aboutinfo`
--

INSERT INTO `aboutinfo` (`same`, `email`, `description`) VALUES
('huzaifa', 'huzaifa@gmail.com', 'yes you are right but i am not wrong'),
('hanzla', 'hnzla@gmail.com', 'hi my name is hanzla'),
('usama', 'irfan', 'hi my namei s usama');

-- --------------------------------------------------------

--
-- Table structure for table `studentreg`
--

CREATE TABLE `studentreg` (
  `Student_name` varchar(20) NOT NULL,
  `Father_name` varchar(20) NOT NULL,
  `SAP_ID` int(11) NOT NULL,
  `Department` varchar(30) DEFAULT NULL,
  `Batch` int(11) DEFAULT NULL,
  `City` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentreg`
--

INSERT INTO `studentreg` (`Student_name`, `Father_name`, `SAP_ID`, `Department`, `Batch`, `City`) VALUES
('jazib', 'shahid', 70067981, 'Aviation', 2020, 'Karachi'),
('Hanzla', 'barkaat', 70068125, 'Software', 2018, 'Lahore'),
('ahmad', 'ishaq', 70068176, 'MBBS', 2019, 'Gujranwala');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `firstname` varchar(15) NOT NULL,
  `password` varchar(15) DEFAULT NULL,
  `lastname` varchar(15) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `studentreg`
--
ALTER TABLE `studentreg`
  ADD PRIMARY KEY (`SAP_ID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`firstname`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
