--The Sensor Message, SQL
--May Santana, 2022
SELECT temperature, COUNT(temperature) AS number_of_records 
FROM records 
GROUP BY mark, temperature 
ORDER BY mark;
