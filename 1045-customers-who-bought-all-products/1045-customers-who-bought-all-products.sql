select customer_id
from Customer
group by customer_id
having count(product_key)=(select count(product_key) from Product);
