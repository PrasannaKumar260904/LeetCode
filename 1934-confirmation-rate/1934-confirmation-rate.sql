# Write your MySQL query statement below
SELECT a.user_id,ROUND(IFNULL(SUM(c.action='confirmed')/COUNT(c.user_id),0),2) AS confirmation_rate
FROM Signups a
LEFT JOIN Confirmations c
USING (user_id)
GROUP BY a.user_id;
