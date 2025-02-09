CREATE DATABASE user_db01;
USE user_db01;
CREATE TABLE users(
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) not null,
    email VARCHAR(255) not null
);
SELECT*FROM users;