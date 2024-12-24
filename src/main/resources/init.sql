CREATE SCHEMA IF NOT EXISTS test_schema;
SET SCHEMA test_schema;
CREATE TABLE test_schema.person (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    age INT NOT NULL,
    name VARCHAR(100) NOT NULL
);