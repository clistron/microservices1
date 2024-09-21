DROP TABLE IF EXISTS companies;

CREATE TABLE companies (
                           id INT AUTO_INCREMENT  PRIMARY KEY,
                           company VARCHAR(250) NOT NULL
);


INSERT INTO companies (id, company) VALUES (1, 'Apple');
INSERT INTO companies (id, company) VALUES (2, 'Google');
INSERT INTO companies (id, company) VALUES (3, 'Yandex');
