-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 16, 2022 at 07:14 AM
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
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `id` int(10) NOT NULL,
  `sname` varchar(40) NOT NULL,
  `semail` varchar(50) NOT NULL,
  `scno` varchar(12) NOT NULL,
  `category` varchar(20) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `model` varchar(20) NOT NULL,
  `price` varchar(30) NOT NULL,
  `qty` varchar(5) NOT NULL,
  `tax` varchar(10) NOT NULL,
  `discount` varchar(10) NOT NULL,
  `nettotal` varchar(20) NOT NULL,
  `paid` varchar(20) NOT NULL,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`id`, `sname`, `semail`, `scno`, `category`, `brand`, `model`, `price`, `qty`, `tax`, `discount`, `nettotal`, `paid`, `time`) VALUES
(1, 'lks', 'f@gmail.com', '32', ' maynk', 'mm', 'x', '3000', '2', '010', '05', '12000', '6000', '2022-09-11 05:03:32'),
(2, 'lks', 'f@gmail.com', '32', ' maynk', 'mm', 'x', '3000', '4', '010', '05', '18005', '1800', '2022-09-13 06:15:29'),
(3, 'lks', 'f@gmail.com', '32', ' maynk', 'mm', 'x', '3000', '1', '0', '0', '', '', '2022-09-13 06:14:38'),
(4, 'lks', 'f@gmail.com', '32', ' maynk', 'mm', 'x', '5000', '0', '0200', '030', '170', '', '2022-09-14 06:53:09'),
(5, 'lks', 'f@gmail.com', '32', ' maynk', 'mm', 'x', '5000', '2', '0200', '0100', '45100', '', '2022-09-14 07:25:11'),
(6, 'lks', 'f@gmail.com', '32', ' maynk', 'mm', 'x', '100', '2', '0100', '040', '560', '400', '2022-09-15 08:02:07'),
(7, 'lks', 'f@gmail.com', '32', ' maynk', 'mm', 'x', '100', '1', '0', '0', '', '100', '2022-09-16 04:44:43');

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `id` int(11) NOT NULL,
  `nm` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`id`, `nm`) VALUES
(1, 'mm');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id` int(11) NOT NULL,
  `nm` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `nm`) VALUES
(2, ' maynk');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
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
(1, 'lks', '32', 'f@gmail.com', 'lks', 'lkfjd	');

-- --------------------------------------------------------

--
-- Table structure for table `emp`
--

CREATE TABLE `emp` (
  `id` varchar(30) NOT NULL,
  `nm` varchar(25) NOT NULL,
  `uname` varchar(30) NOT NULL,
  `contact` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `salary` varchar(10) NOT NULL,
  `address` varchar(30) NOT NULL,
  `pass` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emp`
--

INSERT INTO `emp` (`id`, `nm`, `uname`, `contact`, `email`, `salary`, `address`, `pass`) VALUES
('1', 'fdh', '', '93', 'lsdj@gmil.com', '2999', 'dskj', '123456'),
('2', 'sak', '', '1234', 'd@gmail.com', '211', 'dskj', '1234'),
('3', 'ADMIN', '', '9408084884', 'dhruvkdatta@gmail.com', '0', 'jinpress jundala street 2 ', 'admin'),
('4', 'dhruv', 'dhruv123', '2982908', 'dhruvkdatta@gmail.com', '199', 'lkdsjliu', '1234'),
('5', 'admin', 'ADMIN', '2991', 'dhruvkdatta@gmail.com', '200', 'fdkjflk', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` varchar(25) NOT NULL,
  `pswd` varchar(25) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `pswd`) VALUES
('1', '1234'),
('2', '1234'),
('3', 'admin'),
('4', '1234'),
('5', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `model`
--

CREATE TABLE `model` (
  `id` int(11) NOT NULL,
  `nm` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `model`
--

INSERT INTO `model` (`id`, `nm`) VALUES
(1, 'x');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `cprice` varchar(20) NOT NULL,
  `sprice` varchar(20) NOT NULL,
  `ctgry` varchar(20) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `model` varchar(20) NOT NULL,
  `qty` varchar(20) NOT NULL,
  `dsc` varchar(150) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `cprice`, `sprice`, `ctgry`, `brand`, `model`, `qty`, `dsc`) VALUES
(1, '4000', '5000', ' maynk', 'mm', 'x', '5', 'hello java'),
(2, '100', '100', ' maynk', 'mm', 'x', '3', 'skjhka'),
(3, '', '', 'Category', 'brand', 'model', '0', '');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
