--Passwords, SQL
-May Santana, 2022
SELECT id, password, MD5(password) AS "MD5"
FROM account;
