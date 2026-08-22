CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    set n = n-1;
  RETURN (
        select distinct e.salary
        from Employee e
        order by e.salary desc
        limit 1 offset N
  );
END