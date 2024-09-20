SELECT contest_id, 
 round( (count(user_id)*100/( select count(user_id) from Users)),2) AS percentage
FROM Register 
join Users
using (user_id) 
GROUP BY contest_id
ORDER BY percentage DESC, contest_id ASC;
