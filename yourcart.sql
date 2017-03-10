-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 10, 2017 at 01:18 PM
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
(8, 5, 659, 2),
(9, 5, 660, 2),
(12, 10, 660, 2),
(13, 10, 658, 1),
(14, 10, 661, 1);

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

--
-- Dumping data for table `charge`
--

INSERT INTO `charge` (`id`, `card_number`, `value`, `used`, `taken`) VALUES
(4, '4e2c5f926c537288', 200, 1, 1),
(5, '334e4b347e103232', 200, 0, 0),
(6, '863a52a7a4472295', 500, 1, 1),
(7, '759494455b892267', 500, 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `comment` text CHARACTER SET latin1 NOT NULL,
  `user_id` int(11) NOT NULL
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
(1, 1, 13, '20-12-2017', 3),
(2, 15, 660, '2017-03-09T01:50:27.776', 2),
(3, 15, 660, '2017-03-09T01:52:26.675', 1),
(4, 15, 661, '2017-03-09T02:05:27.348', 1),
(5, 10, 659, '2017-03-09T02:26:24.112', 3),
(6, 15, 659, '2017-03-09T02:26:31.573', 3),
(7, 15, 660, '2017-03-09T13:49:12.357', 1),
(8, 15, 660, '2017-03-09T15:24:50.399', 1);

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
(659, 'sfa', 23, 17, '', '', '2017-03-04', 'upload/yourCart.png', 1),
(660, 'nokia 3310 new', 120, 292, 'Nokia', 'good mobile new', '2017-03-04', 'upload/1488650753165Nokia-3310_Front_Full_2.jpg', 3),
(661, '3', 3, 15, '3', '3', '2017-03-05', 'upload/1488696641611github-6-xxl.png', 1);

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
(1, 'new Nokia', 'Arrive now to egypt', 'good mobile new', 'upload/1488650753165Nokia-3310_Front_Full_2.jpg', 660),
(2, 'Hi slide', 'lorem lorem lorem ', 'lorem lorem lorem lorem lorem lorem ', 'upload/1488696641611github-6-xxl.png', 661);

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
  `password` varchar(200) CHARACTER SET latin1 NOT NULL,
  `creaditCard` varchar(50) CHARACTER SET latin1 NOT NULL,
  `cash` double NOT NULL,
  `role` varchar(50) CHARACTER SET latin1 NOT NULL,
  `photo` varchar(200) CHARACTER SET latin1 NOT NULL DEFAULT 'upload/profile.jpg'
) ENGINE=InnoDB DEFAULT CHARSET=utf32;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `email`, `address`, `job`, `password`, `creaditCard`, `cash`, `role`, `photo`) VALUES
(1, 'mohamed', 'mohamed.motyim33@gmail.com', 'alexandria', 'java dev', 'c2a2c8637590d5dd61c457cc1724ecdfa2c47062ec9c584613c099caabbd1ea8d3e4116a8d62e9fe07722dbe6ff382bec09c10fa4019723ae3f1b1286a186684', '1234-1234-1234-1234', 500, 'admin', 'upload/profile.jpg'),
(5, 'osama', 'osama@mos.com', 'giza', 'java dev', '123', '4444-4444-4444-4444', 0, 'user', 'upload/profile.jpg'),
(10, 'motyim', 'mohamed.motyim@gmail.com', 'alexandria', 'java Developer', 'c2a2c8637590d5dd61c457cc1724ecdfa2c47062ec9c584613c099caabbd1ea8d3e4116a8d62e9fe07722dbe6ff382bec09c10fa4019723ae3f1b1286a186684', '8888-8888-8888-8888', 1034, 'user', 'upload/1488576281799logo.png'),
(11, 'zzzz', 'zzzzzz@zcz.com', 'asf', 'asf', '1212', '2323-2323-2323-2323', 725, 'user', 'upload/profile.jpg'),
(12, 'kasjfkl', 'sajdjsalk@asjkl.xom', 'asdsad', 'asdasd', '123', '4747-4747-4747-4747', 0, 'user', 'upload/1489086926042Capture.PNG'),
(13, 'ahmed', 'ahmed@gmail.com', 'alexandria', 'asdasd', '123', '1478-1596-1235-1485', 488, 'user', 'upload/profile.jpg'),
(14, 'ahmed2', 'ahmed2@gmail.com', 'alexandria', 'google', '123', '1596-6875-9856-5423', 899, 'user', 'upload/profile.jpg'),
(15, 'omar', 'omar@google.com', 'alexandria', 'ad', '56b10badea2ca8551450c570fb7fd12ef475831ee050a9ba75920b529550fba7ad5366bc3e623cf3811e194887feb60a49470330b17fc438d7aa6866366e97e8', '1236-9874-8532-6521', 960, 'user', 'upload/profile.jpg');

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
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`id`),
  ADD KEY `product_id` (`product_id`),
  ADD KEY `user_id` (`user_id`);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `charge`
--
ALTER TABLE `charge`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `comments`
--
ALTER TABLE `comments`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `history`
--
ALTER TABLE `history`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=662;
--
-- AUTO_INCREMENT for table `slides`
--
ALTER TABLE `slides`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
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
-- Constraints for table `comments`
--
ALTER TABLE `comments`
  ADD CONSTRAINT `comments_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `comments_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

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
