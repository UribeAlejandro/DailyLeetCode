-- Write a SQL query to find the IDs of the users who visited without making any transactions and
-- the number of times they made these types of visits.

-- Return the result table sorted in any order.


SELECT customer_id,
       COUNT(*) AS count_no_trans
FROM Visits AS V
         LEFT JOIN Transactions AS T
                   ON V.visit_id = T.visit_id
WHERE transaction_id IS NULL
GROUP BY customer_id;

