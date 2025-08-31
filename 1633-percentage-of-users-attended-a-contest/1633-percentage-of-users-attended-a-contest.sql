# Write your MySQL query statement below
SELECT b.contest_id,ROUND(COUNT(b.user_id)*100.0/(SELECT COUNT(*) FROM Users),2)AS percentage
FROM Users a
JOIN Register b
USING(user_id)
GROUP BY b.contest_id
ORDER BY percentage DESC,b.contest_id ASC;