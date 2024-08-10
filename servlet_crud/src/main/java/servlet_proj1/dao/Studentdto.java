package servlet_proj1.dao;

import javax.persistence.Id;

import javax.persistence.Entity;

@Entity
public class Studentdto {
	@Id
	private int id;
	private String name;
	private String mail;
	private String dob;
	private long number;
	private String country;
	private String gender;
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	@Override
	public String toString() {
		return "Studentdto [id=" + id + ", name=" + name + ", mail=" + mail + ", dob=" + dob + ", number=" + number
				+ ", country=" + country + ", gender=" + gender + "]";
	}
	
	
	

}
