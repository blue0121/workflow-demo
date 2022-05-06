create table if not exists t_user (
    id                     int                auto_increment primary key ,
    username               varchar(40)        not null,
    password               varchar(50)        not null,
    status                 varchar(20)        not null,
    register_time          datetime           not null default current_timestamp
);