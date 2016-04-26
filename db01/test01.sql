1. MySQL 클라이언트 실행
mysql -u java80 -p

2. 사용 가능한 DB 목록
show databases;

3. 사용할 DB 선택
use java80db;

4. DB에 존재하는 테이블 목록
show tables;

5. 테이블 생성
>create table 테이블명(컬럼 정보);

create table test01(
  /* 컬럼명 타입 기타옵션 */
  tno int,
  name char(5)
);


6. 값 입력
insert into 테이블명(컬럼명,컬럼명,....) values(값, 값,....)

insert into test01(name,tno) values('hong', 1);
insert into test01(name,tno) values('park', 2);
insert into test01(name,tno) values('lee', 3);
insert into test01(name,tno) values('kim', 4);
insert into test01(name,tno) values('cho', 5);
insert into test01(name,tno) values('choi', 6);
/* 숫자 자리에 문자를 넣으면 0으로 변환되서 들어간다. */


7. 값 꺼내기
select * from 테이블명;
select 컬럼명,컬럼명,.... from 테이블명;

select * from test01;


8. 값 변경하기
update 테이블명 set 컬럼명=값,컬럼명=값,... where 조건;

update test01 set name='오호라' where tno=3; /* where 조 */


9. 값 삭제하기
delete from 테이블명 where 조건

delete from test01 where tno=3; /* where 조심 */


10. 테이블 삭제하기
drop table 테이블명;

drop table test01;



