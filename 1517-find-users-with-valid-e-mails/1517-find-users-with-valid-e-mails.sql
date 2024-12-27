# Write your MySQL query statement below
select *
from Users
where mail like '%@leetcode.com' and mail REGEXP '^[a-zA-Z][A-Za-z0-9-._]*@le';