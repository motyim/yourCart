-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 15, 2017 at 09:35 AM
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
(1, 'upload/14895648520311489174392739shipping.jpg', 'https://www.google.com.eg/'),
(2, 'upload/14895648625391488650374437Nokia-3310_Front_Full_2.jpg', 'https://www.google.com.eg/?gfe_rd=cr&ei=qvTIWIr7AbPCXpbCovgD');

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
(5, 'watches');

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
(1, '665029584d93a21c', 500, 1, 1),
(2, '48424c8427501939', 500, 0, 0);

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
(1, 2, 3, '2017-03-15T10:24:43.477', 2);

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
(1, 'watch x500', 80, 3, 'x500', 'from swatch company', '2017-03-15', 'upload/1489563171202PinkWatch_big.png', 5),
(2, 'Asus', 3000, 3, 'Asus', '6 GB  Rams\r\ni7\r\ntera', '2017-03-15', 'upload/148956338268578.png', 2),
(3, 'Nokia HeadPhone', 50, 28, 'Nokia', 'Crystal clear calls with HD sound is what the TM010 Bluetooth Headphones are all about. The headphones are a combination of stylish design and modern technology. They are an ideal choice for people who like to enjoy their music wirelessly from their handsets or laptops. ', '2017-03-15', 'upload/1489563769035Redheadphones_big.png', 2),
(4, 'HTC Desire 728 Ultra', 1000, 5, 'HTC', 'The HTC Desire 728 Ultra Dual SIM looks as good at the office as it does out on the town. Sleek, elegant and keeps your personal life separate from your work life. Featuring a beautiful 7.8mm thin design in black gold, this elegant HTC Desire 728 Ultra Dual SIM is designed ...', '2017-03-15', 'upload/1489564629111item_XL_11580536_28457068.jpg', 1),
(5, 'Blue HeadPhone', 20, 30, 'Sony', 'Headphone blue ', '2017-03-15', 'upload/1489565006872BlueHeadphones_big.png', 2),
(6, 'Infinix Hot S X521 Dual Sim', 50, 12, 'Infinix', 'Featuring a 5.2inch HD IPS display, the Infinix Hot S X521 Dual SIM smartphone is sure to pull you into an immersive entertainment experience. The screen, backed by 450MHz Mali T720 MP3 GPU, renders 1280 x 720 pixel resolution images and makes every movie scene come to life ...', '2017-03-15', 'upload/1489565200585item_XL_11183361_15522684.jpg', 1),
(7, 'Infinix X601 Note 3', 300, 12, 'Infinix ', '6.0" IPS Capacitive Touch Screen16 GB Storage, MicroSD up to 128GB13MP Back Camera, 5MP Front CameraOcta-core 1.3 GHz CPU, 2GB RAMAndroid OS, v6.0 (Marshmallow)', '2017-03-15', 'upload/1489565625718infinix-1045-957775-1-zoom.jpg', 1),
(8, 'Asus K540LA', 2000, 12, 'Asus', 'Asus K540LA-XX706D,RD,i3,4,500,Dos', '2017-03-15', 'upload/1489565840541coasuk540la-xx706d-444x325.jpg', 2),
(9, 'HP 15-au101ne', 3335, 6, 'H', 'HP 15-au101ne', '2017-03-15', 'upload/1489565986899hp.jpg', 2),
(10, 'Apple iMac ', 10000, 1, 'Apple', 'Apple iMac MK482AE/A,i5,8G,2T', '2017-03-15', 'upload/1489566081077apple.jpg', 2);

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
(1, 'Smart Headphone', 'TM010 Red Bluetooth Headphones', 'Crystal clear calls with HD sound is what the TM010 Bluetooth Headphones are all about. The headphones are a combination of stylish design and modern technology. They are an ideal choice for people who like to enjoy their music wirelessly from their handsets or laptops. ', 'upload/1489563769035Redheadphones_big.png', 3),
(2, 'NEW HTC Moblie ', 'HTC Desire 728 Ultra Dual SIM - 32GB, 3GB RAM, 4G LTE, Black Gold', 'The HTC Desire 728 Ultra Dual SIM looks as good at the office as it does out on the town. Sleek, elegant and keeps your personal life separate from your work life. Featuring a beautiful 7.8mm thin design in black gold, this elegant HTC Desire 728 Ultra Dual SIM is designed ...', 'upload/1489564629111item_XL_11580536_28457068.jpg', 4),
(3, 'Mac ', 'New MAC in Egypt', 'Apple iMac MK482AE/A,i5,8G,2T', 'upload/1489566081077apple.jpg', 10);

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
(2, 'sara', 'sarametwalli93@gmail.com', '18', 'programmer', 'c2a2c8637590d5dd61c457cc1724ecdfa2c47062ec9c584613c099caabbd1ea8d3e4116a8d62e9fe07722dbe6ff382bec09c10fa4019723ae3f1b1286a186684', '9090-9090-9090-9090', 400, 'user', 'upload/profile.jpg');

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `cart`
--
ALTER TABLE `cart`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `charge`
--
ALTER TABLE `charge`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `history`
--
ALTER TABLE `history`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `slides`
--
ALTER TABLE `slides`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
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
