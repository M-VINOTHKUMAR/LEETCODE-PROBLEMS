# Write your MySQL query statement below
select unique_id, name 
from Employees e
left join EmployeeUNI eu
using(id);