create table maxwell_user(
    user_id bigint(40) not null,
    user_name varchar(64) not null,
    user_phone varchar(64) default null,
    user_email varchar(128) default null,
    user_password varchar(256) not null,
    create_time datetime not null default current_timestamp comment '创建时间',
    update_time datetime not null default current_timestamp on update current_timestamp comment '更新时间',
    primary key(`user_id`),
    unique key(`user_name`),
    index phone_idx(`user_phone`),
    index email_idx(`user_email`)
)engine=innodb default charset=utf8mb4 comment='用户表';

create table maxwell_user_role(
    id bigint(40) not null auto_increment,
    user_id bigint(40) not null,
    role_id bigint(40) not null,
    create_time datetime not null default current_timestamp comment '创建时间',
    update_time datetime not null default current_timestamp on update current_timestamp comment '更新时间',
    primary key(`id`),
    index user_id_idx(`user_id`)
)engine=innodb default charset=utf8mb4 comment='用户角色关联表';

create table maxwell_role(
    role_id bigint(40) not null,
    role_name varchar(64) not null,
    role_describe varchar(128) default null,
    create_time datetime not null default current_timestamp comment '创建时间',
    update_time datetime not null default current_timestamp on update current_timestamp comment '更新时间',
    primary key(`role_id`)
)engine=innodb default charset=utf8mb4 comment='用户角色表';

create table maxwell_permission(
    permission_id bigint(40) not null,

)engine=innodb default charset=utf8mb4 comment='用户角色表';