package com.Covid19CaseStudyFinal.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Id_Table")
public class IdCard {

/*@SequenceGenerator( name="ID_SEQUENCE",
sequenceName ="ID_SEQUENCE",
allocationSize=1
)
@GeneratedValue(strategy = GenerationType.SEQUENCE,
generator = "ID_SEQUENCE"
)*/

@Id
private int id;
public IdCard() {
super();
// TODO Auto-generated constructor stub
}
private String name;
@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
private LocalDate dob;
private String gender;
private String address;
private String city;
private String state;
private String pincode;
private int adharNo;
private String panNo;


public IdCard(int id, String name, LocalDate dob, String gender, String address, String city, String state,
String pincode, int adharNo, String panNo) {
super();
this.id = id;
this.name = name;
this.dob = dob;
this.gender = gender;
this.address = address;
this.city = city;
this.state = state;
this.pincode = pincode;
this.adharNo = adharNo;
this.panNo = panNo;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public LocalDate getDob() {
return dob;
}
public void setDob(LocalDate dob) {
this.dob = dob;
}
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
public String getState() {
return state;
}
public void setState(String state) {
this.state = state;
}
public String getPincode() {
return pincode;
}
public void setPincode(String pincode) {
this.pincode = pincode;
}
public int getAdharNo() {
return adharNo;
}
public void setAdharNo(int adharNo) {
this.adharNo = adharNo;
}
public String getPanNo() {
return panNo;
}
public void setPanNo(String panNo) {
this.panNo = panNo;
}
}