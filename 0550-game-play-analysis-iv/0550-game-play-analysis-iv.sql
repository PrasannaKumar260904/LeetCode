# Write your MySQL query statement below
SELECT ROUND(COUNT(DISTINCT a.player_id)/(SELECT COUNT(Distinct player_id)FROM Activity),2) AS fraction
FROM Activity a
JOIN (SELECT player_id,MIN(event_date) AS first_login FROM Activity 
GROUP BY player_id)AS b
USING(player_id)
WHERE DATEDIFF(a.event_date,b.first_login)=1; 
