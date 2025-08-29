# Write your MySQL query statement below
SELECT e1.unique_id,e.name
FROM Employees e
LEFT JOIN EmployeeUNI e1
ON e.id=e1.id;