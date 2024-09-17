SELECT name
FROM Employee
HAVING COUNT(managerId) >= 5;
