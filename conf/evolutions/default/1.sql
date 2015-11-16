# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table student_member (
  first_name                varchar(255),
  last_name                 varchar(255),
  major                     varchar(255),
  second_major              varchar(255),
  email                     varchar(255),
  class_level               varchar(255),
  grad_year                 varchar(255),
  password                  varchar(255),
  pid                       varchar(255),
  home_town                 varchar(255))
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists student_member;

SET REFERENTIAL_INTEGRITY TRUE;

