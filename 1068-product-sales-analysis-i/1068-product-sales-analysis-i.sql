# Write your MySQL query statement below
SELECT e.product_name,e1.year,e1.price
FROM Sales e1
INNER JOIN Product e
ON e1.product_id=e.product_id;