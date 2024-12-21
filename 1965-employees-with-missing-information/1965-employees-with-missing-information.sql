SELECT
   t.employee_id
from
   (
    select  * from Employees e left join Salaries using(employee_id)
    union
    select * from Salaries left join Employees using(employee_id)
   )
as t
where
    salary is null or name is null
order by
       t.employee_id;