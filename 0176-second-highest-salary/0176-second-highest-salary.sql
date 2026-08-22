# Write your MySQL query statement below
select(
    select e.salary 
    from Employee as e
    group by e.salary
    order by e.salary desc
    limit 1 offset 1
) as SecondHighestSalary;
