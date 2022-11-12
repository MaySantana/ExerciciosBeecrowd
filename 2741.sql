--Students grades, SQL
--May Santana, 2022
SELECT CONCAT('Approved: ', name), grade
FROM students
WHERE grade >= 7
ORDER BY grade DESC
