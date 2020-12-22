CREATE TABLE IF NOT EXISTS products(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL,
    quantity INTEGER NOT NULL,
    price NUMERIC(10,2)
);
INSERT INTO products(name, quantity, price) VALUES ('product1',11,7);
INSERT INTO products(name, quantity, price) VALUES ('product2',123,83.99);
INSERT INTO products(name, quantity, price) VALUES ('product3',10000,90);
INSERT INTO products(name, quantity, price) VALUES ('product4',22,10500);
INSERT INTO products(name, quantity, price) VALUES ('product5',400,11);
INSERT INTO products(name, quantity, price) VALUES ('product6',40500,10);
INSERT INTO products(name, quantity, price) VALUES ('product7',12,150.99);
INSERT INTO products(name, quantity, price) VALUES ('product8',23,125);