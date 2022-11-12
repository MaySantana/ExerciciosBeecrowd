--Taxes, SQL
--May Santana, 2022
SELECT name, ROUND((salary * 0.1), 2) tax
FROM people 
WHERE salary > 3000
