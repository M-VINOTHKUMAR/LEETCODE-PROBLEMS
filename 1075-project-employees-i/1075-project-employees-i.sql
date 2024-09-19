# Write your MySQL query statement below
SELECT   project_id ,
    round(avg(experience_years),2) average_years
from  Project join Employee
using (employee_id)
group by project_id;