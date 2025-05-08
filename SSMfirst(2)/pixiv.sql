/*
 Navicat Premium Data Transfer

 Source Server         : eee
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3305
 Source Schema         : pixiv

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 09/05/2025 00:00:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for card
-- ----------------------------
DROP TABLE IF EXISTS `card`;
CREATE TABLE `card`  (
  `card_id` int(11) NOT NULL AUTO_INCREMENT,
  `card_type` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `card_title` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `card_img` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `card_content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
  `card_time` datetime NULL DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`card_id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE,
  CONSTRAINT `card_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of card
-- ----------------------------
INSERT INTO `card` VALUES (1, '生活品味', '中国人必须知道的常识', 'VCG41N1303010726.jpg', '321', '2025-04-25 19:51:19', 1);
INSERT INTO `card` VALUES (2, '美食', '大盘鸡', 'VCG211313709971.jpg', '123', '2025-04-25 22:44:28', 1);
INSERT INTO `card` VALUES (3, '美食', '牛角包的制作', 'VCG41N2193319722.jpg', '12345', '2025-04-25 23:09:51', 2);
INSERT INTO `card` VALUES (9, '旅行', '旅行必备', 'av.jpg', '75757865786', '2025-04-26 00:56:00', 1);
INSERT INTO `card` VALUES (10, '电子竞技', '电子竞技菜就多练', 'VCG41N1409046652.jpg', '你好', '2025-04-26 00:59:00', 1);

-- ----------------------------
-- Table structure for post
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post`  (
  `post_id` int(11) NOT NULL AUTO_INCREMENT,
  `post_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `post_context` text CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL,
  PRIMARY KEY (`post_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES (1, '学习的好处', '12324125 15');
INSERT INTO `post` VALUES (2, '中国人如何生活', '21532523545');
INSERT INTO `post` VALUES (3, '你好', '12324125 15');
INSERT INTO `post` VALUES (4, '大家好', '21532523545');
INSERT INTO `post` VALUES (5, '所有人好', '123523445');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_code` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `user_name` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `user_password` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `user_state` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '001', '曲冠豪', '123', '男');
INSERT INTO `user` VALUES (2, '002', '小明', '123', '男');
INSERT INTO `user` VALUES (3, '003', '小红', '123', '女');
INSERT INTO `user` VALUES (4, '曲冠豪', '曲冠豪', '123', '男');

SET FOREIGN_KEY_CHECKS = 1;
