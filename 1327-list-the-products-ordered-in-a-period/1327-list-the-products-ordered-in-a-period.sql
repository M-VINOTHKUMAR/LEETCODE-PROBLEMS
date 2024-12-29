# Write your MySQL query statement below
select product_name,sum(unit) as unit
from
(
SELECT *
from Products
join Orders
using(product_id)
where order_date between '2020-02-01' and '2020-02-29'
) as t
group by product_id
having unit>99;
