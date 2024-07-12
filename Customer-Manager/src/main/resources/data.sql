CREATE TABLE customer (
                          customerid SERIAL PRIMARY KEY,
                          firstname VARCHAR(50),
                          lastname VARCHAR(50),
                          date_of_birth DATE,
                          street_address VARCHAR(100),
                          city VARCHAR(50),
                          state VARCHAR(50),
                          zip VARCHAR(10),
                          email VARCHAR(100),
                          phone VARCHAR(20)
);

INSERT INTO customer (firstname, lastname, date_of_birth, street_address, city, state, zip, email, phone) VALUES
                                                                                                              ('John', 'Doe', '1980-01-01', '123 Main St', 'Springfield', 'IL', '62701', 'john.doe@example.com', '9854378294'),
                                                                                                              ('Jane', 'Smith', '1990-05-15', '456 Oak St', 'Springfield', 'IL', '62701', 'jane.smith@example.com', '9463546573'),
                                                                                                              ('Alice', 'Johnson', '1985-03-30', '789 Pine St', 'Springfield', 'IL', '62701', 'alice.johnson@example.com', '77893564658'),
                                                                                                              ('Bob', 'Williams', '1975-07-20', '321 Elm St', 'Springfield', 'IL', '62701', 'bob.williams@example.com', '8456782305');
