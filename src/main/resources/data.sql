--INSERT INTO jobs_seekers (name) VALUES ('Software Developer');
--INSERT INTO jobs_seekers (name) VALUES ('Software Architecture');
--INSERT INTO companies (email, password, is_verified, company_name, website) VALUES ("firma@firma.com", "secure", true, "Firma", "firma.com");
INSERT INTO jobs (name) VALUES ('Software Developer');
INSERT INTO jobs (name) VALUES ('Software Engineer');
INSERT INTO users (email, password, is_verified) VALUES ('info@firma.com', 'testpassword', true);
INSERT INTO users (email, password, is_verified) VALUES ('info@abc.com', 'testpassword', true);
INSERT INTO users (email, password, is_verified) VALUES ('info@sabanci.com', 'testpassword', true);
INSERT INTO individuals (first_name, last_name, national_identity, date_of_birth, id)
    VALUES ('Serdar', 'Demirci', '124356', '1981-01-01', 1);
INSERT INTO candidates (id) VALUES (1);
INSERT INTO companies (company_name, website, id) VALUES ('ABC', 'www.abc.com', 2);
INSERT INTO companies (company_name, website, id) VALUES ('Sabanci', 'www.sabanci.com', 3);
INSERT INTO verification_codes (code, is_used, user_id) VALUES ('4321', false, 1);
INSERT INTO verification_codes (code, is_used, user_id) VALUES ('5678', true, 1);
INSERT INTO verification_codes (code, is_used, user_id) VALUES ('3579', true, 2);
INSERT INTO phone_numbers (user_id, phone_number) VALUES (2, '12345');


------------
-- Cities --
------------
INSERT INTO public.cities(name)
VALUES
('Adana'),
('Adıyaman'),
('Afyon'),
('Ağrı'),
('Amasya'),
('Ankara'),
('Antalya'),
('Artvin'),
('Aydın'),
('Balıkesir'),
('Bilecik'),
('Bingöl'),
('Bitlis'),
('Bolu'),
('Burdur'),
('Bursa'),
('Çanakkale'),
('Çankırı'),
('Çorum'),
('Denizli'),
('Diyarbakır'),
('Edirne'),
('Elazığ'),
('Erzincan'),
('Erzurum'),
('Eskişehir'),
('Gaziantep'),
('Giresun'),
('Gümüşhane'),
('Hakkari'),
('Hatay'),
('Isparta'),
('Mersin'),
('İstanbul'),
('İzmir'),
('Kars'),
('Kastamonu'),
('Kayseri'),
('Kırklareli'),
('Kırşehir'),
('Kocaeli'),
('Konya'),
('Kütahya'),
('Malatya'),
('Manisa'),
('K.Maraş'),
('Mardin'),
('Muğla'),
('Muş'),
('Nevşehir'),
('Niğde'),
('Ordu'),
('Rize'),
('Sakarya'),
('Samsun'),
('Siirt'),
('Sinop'),
('Sivas'),
('Tekirdağ'),
('Tokat'),
('Trabzon'),
('Tunceli'),
('Şanlıurfa'),
('Uşak'),
('Van'),
('Yozgat'),
('Zonguldak'),
('Aksaray'),
('Bayburt'),
('Karaman'),
('Kırıkkale'),
('Batman'),
('Şırnak'),
('Bartın'),
('Ardahan'),
('Iğdır'),
('Yalova'),
('Karabük'),
('Kilis'),
('Osmaniye'),
('Düzce')