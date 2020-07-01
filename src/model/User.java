package model;
import java.time.LocalDate;
//Type your code here

public class User {
	String name;
	String email;
	LocalDate dob;
	String gender;

	public void setName(String name) {
		this.name=name;
	}
	
	
	public void setDob(String dob) {
		this.dob=LocalDate.parse(dob);
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	
	public String getGender() {
		return gender;
	}
	
	public User(String name, String gender, String dob) {
		this.name=name;
		this.dob=LocalDate.parse(dob);
		this.gender=gender;
		
	}
}