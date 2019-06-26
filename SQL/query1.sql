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
--display salary of scott
select sal from emp where ename="scott"
--display employee having same salary of scott
select ename,sal from emp where sal IN(select sal from emp where ename="scott"); 
--display employee working in same dept of blake
select ename,deptno from emp where deptno IN(select deptno from emp where ename="blake");
--display no of emp's
select count(*) from emp
-- avg of sal 
select avg(sal) from emp
--sum of sal
select sum(sal) from emp
--deptnowise 
select count(deptno) as empcount,deptno from emp group by (deptno);
--jobwise
select count(deptno) as jobcount,job from emp group by (job);
--deptwise and jobwise--
select count(job) as empcount,deptno,job from emp group by deptno,job;
select * from emp;
--deptwise,jobwise and having employee count greater than equal to 2--
select count(job) as empcount,deptno,job
from emp 
group by deptno,job
having count(job)>=2;
--order by job in desc
select count(job) as empcount,deptno,job
from emp 
group by deptno,job
having count(job)>=2
order by job desc; 
--select deptno=10 and 20 emp's 
select count(job) as empcount,deptno,job 
from emp
where deptno=10 OR deptno=20
group by deptno,job
having count(job)>=2
order by job desc;
--inner join & empname and deptname in lowercase
select lower(e.ename) as empname,lower(d.dname) as deptname
from emp e 
join dept d 
ON e.DEPTNO=d.deptno; 
--display all deptname and empname
select d.dname ,e.ename
from dept d
left outer join emp e
on d.deptno=e.deptno;
--display dept there is no emp
select d.dname
from dept d
left outer join emp e
on d.deptno=e.deptno
where ename IS NULL;
--display employee name and its manager
select lower(e1.ename) as empname,lower(e2.ename) as manager
from emp e1
left outer join emp e2
on e1.MGR=e2.EMPNO ;
--display ename managername and deptname
select lower(e1.ename) as empname,lower(e2.ename)as manager,d.dname as deptname
from emp e1
left outer join emp e2
on e1.MGR=e2.EMPNO 
join dept d
on  e1.deptno=d.deptno;





select * from emp;
select * from dept;





