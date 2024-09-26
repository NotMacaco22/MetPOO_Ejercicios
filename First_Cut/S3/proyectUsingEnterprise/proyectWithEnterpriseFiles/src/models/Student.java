package models;

/**
 * @author silva
 * @version 1.0
 * @created 03-Sep-2024 5:53:22 PM
 */
public class Student {

	private float average;
	private String cif;
	private String firstName;
	private boolean hasSchoolarship;
	private String lastName;
	private String major;

	//Empty Constructor
	public Student() {
	}

	//Constructor
	public Student(float average, String cif, String firstName, boolean hasSchoolarship, String lastName, String major) {
		this.average = average;
		this.cif = cif;
		this.firstName = firstName;
		this.hasSchoolarship = hasSchoolarship;
		this.lastName = lastName;
		this.major = major;
	}

	//Getters and Setters
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public boolean isHasSchoolarship() {
		return hasSchoolarship;
	}
	public void setHasSchoolarship(boolean hasSchoolarship) {
		this.hasSchoolarship = hasSchoolarship;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}



}//end Student