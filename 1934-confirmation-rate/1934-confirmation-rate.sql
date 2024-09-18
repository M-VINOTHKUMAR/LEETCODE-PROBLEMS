# Write your MySQL query statement below
select user_id,
 round( COALESCE((select count(user_id) from Confirmations where action='confirmed' and user_id = c.user_id
 group by user_id),0)/count(*) ,2)  as confirmation_rate
from Signups 
left join Confirmations c using (user_id)
group by user_id;