
package lab.mvc.model;

public class HouseInfo {
 private String houseId;
 private String adrs_1;
 private String adrs_2;
 private String city;
 private String code_postal;
 private String country;
 private String date_start;
 private String date_fin;
 private int num_people;
 private String house_type;
 //private String service;
 //private String constraints;
 private String description;
 
public HouseInfo(String houseId, String adrs_1, String adrs_2, String city, String code_postal, String country,
		String date_start, String date_fin, int num_people, String house_type, String description) {
	super();
	this.houseId = houseId;
	this.adrs_1 = adrs_1;
	this.adrs_2 = adrs_2;
	this.city = city;
	this.code_postal = code_postal;
	this.country = country;
	this.date_start = date_start;
	this.date_fin = date_fin;
	this.num_people = num_people;
	this.house_type = house_type;
	//this.service = service;
	//this.constraints = constraints;
	this.description = description;
}
public String getHouseId() {
	return houseId;
}
public void setHouseId(String houseId) {
	this.houseId = houseId;
}
public String getAdrs_1() {
	return adrs_1;
}
public void setAdrs_1(String adrs_1) {
	this.adrs_1 = adrs_1;
}
public String getAdrs_2() {
	return adrs_2;
}
public void setAdrs_2(String adrs_2) {
	this.adrs_2 = adrs_2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCode_postal() {
	return code_postal;
}
public void setCode_postal(String code_postal) {
	this.code_postal = code_postal;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getDate_start() {
	return date_start;
}
public void setDate_start(String date_start) {
	this.date_start = date_start;
}
public String getDate_fin() {
	return date_fin;
}
public void setDate_fin(String date_fin) {
	this.date_fin = date_fin;
}
public int getNum_people() {
	return num_people;
}
public void setNum_people(int num_people) {
	this.num_people = num_people;
}
public String getHouse_type() {
	return house_type;
}
public void setHouse_type(String house_type) {
	this.house_type = house_type;
}
/*public String getService() {
	return service;
}
public void setService(String service) {
	this.service = service;
}
public String getConstraints() {
	return constraints;
}
public void setConstraints(String constraints) {
	this.constraints = constraints;
}*/
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
 
 
 
 
}
