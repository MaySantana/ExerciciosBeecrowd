--Amounts Between 10 and 20, SQL
--May Santana, 2022
SELECT prod.name
FROM products prod
INNER JOIN providers prov ON prod.id_providers = prov.id
WHERE (prod.amount BETWEEN 10 AND 20) AND prov.name LIKE 'P%';
