/* 주제: 컬럼의 타입
 */

1. char(n) 타입의 특징
=> n은 컬럼의 크기. n보다 작은 개수의 문자열을 넣더라도 무조건 n개의 크기를 차지한다.
=> 문자열을 넣을 때 최대 n개수를 넣을 수 있다.
=> 컬럼의 크기가 고정되었기 때문에 검색할 때 데이터를 찾기가 쉽다. 속도가 빠르다.
   문자열의 개수가 적더라도 같은 크기를 갖기 때문에 메모리 낭비가 있다.
drop table test01;
create table test01(
  tno int primary key, 
  name char(5) default '홍길동',
  email char(10) unique
);


2. varchar(n) 타입의 특징
=> variable character의 약자. 가변 크기를 갖는다.
=> 최대 n개의 문자열을 넣을 수 있다. 문자열 크기 만큼 컬럼의 크기가 결정된다.
=> 값을 넣는 개수만큼 메모리를 사용하기 때문에 메모리가 절약된다.
   메모리의 크기가 가변적이기 때문에 값을 찾는데 char보다 시간이 더 걸린다.
drop table test01;
create table test01(
  tno int primary key, 
  name varchar(5) default '홍길동',
  email varchar(10) unique
);


3. char(n), varchar(n)의 메모리 크기
=> char(n) : n은 최대 255개의 글자수를 의미한다. (MySQL의 경우)
=> varchar(n) : n은 최대 65535 바이트까지 저장 가능한 글자 수.
                예) UTF8인 경우 한글이 3바이트를 사용하기 때문에
                    약 21844 글자를 지정할 수 있다.
                만약 65535바이트 크기를 넘어가는 글자수를 지정하는 경우
                MySQL에서 자동으로 그에 맞는 타입으로 변경한다.
=> 긴 글을 저장할 때
   text (2^16 bytes; 64KB), mediumtext(2^24 byte; 1.6MB), longtext(2^32; 4GB)
   오라클의 경우 "CLOB(Character Large OBject)"; 2GB
drop table test01;
create table test01(
  tno int primary key, 
  email varchar(10) unique not null,
  name varchar(20) not null,
  intro text
);


4. date, datetime 타입
=> date: 날짜
=> datetime: 날짜와 시간
drop table test01;
create table test01(
  tno int primary key, 
  email varchar(10) unique not null,
  name varchar(20) not null,
  intro text,
  cre_dt date,
  upd_dt datetime
);

insert into test01(tno,email,name,cre_dt) values(1,'aaa','aaa','2016-2-2');
insert into test01(tno,email,name,cre_dt) values(2,'bbb','bbb','2016-2-2 12:17:02');
insert into test01(tno,email,name,cre_dt,upd_dt) values(3,'ccc','ccc','2016-2-2','2015-5-5 10:10:11');
/* 3 | ccc | ccc | NULL | 2016-02-02 | 2015-05-05 10:10:11 */
