-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 18, 2019 at 06:56 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `proj1`
--

-- --------------------------------------------------------

--
-- Table structure for table `helper`
--

CREATE TABLE `helper` (
  `ID` int(11) NOT NULL,
  `destination` varchar(25) NOT NULL,
  `MOT` varchar(15) NOT NULL,
  `time` time DEFAULT NULL,
  `seatAvailable` varchar(10) NOT NULL,
  `vehicleNo` varchar(8) DEFAULT NULL,
  `genderP` varchar(6) NOT NULL,
  `share` varchar(10) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `sid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `helper`
--

INSERT INTO `helper` (`ID`, `destination`, `MOT`, `time`, `seatAvailable`, `vehicleNo`, `genderP`, `share`, `price`, `sid`) VALUES
(13, 'Nehrunagar', '4 - wheeler', '13:30:00', '2', 'GJ013181', 'Any', 'Sharing', '23', 10),
(15, 'Narol', '4 - wheeler', '18:25:00', '3', 'GJ084356', 'Any', 'Sharing', '25', 15);

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `helperName` varchar(30) NOT NULL,
  `seekerName` varchar(30) NOT NULL,
  `destination` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`helperName`, `seekerName`, `destination`) VALUES
('dasd', 'vs', 'ds'),
('umang', 'afd', 'Ghuma Gam'),
('fdg', 'afd', 'Ghuma Gam'),
('udit', 'afd', 'Nehrunagar'),
('afd', 'afd', 'Ghuma Gam'),
('afd', 'afd', 'Nehrunagar'),
('vardhan', 'vardhan', 'Nehrunagar'),
('umang', 'meet', 'Ghuma Gam'),
('umang', 'meet', 'Ghuma Gam'),
('sharvil ', 'umang', 'Ghuma Gam');

-- --------------------------------------------------------

--
-- Table structure for table `seeker`
--

CREATE TABLE `seeker` (
  `ID` int(11) NOT NULL,
  `destination` varchar(25) NOT NULL,
  `pMOT` varchar(20) NOT NULL,
  `genderP` varchar(6) NOT NULL,
  `time` time DEFAULT NULL,
  `sid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `seeker`
--

INSERT INTO `seeker` (`ID`, `destination`, `pMOT`, `genderP`, `time`, `sid`) VALUES
(1, 'Ghuma Gam', '4 - wheeler', 'Male', NULL, 2),
(5, 'Nehrunagar', '4 - wheeler', 'Male', '05:25:00', 2),
(6, 'Ghuma Gam', '4 - wheeler', 'Male', '05:25:00', 3),
(7, 'Ghuma Gam', '4 - wheeler', 'Male', '05:25:00', 3),
(8, 'Ghuma Gam', '4 - wheeler', 'Male', NULL, 4),
(9, 'Ghuma Gam', '4 - wheeler', 'Male', '05:25:00', 2),
(26, 'Ghuma Gam', '4 - wheeler', 'Male', '05:20:00', 5),
(39, 'Narol', '2 - wheeler', 'Male', '00:00:00', 3),
(40, 'Ghuma Gam', 'Any', 'Any', '18:25:00', 3),
(41, 'Ghuma Gam', '2 - wheeler', 'Male', '05:20:00', 3),
(42, 'Ghuma Gam', '4 - wheeler', 'Any', '05:20:00', 3),
(54, 'Nehrunagar', 'Any', 'Any', '16:45:00', 14),
(55, 'Nehrunagar', 'Any', 'Any', '16:50:00', 14),
(56, 'Ghuma Gam', 'Any', 'Any', '16:15:00', 15),
(57, 'Ghuma Gam', 'Any', 'Any', '01:00:00', 1);

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `ID` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `rollno` varchar(10) NOT NULL,
  `email_id` varchar(30) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `age` int(3) NOT NULL,
  `contactno` bigint(10) NOT NULL,
  `uMOT` varchar(15) NOT NULL,
  `vehicle_no` varchar(10) DEFAULT NULL,
  `residence` varchar(15) NOT NULL,
  `password` varchar(20) NOT NULL,
  `c_password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`ID`, `name`, `rollno`, `email_id`, `gender`, `age`, `contactno`, `uMOT`, `vehicle_no`, `residence`, `password`, `c_password`) VALUES
(1, 'umang', '13', 'umang.k@ahduni.edu.in', 'Male', 3, 43, '4 - wheeler', 'casfs', 'das', 'a', 'a'),
(10, 'utg', 'eds', 'uckamdar59@gmail.com', 'Male', 43, 4675468, '4 - wheeler', 'fass', 'scfa', 'abcdef1@', 'abcdef1@'),
(11, 'vardhan shah', 'ew466', 'vardhan.s@ahduni.edu.in', 'Male', 19, 4768569965, '4 - wheeler', 'sfaghs', 'nehrunagar', 'abcdef1@', 'abcdef1@'),
(12, 'udit', 'asfsfa', 'uditkamdar@gmail.com', 'Female', 43, 657584868, '2 - wheeler', 'j', 'sdsd', '123456@', '123456@'),
(14, 'vardhan', 'AU1841138', 'vardhanshah07@gmail.com', 'Male', 19, 654568168, 'Pedestrian', '', 'Star Bazar', 'abc123@', 'abc123@'),
(15, 'meet', '1841099', 'meet.k@ahduni.edu.in', 'Male', 18, 7984326882, '2 - wheeler', 'GJEX1662', 'tarangahill', 'meet@2307', 'meet@2307'),
(16, 'sharvil ', '134', 'sharvil.p@ahduni.edu.in', 'Male', 18, 123456789, '4 - wheeler', '1613', 'sadfsdhfg', '$456789', '$456789');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `helper`
--
ALTER TABLE `helper`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `seeker`
--
ALTER TABLE `seeker`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `signup`
--
ALTER TABLE `signup`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `helper`
--
ALTER TABLE `helper`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `seeker`
--
ALTER TABLE `seeker`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58;

--
-- AUTO_INCREMENT for table `signup`
--
ALTER TABLE `signup`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
