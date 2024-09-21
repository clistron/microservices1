DROP TABLE IF EXISTS positions;

CREATE TABLE positions (
   id INT AUTO_INCREMENT  PRIMARY KEY,
   position VARCHAR(250) NOT NULL
);


INSERT INTO positions (id, position) VALUES (1, 'Программист');
INSERT INTO positions (id, position) VALUES (2, 'Тестировщик');
INSERT INTO positions (id, position) VALUES (3, 'Бухгалтер');
INSERT INTO positions (id, position) VALUES (4, 'Директор');
INSERT INTO positions (id, position) VALUES (5, 'Дворник');