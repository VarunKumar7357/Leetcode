# Write your MySQL query statement below
SELECT ee.unique_id , e.name
FROM EmployeeUNI AS ee 
RIGHT JOIN Employees AS e
ON ee.id=e.id ;