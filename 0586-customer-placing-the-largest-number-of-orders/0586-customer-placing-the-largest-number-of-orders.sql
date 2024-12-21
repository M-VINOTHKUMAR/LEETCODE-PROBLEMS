select  
   t.customer_number
from
 (
    select count(order_number) as value,
          customer_number
    from 
       orders
    group by customer_number 
    order by value desc
 )
 as t
 limit 1;