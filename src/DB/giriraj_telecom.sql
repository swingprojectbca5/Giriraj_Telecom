-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 16, 2022 at 02:15 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `giriraj_telecom`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` varchar(20) NOT NULL,
  `nm` varchar(30) NOT NULL,
  `contact` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `snm` varchar(30) NOT NULL,
  `sadd` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `nm`, `contact`, `email`, `snm`, `sadd`) VALUES
('CUST 1', 'fj', 'j', 'KJ@gmail.com', 'fj', 'k'),
('CUST 2', 'jsdf', 'kjf', 'jf@gmail.com', 'jsdf', 'kjd'),
('CUST 3', 'jsdf', 'kjf', 'jf@gmail.com', 'jsdf', 'kjd'),
('CUST 4', 'jsdf', 'kjf', 'jf@gmail.com', 'jsdf', 'kjd'),
('CUST 5', 'jsdf', 'kjf', 'jf@gmail.com', 'jsdf', 'kjd'),
('CUST 6', 'dh', 'ahj', 'd@gmail.com', 'dh', 'jdh'),
('CUST 7', 'dh', 'ahj', 'd@gmail.com', 'dh', 'jdh');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` varchar(25) NOT NULL,
  `pswd` varchar(25) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
