CREATE TABLE homeswophome_db.UserInfo (
  idUserInfo INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
  email VARCHAR(45) NOT NULL,
  password VARCHAR(45) NOT NULL,
  firstName VARCHAR(45) NOT NULL,
  lastName VARCHAR(45) NOT NULL,
  tel VARCHAR(45) NOT NULL
  );
  
	
CREATE TABLE homeswophome_db.HouseInfo (
  idHouseInfo INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
  addr VARCHAR(45) NOT NULL,
  comp_addr VARCHAR(45) NOT NULL,
  city VARCHAR(45) NOT NULL,
  code_postal VARCHAR(45) NOT NULL,
  country VARCHAR(45) NOT NULL,
  date_start VARCHAR(45) NOT NULL,
  date_fin VARCHAR(45) NOT NULL,
  num_people INT NOT NULL,
  house_type VARCHAR(45) NOT NULL,
  description VARCHAR(45) NOT NULL
  );

	
	
  SELECT * FROM homeswophome_db.UserInfo;
  insert into homeswophome_db.USERINFO(email, password, firstName, lastName, tel) values('a@a.com','a','a','a','a');