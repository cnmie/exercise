drop database if exists exercise;
create database exercise;
use exercise;
CREATE TABLE `repertory` (
  `rid` int(6) PRIMARY KEY auto_increment,
  `rname` varchar(50) NOT NULL,
  `raddress` varchar(50) NOT NULL
)DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
CREATE TABLE `goods` (
  `gid` int(6) PRIMARY KEY auto_increment,
  `gname` varchar(50) NOT NULL
)DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;

insert into repertory values (1,'0001','beijing');
insert into repertory values (2,'0002','shanghai');