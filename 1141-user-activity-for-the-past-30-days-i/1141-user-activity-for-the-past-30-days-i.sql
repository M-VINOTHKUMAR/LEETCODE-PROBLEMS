# Write your MySQL query statement below
SELECT a.activity_date as day,
      count(distinct a.user_id) as active_users
from Activity a
where activity_date between '2019-06-28'  and '2019-07-27'
group by activity_date