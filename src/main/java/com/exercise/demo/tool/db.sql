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

insert into repertory values (1,'天猫一号仓','北京');
insert into repertory values (2,'二号仓','上海');
insert into repertory values (3,'三号仓','广州');
insert into repertory values (4,'珠三角仓库','深圳');
insert into repertory values (5,'山东仓','济南');
insert into repertory values (6,'安徽集散','合肥');
insert into repertory values (7,'江西集散','鹰潭');


insert into relation values (1,1,1);
insert into relation values (2,1,2);
insert into relation values (3,2,3);
insert into relation values (4,2,4);
insert into relation values (5,3,5);
insert into relation values (6,4,6);
insert into relation values (7,5,7);

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

