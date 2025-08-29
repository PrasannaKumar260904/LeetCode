# Write your MySQL query statement below
SELECT c.customer_id,COUNT(c.visit_id) AS count_no_trans
From Visits c
LEFT JOIN Transactions e
ON c.visit_id=e.visit_id
WHERE e.transaction_id IS NULL
GROUP BY customer_id;
