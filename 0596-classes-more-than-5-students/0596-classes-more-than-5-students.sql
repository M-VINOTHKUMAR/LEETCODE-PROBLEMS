# Write your MySQL query statement below
SELECT class 
from Courses 
group by class
having count(student)>=5;