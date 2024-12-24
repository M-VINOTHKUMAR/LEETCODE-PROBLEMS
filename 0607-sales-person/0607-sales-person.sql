# Write your MySQL query statement below
SELECT 
    name
from
   SalesPerson
where
  sales_id
  not in
  (
   select distinct sales_id from Orders
    where com_id= (select com_id from Company where name="RED")
  )
order by name;