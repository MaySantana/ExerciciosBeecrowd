--Action Movies, SQL
--May Santana, 2022
SELECT mov.id, mov.name
FROM movies mov
INNER JOIN genres gen ON mov.id_genres = gen.id
WHERE gen.description = 'Action';
