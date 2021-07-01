package dayFourLectureThree.entities;

import dayFourLectureThree.abstracts.Entity;

public class Gamer implements Entity {
	
	private int id ;
	private String firstName;
	private String lastName;
	private int dateOfbirth;
	private long nationaltyId; 
	
	public Gamer () {}

	public Gamer(int id, String firstName, String lastName, int dateOfbirth, long nationaltyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfbirth = dateOfbirth;
		this.nationaltyId = nationaltyId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfbirth() {
		return dateOfbirth;
	}

	public void setDateOfbirth(int dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}

	public long getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(long nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	
	

}
