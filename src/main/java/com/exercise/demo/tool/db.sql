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
CREATE TABLE relation(
  relationid int(6) PRIMARY  KEY auto_increment,
  gid int(6),
  rid int(6),
  FOREIGN KEY (gid) REFERENCES goods(gid),
  FOREIGN KEY (rid) REFERENCES repertory(rid)
)DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
CREATE TABLE sku(
  sid int(6) PRIMARY  KEY auto_increment,
  gid int(6),
  scolor varchar(20) NOT NULL,
  ssize varchar(20) NOT NULL,
  sstyle varchar(50) NOT NULL,
  FOREIGN KEY(gid) REFERENCES goods(gid)
)DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
insert into repertory values (1,'0001','beijing');
insert into repertory values (2,'0002','shanghai');
insert into repertory values (3,'0003','shanghai');
insert into repertory values (4,'0004','shanghai');
insert into repertory values (5,'0005','shanghai');
insert into repertory values (6,'0006','shanghai');
insert into repertory values (7,'0007','shanghai');


insert into relation values (1,1,1);
insert into relation values (2,1,2);
insert into relation values (3,2,3);
insert into relation values (4,2,4);
insert into relation values (5,3,5);

insert into goods values (1,'shirt');
insert into goods values (2,'coat');
insert into goods values (3,'sweater');
insert into goods values (4,'shirt');
insert into goods values (5,'coat');
insert into goods values (6,'sweater');
insert into goods values (7,'sweater');
insert into sku values (1,1,'red','XL','new-style1');
insert into sku values (2,2,'green','XL','new-style2');
insert into sku values (3,3,'yellow','XL','new-style3');
insert into sku values (4,4,'red','XL','new-style1');
insert into sku values (5,5,'green','XL','new-style2');
insert into sku values (6,6,'yellow','XL','new-style3');

