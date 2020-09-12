--liquibase formatted sql

--changeset maruijin:20200603-1
--注意：tenants表没有tenant_id字段
CREATE TABLE `iam_tenants` (
    `id` int (11) NOT NULL AUTO_INCREMENT,
    `name` varchar(64) NOT NULL COMMENT '租户名称',
    `description` varchar(512) NOT NULL DEFAULT '' COMMENT '描述',
    `status` varchar(32) NOT NULL COMMENT '状态',
    PRIMARY KEY (`id`)
) ENGINE =InnoDB DEFAULT CHARSET =utf8mb4 COLLATE =utf8mb4_unicode_ci COMMENT '租户表';
