-- Write an SQL query to report the second highest salary from the
-- Employee table. If there is no second highest salary,
-- the query should report null.


WITH ordered_salaries AS (SELECT salary,
                                 DENSE_RANK() OVER (ORDER BY salary DESC) AS rank_
                          FROM Employee)
SELECT MAX(salary) AS SecondHighestSalary
FROM ordered_salaries
WHERE rank_ = 2
;
