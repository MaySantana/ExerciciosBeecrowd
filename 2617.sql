--Provider Ajax SA, SQL
--May Santana, 2022
SELECT prod.name, prov.name
FROM products prod
INNER JOIN providers prov ON prod.id_providers = prov.id
WHERE prov.name = 'Ajax SA';
