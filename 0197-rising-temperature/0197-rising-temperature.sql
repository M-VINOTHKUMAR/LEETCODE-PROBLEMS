# Write your MySQL query statement below
 select w2.id 
 from Weather w1
 join Weather w2
 where Date_add(w1.recordDate, interval 1 day) =w2.recordDate and w1.temperature<w2.temperature;