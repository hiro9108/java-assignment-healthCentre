package ca.java.healthCareCenter;

import java.time.LocalDate;

public class Patient {
	
	private static int continuousOfPatient = 1000;
	
	private int patientId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String gender;
	private LocalDate dateOfBirth;
	
	public Patient(String firstName, String lastName, String phoneNumber, String email, String gender, int year, int month, int day) {
		setPatientId();
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setGender(gender);
		setDateOfBirth(year, month, day);
	}

	/**
	 * @return the patientId
	 */
	public int getPatientId() {
		return patientId;
	}

	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId() {
		if (continuousOfPatient >= 1000 && continuousOfPatient < 99999) {
			this.patientId = continuousOfPatient + 1;
			continuousOfPatient = this.patientId;
		} else {
			System.err.println("Exceed Numbers of Patient");
		}
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		if (firstName.isEmpty() || firstName.equalsIgnoreCase(null)) {
			this.firstName = "Unknown";
		} else {
			this.firstName = firstName;
		}
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		if (lastName.isEmpty() || lastName.equalsIgnoreCase(null)) {
			this.lastName = "Unknown";
		} else {
			this.lastName = lastName;
		}
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber.isEmpty() || phoneNumber.equalsIgnoreCase(null)) {
			this.phoneNumber = "Unknown";
		} else {
			this.phoneNumber = phoneNumber;
		}
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		if (email.isEmpty() || email.equalsIgnoreCase(null)) {
			this.email = "Unknown";
		} else {
			this.email = email;
		}
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		if (gender.isEmpty() || gender.equalsIgnoreCase(null)) {
			this.gender = "Unknown";
		} else {
			this.gender = gender;
		}
	}

	/**
	 * @return the dateOfBirth
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(int year, int month, int day) {
		this.dateOfBirth = LocalDate.of(year, month, day);
	}
	
	@Override
	public String toString() {
		return "\nPatient Id: " + patientId +
				"\nFirst Name: " + firstName +
				"\nLast Name: " + lastName + 
				"\nPhone Number: " + phoneNumber + 
				"\nEmail: " + email + 
				"\nGender: " + gender +
				"\nDate of Birth: " + dateOfBirth;
	}
	
}
