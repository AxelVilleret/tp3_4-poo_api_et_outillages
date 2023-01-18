DROP TABLE IF EXISTS address;

CREATE TABLE address (
    id INT NOT NULL AUTO_INCREMENT,
    author VARCHAR(255) NOT NULL,
    creation TIMESTAMP NOT NULL,
    content VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO address (id, author, creation, content)
VALUES (1, 'Axel', CURRENT_TIMESTAMP(), '57 boulevard demorieux');
INSERT INTO address (id, author, creation, content)
VALUES (
        2,
        'Villeret',
        CURRENT_TIMESTAMP(),
        '51 allee du gamay, 34080 montpellier'
    );