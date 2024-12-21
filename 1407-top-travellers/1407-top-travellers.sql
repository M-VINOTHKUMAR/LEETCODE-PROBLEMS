# Write your MySQL query statement below
SELECT u.name,
     COALESCE(SUM(distance), 0 ) as travelled_distance
FROM
   Users u
LEFT JOIN 
   Rides r
ON 
  u.id=r.user_id
GROUP BY 
    u.id
ORDER BY travelled_distance DESC, name ASC;