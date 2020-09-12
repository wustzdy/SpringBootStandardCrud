--liquibase formatted sql

--changeset maruijin:20200603-1
--注意：tenants表没有tenant_id字段
CREATE TABLE `iam_tenants` (
    `id` bigint(20) unsigned NOT NULL COMMENT '分布式主id',
    `owned_by_id` bigint(20) unsigned NOT NULL COMMENT '拥有者account id',
    `created_by_id` bigint(20) unsigned NOT NULL COMMENT '创建者account id',
    `created_time` datetime NOT NULL COMMENT '创建的UTC时间',
    `updated_by_id` bigint(20) unsigned DEFAULT NULL COMMENT '最后更新者account id',
    `updated_time` datetime DEFAULT NULL COMMENT '最后更新的UTC时间',
    `version` bigint(20) NOT NULL DEFAULT 0 COMMENT '乐观锁版本控制字段',
    `extras` json DEFAULT NULL COMMENT '扩展属性',

    `name` varchar(64) NOT NULL COMMENT '租户名称',
    `description` varchar(512) NOT NULL DEFAULT '' COMMENT '描述',
    `status` varchar(32) NOT NULL COMMENT '状态',

    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT '租户表';
