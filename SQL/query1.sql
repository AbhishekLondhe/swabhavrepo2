select * from emp;
--display emp in ascending order
select * from emp order by ename;
--display employees dept no=10--
select * from emp where deptno=10;
--display employees dept no=20 and 10
select * from emp where deptno=20 OR deptno=10;
-- display employees commision=null 
select * from emp where comm IS NULL;
-- display employees whose salary between 2000 and 5000
select * from emp where sal between 2000 AND 5000;
-- display employees name salary commission annual CTC
select * ,(sal+ IFNULL(comm,0))*12 as CTC from emp; 
-- display employees job=clerks
select * from emp where job="clerk";
--diplay name ,hiredate ,experience
select ename,hiredate,date_format(from_days(datediff(CURDATE(),hiredate)),'%Y' )+0 as experience from emp;
--display employees unique dept no in emp
select distinct deptno from emp;
