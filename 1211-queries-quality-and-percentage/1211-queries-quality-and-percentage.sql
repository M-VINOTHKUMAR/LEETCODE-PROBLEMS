# Write your MySQL query statement belo
SELECT query_name,
  round(sum(rating/position)/count(query_name),2) as quality ,
  round((count(case when rating<3 then 1 END )*100.0/count(*)),2) as poor_query_percentage
   from Queries 
   group by query_name;