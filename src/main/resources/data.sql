INSERT INTO address(city, country, postal_code,street)
VALUES
    ('Solöga','Sverige', '12345','Maskrosvägen 8'),
    ('Lilleby','Sverige','23456','Sotargatan 4'),
    ('Edet','Sverige','11145','Gurkgränd 2' );

INSERT INTO member(e_mail,first_name, last_name, member_type, phone, address_address_id)
VALUES
    ('anna"email.com','Anna','Andersson','premium','0701012345','1'),
    ('bertil@email.com','Bertil','Borg','enhanced','0702023456','1'),
    ('cissi@email.com','Cissi','Cikada','premium','0703033456','2'),
    ('daniel@email.com','Daniel','Druva','basic','0704043456','3'),
    ('erika@email.com','Erika', 'Ek','basic','0705052345','3');

INSERT INTO blog(post, member_member_id)
VALUES
    ('Solen skiner, livet leker!', '1'),
    ('Blå. blå himlar och vatten', '2'),
    ('Kräftor kräva dessa drycker', '3'),
    ('Om natten är alla katter grå', '4'),
    ('Ibland bryter man bara ihop', '5');