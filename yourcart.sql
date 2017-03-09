-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 08, 2017 at 08:09 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `yourcart`
--

-- --------------------------------------------------------

--
-- Table structure for table `ads`
--

CREATE TABLE `ads` (
  `id` int(11) NOT NULL,
  `image` varchar(200) CHARACTER SET latin1 NOT NULL,
  `url` varchar(100) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

--
-- Dumping data for table `ads`
--

INSERT INTO `ads` (`id`, `image`, `url`) VALUES
(2, 'upload/1488842019089shipping.jpg', 'https://www.google.com.eg/'),
(3, 'upload/1488842050196Nokia-3310_Front_Full_2.jpg', 'https://www.google.com.eg/');

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`id`, `user_id`, `product_id`, `quantity`) VALUES
(6, 10, 661, 22),
(7, 10, 660, 23),
(8, 5, 659, 2),
(9, 5, 660, 2),
(10, 10, 659, 2);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id` int(11) NOT NULL,
  `name` varchar(25) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `name`) VALUES
(1, 'Mobile'),
(2, 'labtop'),
(3, 'Man Clothes'),
(4, 'Woman Clothes'),
(5, 'new Cat');

-- --------------------------------------------------------

--
-- Table structure for table `charge`
--

CREATE TABLE `charge` (
  `id` int(11) NOT NULL,
  `card_number` tinytext CHARACTER SET latin1 NOT NULL,
  `value` int(11) NOT NULL,
  `used` tinyint(1) NOT NULL,
  `taken` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `date` varchar(25) CHARACTER SET latin1 NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`id`, `user_id`, `product_id`, `date`, `quantity`) VALUES
(1, 1, 13, '20-12-2017', 3);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(50) CHARACTER SET latin1 NOT NULL,
  `price` double NOT NULL,
  `quantity` int(11) NOT NULL,
  `model` varchar(50) CHARACTER SET latin1 DEFAULT NULL,
  `descriptin` text CHARACTER SET latin1,
  `date` varchar(20) CHARACTER SET latin1 NOT NULL,
  `photo` varchar(100) CHARACTER SET latin1 DEFAULT 'upload/yourCart.png',
  `category_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `price`, `quantity`, `model`, `descriptin`, `date`, `photo`, `category_id`) VALUES
(13, 'mohamed', 13, 3, 'nono', 'das', '13/12/2016', 'upload/yourCart.png', 1),
(656, 'new Product', 12.6, 3, 'NoModel', 'Good', '2017-03-04', 'upload/1488585388828java.png', 2),
(657, 'last', 13.5, 3, 'Nokia', 'mmm', '2017-03-04', 'upload/yourCart.png', 1),
(658, 'test2', 12, 23, '543', 'sdsdv', '2017-03-04', 'upload/yourCart.png', 2),
(659, 'sfa', 23, 23, '', '', '2017-03-04', 'upload/yourCart.png', 1),
(660, 'nokia 3310 new', 120, 300, 'Nokia', 'good mobile new', '2017-03-04', 'upload/1488650753165Nokia-3310_Front_Full_2.jpg', 3),
(661, '3', 3, 3, '3', '3', '2017-03-05', 'upload/1488696641611github-6-xxl.png', 1);

-- --------------------------------------------------------

--
-- Table structure for table `slides`
--

CREATE TABLE `slides` (
  `id` int(11) NOT NULL,
  `title` varchar(100) CHARACTER SET latin1 NOT NULL,
  `subtitle` varchar(100) CHARACTER SET latin1 NOT NULL,
  `description` text CHARACTER SET latin1 NOT NULL,
  `image` varchar(200) CHARACTER SET latin1 NOT NULL,
  `product_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

--
-- Dumping data for table `slides`
--

INSERT INTO `slides` (`id`, `title`, `subtitle`, `description`, `image`, `product_id`) VALUES
(1, 'new Nokia', 'Arrive now to egypt', 'good mobile new', 'upload/1488650753165Nokia-3310_Front_Full_2.jpg', 660);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(50) CHARACTER SET latin1 NOT NULL,
  `email` varchar(50) CHARACTER SET latin1 NOT NULL,
  `address` varchar(50) CHARACTER SET latin1 NOT NULL,
  `job` varchar(20) CHARACTER SET latin1 NOT NULL,
  `password` varchar(50) CHARACTER SET latin1 NOT NULL,
  `creaditCard` varchar(50) CHARACTER SET latin1 NOT NULL,
  `cash` double NOT NULL,
  `role` varchar(50) CHARACTER SET latin1 NOT NULL,
  `photo` varchar(200) CHARACTER SET latin1 NOT NULL DEFAULT 'upload/profile.jpg'
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `email`, `address`, `job`, `password`, `creaditCard`, `cash`, `role`, `photo`) VALUES
(1, 'mohamed', 'mohamed.motyim@gmail.com', 'alexandria', 'java dev', '123456', '1234-1234-1234-1234', 500, 'admin', 'upload/profile.jpg'),
(5, 'osama', 'osama@mos.com', 'giza', 'java dev', '123', '4444-4444-4444-4444', 0, 'user', 'upload/profile.jpg'),
(10, 'motyim', 'mohamed.motyim2@gmail.com', 'alexandria', 'java Developer', '123', '8888-8888-8888-8888', 403, 'user', 'upload/1488576281799logo.png'),
(11, 'zzzz', 'zzzzzz@zcz.com', 'asf', 'asf', '1212', '2323-2323-2323-2323', 725, 'user', 'upload/profile.jpg'),
(12, 'kasjfkl', 'sajdjsalk@asjkl.xom', 'asdsad', 'asdasd', '12', '4747-4747-4747-4747', 892, 'user', 'upload/profile.jpg'),
(13, 'ahmed', 'ahmed@gmail.com', 'alexandria', 'asdasd', '123', '1478-1596-1235-1485', 488, 'user', 'upload/profile.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ads`
--
ALTER TABLE `ads`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `product_id` (`product_id`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `charge`
--
ALTER TABLE `charge`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `history`
--
ALTER TABLE `history`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `product_id` (`product_id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id`),
  ADD KEY `catagory_id` (`category_id`);

--
-- Indexes for table `slides`
--
ALTER TABLE `slides`
  ADD PRIMARY KEY (`id`),
  ADD KEY `product_id` (`product_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `creaditCard` (`creaditCard`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ads`
--
ALTER TABLE `ads`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `cart`
--
ALTER TABLE `cart`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `charge`
--
ALTER TABLE `charge`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `history`
--
ALTER TABLE `history`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=662;
--
-- AUTO_INCREMENT for table `slides`
--
ALTER TABLE `slides`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `cart`
--
ALTER TABLE `cart`
  ADD CONSTRAINT `cart_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `cart_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `history`
--
ALTER TABLE `history`
  ADD CONSTRAINT `history_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `history_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `product_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `slides`
--
ALTER TABLE `slides`
  ADD CONSTRAINT `slides_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
