/*
 Navicat Premium Data Transfer

 Source Server         : MYSQL
 Source Server Type    : MySQL
 Source Server Version : 80030 (8.0.30)
 Source Host           : localhost:3306
 Source Schema         : ecartv3

 Target Server Type    : MySQL
 Target Server Version : 80030 (8.0.30)
 File Encoding         : 65001

 Date: 19/05/2023 09:45:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for brand
-- ----------------------------
DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand` (
  `brand_id` int NOT NULL,
  `brand_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`brand_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of brand
-- ----------------------------
BEGIN;
INSERT INTO `brand` (`brand_id`, `brand_name`) VALUES (152, 'Nike');
INSERT INTO `brand` (`brand_id`, `brand_name`) VALUES (153, 'Adidas');
INSERT INTO `brand` (`brand_id`, `brand_name`) VALUES (154, 'Apple');
INSERT INTO `brand` (`brand_id`, `brand_name`) VALUES (155, 'Samsung');
INSERT INTO `brand` (`brand_id`, `brand_name`) VALUES (156, 'Sony');
INSERT INTO `brand` (`brand_id`, `brand_name`) VALUES (157, 'Canon');
INSERT INTO `brand` (`brand_id`, `brand_name`) VALUES (158, 'Dell');
INSERT INTO `brand` (`brand_id`, `brand_name`) VALUES (159, 'HP');
INSERT INTO `brand` (`brand_id`, `brand_name`) VALUES (160, 'LG');
INSERT INTO `brand` (`brand_id`, `brand_name`) VALUES (161, 'Microsoft');
COMMIT;

-- ----------------------------
-- Table structure for brands_info
-- ----------------------------
DROP TABLE IF EXISTS `brands_info`;
CREATE TABLE `brands_info` (
  `category_id` int NOT NULL,
  `brand_id` int NOT NULL,
  KEY `FKt3damb0b1g71lnqcn2l7x2p3e` (`brand_id`),
  KEY `FK6fgta9s58o361qujpeqgv228h` (`category_id`),
  CONSTRAINT `FK6fgta9s58o361qujpeqgv228h` FOREIGN KEY (`category_id`) REFERENCES `categories` (`category_id`),
  CONSTRAINT `FKt3damb0b1g71lnqcn2l7x2p3e` FOREIGN KEY (`brand_id`) REFERENCES `brand` (`brand_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of brands_info
-- ----------------------------
BEGIN;
INSERT INTO `brands_info` (`category_id`, `brand_id`) VALUES (202, 154);
INSERT INTO `brands_info` (`category_id`, `brand_id`) VALUES (202, 155);
INSERT INTO `brands_info` (`category_id`, `brand_id`) VALUES (202, 156);
INSERT INTO `brands_info` (`category_id`, `brand_id`) VALUES (202, 157);
INSERT INTO `brands_info` (`category_id`, `brand_id`) VALUES (202, 158);
INSERT INTO `brands_info` (`category_id`, `brand_id`) VALUES (202, 159);
INSERT INTO `brands_info` (`category_id`, `brand_id`) VALUES (202, 160);
INSERT INTO `brands_info` (`category_id`, `brand_id`) VALUES (202, 161);
INSERT INTO `brands_info` (`category_id`, `brand_id`) VALUES (207, 156);
COMMIT;

-- ----------------------------
-- Table structure for categories
-- ----------------------------
DROP TABLE IF EXISTS `categories`;
CREATE TABLE `categories` (
  `category_id` int NOT NULL,
  `category_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of categories
-- ----------------------------
BEGIN;
INSERT INTO `categories` (`category_id`, `category_name`) VALUES (202, 'Electronics');
INSERT INTO `categories` (`category_id`, `category_name`) VALUES (203, 'Clothing');
INSERT INTO `categories` (`category_id`, `category_name`) VALUES (204, 'Beauty');
INSERT INTO `categories` (`category_id`, `category_name`) VALUES (205, 'Books');
INSERT INTO `categories` (`category_id`, `category_name`) VALUES (206, 'Home & Kitchen');
INSERT INTO `categories` (`category_id`, `category_name`) VALUES (207, 'Toys & Games');
INSERT INTO `categories` (`category_id`, `category_name`) VALUES (208, 'Sports & Outdoors');
INSERT INTO `categories` (`category_id`, `category_name`) VALUES (209, 'Health');
INSERT INTO `categories` (`category_id`, `category_name`) VALUES (210, 'Automotive');
INSERT INTO `categories` (`category_id`, `category_name`) VALUES (211, 'Pet Supplies');
COMMIT;

-- ----------------------------
-- Table structure for hibernate_sequences
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequences`;
CREATE TABLE `hibernate_sequences` (
  `sequence_name` varchar(255) NOT NULL,
  `next_val` bigint DEFAULT NULL,
  PRIMARY KEY (`sequence_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of hibernate_sequences
-- ----------------------------
BEGIN;
INSERT INTO `hibernate_sequences` (`sequence_name`, `next_val`) VALUES ('default', 550);
COMMIT;

-- ----------------------------
-- Table structure for price
-- ----------------------------
DROP TABLE IF EXISTS `price`;
CREATE TABLE `price` (
  `price_id` int NOT NULL,
  `product_price` double NOT NULL,
  PRIMARY KEY (`price_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of price
-- ----------------------------
BEGIN;
INSERT INTO `price` (`price_id`, `product_price`) VALUES (2, 1000);
INSERT INTO `price` (`price_id`, `product_price`) VALUES (3, 1500);
INSERT INTO `price` (`price_id`, `product_price`) VALUES (4, 999.99);
INSERT INTO `price` (`price_id`, `product_price`) VALUES (5, 500);
INSERT INTO `price` (`price_id`, `product_price`) VALUES (6, 699);
INSERT INTO `price` (`price_id`, `product_price`) VALUES (7, 129.99);
INSERT INTO `price` (`price_id`, `product_price`) VALUES (8, 599);
INSERT INTO `price` (`price_id`, `product_price`) VALUES (9, 799);
INSERT INTO `price` (`price_id`, `product_price`) VALUES (10, 1299);
INSERT INTO `price` (`price_id`, `product_price`) VALUES (11, 899);
INSERT INTO `price` (`price_id`, `product_price`) VALUES (302, 12000);
INSERT INTO `price` (`price_id`, `product_price`) VALUES (402, 145000);
COMMIT;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `product_id` int NOT NULL,
  `keywords` varchar(255) DEFAULT NULL,
  `product_image` varchar(255) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `rating` double NOT NULL,
  `price_id` int DEFAULT NULL,
  `stock_id` int DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `FK2l5ugesxirs8wp4iqcmji7g8m` (`price_id`),
  KEY `FK90w0j7y2y7chsmk4v4k02ekqf` (`stock_id`),
  CONSTRAINT `FK2l5ugesxirs8wp4iqcmji7g8m` FOREIGN KEY (`price_id`) REFERENCES `price` (`price_id`),
  CONSTRAINT `FK90w0j7y2y7chsmk4v4k02ekqf` FOREIGN KEY (`stock_id`) REFERENCES `stock` (`stock_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of product
-- ----------------------------
BEGIN;
INSERT INTO `product` (`product_id`, `keywords`, `product_image`, `product_name`, `rating`, `price_id`, `stock_id`, `description`) VALUES (1, 'Apple iPhone 13, A15 Bionic chip, iOS 15', 'iphone-13.jpg', 'iPhone 13', 4.5, 2, 52, NULL);
INSERT INTO `product` (`product_id`, `keywords`, `product_image`, `product_name`, `rating`, `price_id`, `stock_id`, `description`) VALUES (102, 'Samsung Galaxy Z Fold 3, foldable AMOLED display', 'galaxy-z-fold-3.jpg', 'Samsung Galaxy Z Fold 3', 4, 3, 53, NULL);
INSERT INTO `product` (`product_id`, `keywords`, `product_image`, `product_name`, `rating`, `price_id`, `stock_id`, `description`) VALUES (103, 'Apple MacBook Pro, M1 chip, macOS Monterey', 'macbook-pro.jpg', 'MacBook Pro', 4.8, 4, 54, NULL);
INSERT INTO `product` (`product_id`, `keywords`, `product_image`, `product_name`, `rating`, `price_id`, `stock_id`, `description`) VALUES (104, 'Microsoft Xbox Series X, 4K gaming, 120fps', 'xbox-series-x.jpg', 'Xbox Series X', 4.3, 5, 55, NULL);
INSERT INTO `product` (`product_id`, `keywords`, `product_image`, `product_name`, `rating`, `price_id`, `stock_id`, `description`) VALUES (105, 'Sony Alpha a6600, 24.2MP, 4K video', 'sony-alpha-a6600.jpg', 'Sony Alpha a6600', 4.7, 6, 56, NULL);
INSERT INTO `product` (`product_id`, `keywords`, `product_image`, `product_name`, `rating`, `price_id`, `stock_id`, `description`) VALUES (106, 'Apple AirPods Pro, active noise cancellation, spatial audio', 'airpods-pro.jpg', 'AirPods Pro', 4.5, 7, 57, NULL);
INSERT INTO `product` (`product_id`, `keywords`, `product_image`, `product_name`, `rating`, `price_id`, `stock_id`, `description`) VALUES (107, 'Canon EOS R6, 20.1MP, 4K video', 'canon-eos-r6.jpg', 'Canon EOS R6', 4.6, 8, 58, NULL);
INSERT INTO `product` (`product_id`, `keywords`, `product_image`, `product_name`, `rating`, `price_id`, `stock_id`, `description`) VALUES (108, 'DJI Mavic Air 2S, 4K/60fps video, 1/2-inch CMOS sensor', 'dji-mavic-air-2s.jpg', 'DJI Mavic Air 2S', 4.8, 9, 59, NULL);
INSERT INTO `product` (`product_id`, `keywords`, `product_image`, `product_name`, `rating`, `price_id`, `stock_id`, `description`) VALUES (109, 'LG C1 Series OLED TV, 4K Ultra HD, HDR10, Dolby Vision', 'lg-c1-oled-tv.jpg', 'LG C1 Series OLED TV', 4.9, 10, 60, NULL);
INSERT INTO `product` (`product_id`, `keywords`, `product_image`, `product_name`, `rating`, `price_id`, `stock_id`, `description`) VALUES (110, 'Sony PlayStation 5, 4K gaming, 120fps', 'playstation-5.jpg', 'PlayStation 5', 4.4, 11, 61, NULL);
INSERT INTO `product` (`product_id`, `keywords`, `product_image`, `product_name`, `rating`, `price_id`, `stock_id`, `description`) VALUES (252, 'Samsung', NULL, 'Samsung  A9', 0, 302, 1, '256 GB');
INSERT INTO `product` (`product_id`, `keywords`, `product_image`, `product_name`, `rating`, `price_id`, `stock_id`, `description`) VALUES (352, 'Apple,ipad', NULL, 'Ipad Pro 2022', 0, 402, 452, 'Ipad Pro 6th Gen 2022 256 GB');
COMMIT;

-- ----------------------------
-- Table structure for products_brands
-- ----------------------------
DROP TABLE IF EXISTS `products_brands`;
CREATE TABLE `products_brands` (
  `brand_id` int NOT NULL,
  `product_id` int NOT NULL,
  UNIQUE KEY `UK_9keoo7u6y3antjc8n5j057aw1` (`product_id`),
  KEY `FKkgswi4rtwllelxqn5vxiq7y56` (`brand_id`),
  CONSTRAINT `FKkgswi4rtwllelxqn5vxiq7y56` FOREIGN KEY (`brand_id`) REFERENCES `brand` (`brand_id`),
  CONSTRAINT `FKsv98rok4foyxx4p74lu3wyqi1` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of products_brands
-- ----------------------------
BEGIN;
INSERT INTO `products_brands` (`brand_id`, `product_id`) VALUES (154, 1);
INSERT INTO `products_brands` (`brand_id`, `product_id`) VALUES (154, 103);
INSERT INTO `products_brands` (`brand_id`, `product_id`) VALUES (154, 106);
INSERT INTO `products_brands` (`brand_id`, `product_id`) VALUES (154, 352);
INSERT INTO `products_brands` (`brand_id`, `product_id`) VALUES (155, 252);
INSERT INTO `products_brands` (`brand_id`, `product_id`) VALUES (156, 105);
INSERT INTO `products_brands` (`brand_id`, `product_id`) VALUES (156, 110);
COMMIT;

-- ----------------------------
-- Table structure for stock
-- ----------------------------
DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `stock_id` int NOT NULL,
  `stock_items` int NOT NULL,
  PRIMARY KEY (`stock_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of stock
-- ----------------------------
BEGIN;
INSERT INTO `stock` (`stock_id`, `stock_items`) VALUES (1, 100);
INSERT INTO `stock` (`stock_id`, `stock_items`) VALUES (52, 54);
INSERT INTO `stock` (`stock_id`, `stock_items`) VALUES (53, 50);
INSERT INTO `stock` (`stock_id`, `stock_items`) VALUES (54, 200);
INSERT INTO `stock` (`stock_id`, `stock_items`) VALUES (55, 150);
INSERT INTO `stock` (`stock_id`, `stock_items`) VALUES (56, 100);
INSERT INTO `stock` (`stock_id`, `stock_items`) VALUES (57, 500);
INSERT INTO `stock` (`stock_id`, `stock_items`) VALUES (58, 300);
INSERT INTO `stock` (`stock_id`, `stock_items`) VALUES (59, 50);
INSERT INTO `stock` (`stock_id`, `stock_items`) VALUES (60, 20);
INSERT INTO `stock` (`stock_id`, `stock_items`) VALUES (61, 100);
INSERT INTO `stock` (`stock_id`, `stock_items`) VALUES (452, 49);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
