SELECT  customer_id, 
    COUNT(visit_id) AS count_no_trans
FROM Visits v
LEFT JOIN Transactions USING (visit_id)
WHERE transaction_id IS NULL
group by customer_id;
