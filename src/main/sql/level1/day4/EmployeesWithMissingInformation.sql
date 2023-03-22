-- Write an SQL query to report the IDs of all the employees with missing information. The information of an employee is missing if:
--
-- The employee's name is missing, or
-- The employee's salary is missing.
-- Return the result table ordered by employee_id in ascending order.


SELECT E.employee_id
FROM Employees AS E
         LEFT JOIN Salaries AS S
                   ON E.employee_id = S.employee_id
WHERE S.salary IS NULL

UNION

SELECT S.employee_id
FROM Salaries AS S
         LEFT JOIN Employees AS E
                   ON S.employee_id = E.employee_id
WHERE E.name IS NULL

ORDER BY employee_id;
