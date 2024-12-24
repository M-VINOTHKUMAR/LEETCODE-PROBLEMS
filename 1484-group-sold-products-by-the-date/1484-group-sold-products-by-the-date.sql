SELECT 
    sell_date,
    COUNT(distinct product) AS num_sold,
    GROUP_CONCAT(distinct product SEPARATOR ',') AS products
FROM 
    Activities
GROUP BY 
    sell_date
order by sell_date, product;
