--Average Value of Products ,SQL
--May Santana, 2022
SELECT TRUNC((SUM(price)/COUNT(price)), 2) AS price
FROM products;
