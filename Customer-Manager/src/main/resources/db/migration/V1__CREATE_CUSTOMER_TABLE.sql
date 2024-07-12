-- V1__Create_Customer_Table.sql
DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
                          customerid BIGSERIAL PRIMARY KEY,
                          firstname VARCHAR(255) NOT NULL,
                          lastname VARCHAR(255) NOT NULL,
                          date_of_birth DATE NOT NULL,
                          street_address VARCHAR(255) NOT NULL,
                          city VARCHAR(255) NOT NULL,
                          state VARCHAR(2) NOT NULL,
                          zip VARCHAR(10) NOT NULL,
                          email VARCHAR(255) NOT NULL,
                          phone VARCHAR(15) NOT NULL,
                          last_updated_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          created_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
