/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Charles
 * Created: Mar 5, 2025
 */
CREATE TABLE employee_data (
  employee_id INT PRIMARY KEY,
  last_name VARCHAR(255),
  first_name VARCHAR(255),
  birthday DATE,
  address VARCHAR(255),
  phone_number VARCHAR(20),
  sss_number VARCHAR(20),
  philhealth_number VARCHAR(20),
  tin_number VARCHAR(20),
  pag_ibig_number VARCHAR(20),
  status VARCHAR(50),
  position VARCHAR(255),
  immediate_supervisor VARCHAR(255),
  basic_salary DECIMAL(10, 2),
  rice_subsidy DECIMAL(10, 2),
  phone_allowance DECIMAL(10, 2),
  clothing_allowance DECIMAL(10, 2),
  gross_semi_monthly_rate DECIMAL(10, 2),
  hourly_rate DECIMAL(10, 2)
);
INSERT INTO employee_data (employee_id, last_name, first_name, birthday, address, phone_number, sss_number, philhealth_number, tin_number, pag_ibig_number, status, position, immediate_supervisor, basic_salary, rice_subsidy, phone_allowance, clothing_allowance, gross_semi_monthly_rate, hourly_rate)
VALUES

(10001,Garcia,Manuel III,10/11/1983,"Valero Carpark Building Valero Street 1227, Makati City",966-860-270,44-4506057-3,820126853951,442-605-657-000,691295330870,Regular,Chief Executive Officer,N/A,"90,000","1,500","2,000","1,000","45,000",535.71),
(10003,Aquino,Bianca Sofia,08/04/1989,"Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City",966-889-370,30-8870406-2,177451189665,971-711-280-000,171519773969,Regular,Chief Finance Officer,"Garcia, Manuel III","60,000","1,500","2,000","1,000","30,000",357.14),
(10005,Hernandez,Eduard,09/23/1989,"National Highway, Gingoog,  Misamis Occidental",088-861-012,50-5577638-1,957436191812,031-702-374-000,952347222457,Regular,IT Operations and Systems,"Lim, Antonio","52,670","1,500","1,000","1,000","26,335",313.51),
(10006,Villanueva,Andrea Mae,02/14/1988,"17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands ",918-621-603,49-1632020-8,382189453145,317-674-022-000,441093369646,Regular,HR Manager,"Lim, Antonio","52,670","1,500","1,000","1,000","26,335",313.51),
(10007,San Jose,Brad ,03/15/1996,"99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi",797-009-261,40-2400714-1,239192926939,672-474-690-000,210850209964,Regular,HR Team Leader,"Villanueva, Andrea Mae","42,975","1,500",800,800,"21,488",255.80),
(10008,Romualdez,Alice,05/14/1992,"12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte ",983-606-799,55-4476527-2,545652640232,888-572-294-000,211385556888,Regular,HR Rank and File,"San, Jose Brad","22,500","1,500",500,500,"11,250",133.93),
(10009,Atienza,Rosie ,09/24/1948,"90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte",266-036-427,41-0644692-3,708988234853,604-997-793-000,260107732354,Regular,HR Rank and File,"San, Jose Brad","22,500","1,500",500,500,"11,250",133.93),
(10010,Alvaro,Roderick,03/30/1988,"#284 T. Morato corner, Scout Rallos Street, Quezon City",053-381-386,64-7605054-4,578114853194,525-420-419-000,799254095212,Regular,Accounting Head,"Aquino, Bianca Sofia ","52,670","1,500","1,000","1,000","26,335",313.51),
(10011,Salcedo,Anthony,09/14/1993,"93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate",070-766-300,26-9647608-3,126445315651,210-805-911-000,218002473454,Regular,Payroll Manager,"Alvaro, Roderick","50,825","1,500","1,000","1,000","25,413",302.53),
(10012,Lopez,Josie ,01/14/1987,"49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro",478-355-427,44-8563448-3,431709011012,218-489-737-000,113071293354,Regular,Payroll Team Leader,"Salcedo, Anthony","38,475","1,500",800,800,"19,238",229.02),
(10013,Farala,Martha,01/11/1942,"42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte ",329-034-366,45-5656375-0,233693897247,210-835-851-000,631130283546,Regular,Payroll Rank and File,"Salcedo, Anthony","24,000","1,500",500,500,"12,000",142.86),
(10014,Martinez,Leila,07/11/1970,"37/46 Kulas Roads, Maragondon 0962 Quirino ",877-110-749,27-2090996-4,515741057496,275-792-513-000,101205445886,Regular,Payroll Rank and File,"Salcedo, Anthony","24,000","1,500",500,500,"12,000",142.86),
(10015,Romualdez,Fredrick ,03/10/1985,"22A/52 Lubowitz Meadows, Pililla 4895 Zambales",023-079-009,26-8768374-1,308366860059,598-065-761-000,223057707853,Regular,Account Manager,"Lim, Antonio","53,500","1,500","1,000","1,000","26,750",318.45),
(10016,Mata,Christian,10/21/1987,"90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu ",783-776-744,49-2959312-6,824187961962,103-100-522-000,631052853464,Regular,Account Team Leader,"Romualdez, Fredrick ","42,975","1,500",800,800,"21,488",255.80),
(10017,De Leon,Selena ,02/20/1975,"89A Armstrong Trace, Compostela 7874 Maguindanao",975-432-139,27-2090208-8,587272469938,482-259-498-000,719007608464,Regular,Account Team Leader,"Romualdez, Fredrick ","41,850","1,500",800,800,"20,925",249.11),
(10018,San Jose,Allison ,06/24/1986,"08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union",179-075-129,45-3251383-0,745148459521,121-203-336-000,114901859343,Regular,Account Rank and File,"Mata, Christian","22,500","1,500",500,500,"11,250",133.93),
(10019,Rosario,Cydney ,10/06/1996,"93A/21 Berge Points, Tapaz 2180 Quezon",868-819-912,49-1629900-2,579253435499,122-244-511-000,265104358643,Regular,Account Rank and File,"Mata, Christian","22,500","1,500",500,500,"11,250",133.93),
(10020,Bautista,Mark ,02/12/1991,"65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino",683-725-348,49-1647342-5,399665157135,273-970-941-000,260054585575,Regular,Account Rank and File,"Mata, Christian","23,250","1,500",500,500,"11,625",138.39),
(10021,Lazaro,Darlene ,11/25/1985,"47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino",740-721-558,45-5617168-2,606386917510,354-650-951-000,104907708845,Probationary,Account Rank and File,"Mata, Christian","23,250","1,500",500,500,"11,625",138.39),
(10022,Delos Santos,Kolby ,02/26/1980,"06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur",739-443-033,52-0109570-6,357451271274,187-500-345-000,113017988667,Probationary,Account Rank and File,"Mata, Christian","24,000","1,500",500,500,"12,000",142.86),
(10023,Santos,Vella ,12/31/1983,"99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur",955-879-269,52-9883524-3,548670482885,101-558-994-000,360028104576,Probationary,Account Rank and File,"Mata, Christian","22,500","1,500",500,500,"11,250",133.93),
(10024,Del Rosario,Tomas,12/18/1978,"80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque",882-550-989,45-5866331-6,953901539995,560-735-732-000,913108649964,Probationary,Account Rank and File,"Mata, Christian","22,500","1,500",500,500,"11,250",133.93),
(10025,Tolentino,Jacklyn ,05/19/1984,"96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao",675-757-366,47-1692793-0,753800654114,841-177-857-000,210546661243,Probationary,Account Rank and File,"De Leon, Selena","24,000","1,500",500,500,"12,000",142.86),
(10026,Gutierrez,Percival ,12/18/1970,"58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur",512-899-876,40-9504657-8,797639382265,502-995-671-000,210897095686,Probationary,Account Rank and File,"De Leon, Selena","24,750","1,500",500,500,"12,375",147.32),
(10027,Manalaysay,Garfield ,08/28/1986,"60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur",948-628-136,45-3298166-4,810909286264,336-676-445-000,211274476563,Probationary,Account Rank and File,"De Leon, Selena","24,750","1,500",500,500,"12,375",147.32),
(10028,Villegas,Lizeth ,12/12/1981,"66/77 Mann Views, Luisiana 1263 Dinagat Islands",332-372-215,40-2400719-4,934389652994,210-395-397-000,122238077997,Probationary,Account Rank and File,"De Leon, Selena","24,000","1,500",500,500,"12,000",142.86),
(10029,Ramos,Carol ,08/20/1978,"72/70 Stamm Spurs, Bustos 4550 Iloilo",250-700-389,60-1152206-4,351830469744,395-032-717-000,212141893454,Probationary,Account Rank and File,"De Leon, Selena","22,500","1,500",500,500,"11,250",133.93),
(10030,Maceda,Emelia ,04/14/1973,"50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija",973-358-041,54-1331005-0,465087894112,215-973-013-000,515012579765,Probationary,Account Rank and File,"De Leon, Selena","22,500","1,500",500,500,"11,250",133.93),
(10031,Aguilar,Delia ,01/27/1989,"95 Cremin Junction, Surallah 2809 Cotabato",529-705-439,52-1859253-1,136451303068,599-312-588-000,110018813465,Probationary,Account Rank and File,"De Leon, Selena","22,500","1,500",500,500,"11,250",133.93),
(10032,Castro,John Rafael,02/09/1992,"Hi-way, Yati, Liloan Cebu",332-424-955 ,26-7145133-4,601644902402,404-768-309-000,697764069311,Regular,Sales & Marketing,"Reyes, Isabella","52,670","1,500","1,000","1,000","26,335",313.51),
(10033,Martinez,Carlos Ian,11/16/1990,"Bulala, Camalaniugan",078-854-208,11-5062972-7,380685387212,256-436-296-000,993372963726,Regular,Supply Chain and Logistics,"Reyes, Isabella","52,670","1,500","1,000","1,000","26,335",313.51),
(10034,Santos,Beatriz,08/07/1990,"Agapita Building, Metro Manila",526-639-511,20-2987501-5,918460050077,911-529-713-000,874042259378,Regular,Customer Service and Relations,"Reyes, Isabella","52,670","1,500","1,000","1,000","26,335",313.51);