# Write your MySQL query statement below

select e.employee_id
from Employees e
where e.salary < 30000 
    and e.manager_id not in (
        select distinct employee_id 
        from Employees
    )
    and e.manager_id is not null
order by e.employee_id;