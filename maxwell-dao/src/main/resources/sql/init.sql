drop database if exists `db_maxwell`;
create database `db_maxwell`;
use db_maxwell;
drop table if exists `maxwell_test`;
create table `maxwell_test`(
    `id` bigint(40) not null auto_increment comment '自增id',
    `maxwell_username` varchar(128) not null comment '用户名',
    `maxwell_password` varchar(256) not null comment '密码',
    `create_time` datetime not null default current_timestamp comment '创建时间',
    `update_time` datetime not null default current_timestamp on update current_timestamp comment '更新时间',
    primary key (`id`),
    unique key(`maxwell_username`)
)engine=innodb default charset=utf8mb4 comment='测试表';