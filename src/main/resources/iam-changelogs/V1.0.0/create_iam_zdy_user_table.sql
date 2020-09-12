--liquibase formatted sql

--changeset zhudayang:20200905-01
CREATE TABLE `zdy_user` (
    `id` int (11) NOT NULL AUTO_INCREMENT,
    `user_name` varchar (60) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
    `pass_word` varchar (60) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE =InnoDB DEFAULT CHARSET =utf8mb4 COLLATE =utf8mb4_unicode_ci COMMENT '用户账户表';
