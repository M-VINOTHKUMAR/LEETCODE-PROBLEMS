# Write your MySQL query statement below
select name,
      bonus
from 
  Employee e
left join
  Bonus b
using (empId)
where bonus<1000 or bonus is null;