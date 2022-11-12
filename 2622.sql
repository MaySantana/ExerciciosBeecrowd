--Legal Person, SQL
--May Santana, 2022
SELECT cus.name
FROM customers cus
INNER JOIN legal_person leg ON cus.id = leg.id_customers;
