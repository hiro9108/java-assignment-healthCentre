package ca.java.healthCareCenter;

import java.util.ArrayList;

public class Doctor extends User {
	
	private static int continuousOfDoctor = 1000;
	
	private int doctorId;
	private String specialty;
	private ArrayList<Appointment> appointment;
	

	public Doctor(String firstName, String lastName, String phoneNumber, String email, String specialty) {
		super(firstName, lastName, phoneNumber, email);
		setDoctorId();
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
				super.toString() +
				"\nSpecialty: " + specialty;
	}
	
}
