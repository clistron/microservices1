DROP TABLE IF EXISTS recommendations;

CREATE TABLE recommendations (
                           id INT AUTO_INCREMENT  PRIMARY KEY,
                           full_name VARCHAR(250) NOT NULL,
                           company_id int NOT NULL,
                           position_id int NOT NULL,
                           recommendation VARCHAR(250) NOT NULL
);


INSERT INTO recommendations (id, full_name, company_id, position_id, recommendation) VALUES (1, 'Какое-то имя 1', 1, 1, 'Рекомендация 1');
INSERT INTO recommendations (id, full_name, company_id, position_id, recommendation) VALUES (2, 'Какое-то имя 2', 1, 2, 'Рекомендация 2');
