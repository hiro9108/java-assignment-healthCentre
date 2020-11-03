package ca.java.healthCareCenter;

import java.util.ArrayList;

public class Doctor {
	
	private static int continuousOfDoctor = 1000;
	
	private int doctorId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String specialty;
	private ArrayList<Appointment> appointment;
	

	public Doctor(String firstName, String lastName, String phoneNumber, String email, String specialty) {
		setDoctorId();
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setSpecialty(specialty);
		this.appointment = new ArrayList<Appointment>();
	}
	
	
	/**
	 * @return the doctorId
	 */
	public int getDoctorId() {
		return doctorId;
	}

	/**
	 * @param doctorId the doctorId to set
	 */
	public void setDoctorId() {
		if (continuousOfDoctor >= 1000 && continuousOfDoctor < 99999) {
			this.doctorId = continuousOfDoctor + 1;
			continuousOfDoctor = this.doctorId;
		} else {
			System.err.println("Exceed Numbers of Doctor");
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
	 * @return the specialty
	 */
	public String getSpecialty() {
		return specialty;
	}

	/**
	 * @param specialty the specialty to set
	 */
	public void setSpecialty(String specialty) {
		if (specialty.isEmpty() || specialty.equalsIgnoreCase(null)) {
			this.specialty = "Unknown";
		} else {
			this.specialty = specialty;
		}
	}
	
	/**
	 * @return the appointment
	 */
	public ArrayList<Appointment> getAppointment() {
		return appointment;
	}
	
	/**
	 * add appointment
	 */
	public void addAppointment(Appointment ap) {
		this.appointment.add(ap);
	}
	
	@Override
	public String toString() {
		return "\nDoctor Id: " + doctorId +
				"\nFirst Name: " + firstName +
				"\nLast Name: " + lastName + 
				"\nPhone Number: " + phoneNumber + 
				"\nEmail: " + email + 
				"\nSpecialty: " + specialty;
	}
	
}
