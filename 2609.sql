--Products by Categories, SQL
--May Santana, 2022
SELECT cat.name, sum(pro.amount)
FROM categories cat
INNER JOIN products pro
ON cat.id = pro.id_categories
GROUP BY cat.id;
