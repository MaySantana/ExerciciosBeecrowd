--Payday, SQL
--May Santana, 2022
SELECT name, CAST(EXTRACT(DAY FROM payday) AS INTEGER) "day"
FROM loan;
