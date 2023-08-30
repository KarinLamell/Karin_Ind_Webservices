
INSERT INTO address(city, country, postal_code, street )
VALUES
    ('Solöga','Sverige', '12345','Maskrosvägen 8'),
    ('Lilleby','Sverige','23456','Sotargatan 4'),
    ('Edet','Sverige','11145','Gurkgränd 2');

INSERT INTO member(first_name, last_name,e_mail,phone, member_type, address_address_id)
VALUES
    ('Anna','Andersson','anna"email.com','0701012345','premium','1'),
    ('Bertil','Borg','bertil@email.com','0702023456','enhanced','1'),
    ('Cissi','Cikada','cissi@email.com','0703033456','premium','2'),
    ('Daniel','Druva','daniel@email.com','0704043456','standard','3'),
    ('Erika', 'Ek','erika@email.com','0705052345','standard','3');

INSERT INTO post(post, member_member_id)
VALUES
    ('Solen skiner, livet leker!', '1'),
    ('Blå. blå himlar och vatten', '2'),
    ('Kräftor kräva dessa drycker', '3'),
    ('Om natten är alla katter grå', '4'),
    ('Ibland bryter man bara ihop', '5');