package ca.java.healthCareCenter;

import java.time.LocalDate;

public class Patient extends User {
	
	private static int continuousOfPatient = 1000;
	
	private int patientId;
	private String gender;
	private LocalDate dateOfBirth;
	
	public Patient(String firstName, String lastName, String phoneNumber, String email, String gender, int year, int month, int day) {
		super(firstName, lastName, phoneNumber, email);
		setPatientId();
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
				super.toString() +
				"\nGender: " + gender +
				"\nDate of Birth: " + dateOfBirth;
	}
	
}
