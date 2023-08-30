
INSERT INTO addresses (street, postal_code, city, country)
VALUES
    ('Maskrosvägen 8', '12345','Solöga','Sverige'),
    ('Sotargatan 4','23456','Lilleby','Sverige'),
    ('Gurkgränd 2', '11145','Edet','Sverige');

INSERT INTO members(first_name, last_name,e_mail,phone, member_type, address_id)
VALUES
    ('Anna','Andersson','anna"email.com','0701012345','premium','1'),
    ('Bertil','Borg','bertil@email.com','0702023456','enhanced','1'),
    ('Cissi','Cikada','cissi@email.com','0703033456','premium','2'),
    ('Daniel','Druva','daniel@email.com','0704043456','standard','3'),
    ('Erika', 'Ek','erika@email.com','0705052345','standard','3');