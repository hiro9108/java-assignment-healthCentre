package ca.java.healthCareCenter;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Scanner;

public class HealthCenter {
	
	public static final String DIVIDER = "-------------------------------------------------------------------";
	
	public static Patient isPatientId(ArrayList<Patient> patients, int patientId) {
		for (Patient patient : patients) {
			if (patient.getPatientId() == patientId) {
				return patient;
			}
		}
		return null;
	}
	
	public static Doctor isDoctorId(ArrayList<Doctor> doctors, int doctorId) {
		for (Doctor doctor : doctors) {
			if (doctor.getDoctorId() == doctorId) {
				return doctor;
			}
		}
		return null;
	}
	
	public static Appointment createAppointment(Patient targetPatient) {
		Scanner input = new Scanner(System.in);
		System.out.println("What date is your appointment?");
		System.out.print("year: ");
		int inputYear = input.nextInt();
		System.out.print("month: ");
		int inputMonth = input.nextInt();
		System.out.print("day: ");
		int inputDay = input.nextInt();
		System.out.print("hour: ");
		int inputHour = input.nextInt();
		System.out.print("time: ");
		int inputTime = input.nextInt();
		Appointment newAppointment = new Appointment(targetPatient, inputYear, inputMonth, inputDay, inputHour, inputTime);
		return newAppointment;
	}
	
	public static Patient askPatientId(ArrayList<Patient> patients) {
		Scanner input = new Scanner(System.in);
		Patient targetPatient;
		boolean isPatientNumExist = true;
		do {
			System.out.println("Enter your patient ID:");
			int inputPatientId = input.nextInt();
			targetPatient = isPatientId(patients, inputPatientId);
			if (targetPatient != null) {
				isPatientNumExist = false;
			} else {
				System.err.println("Patient Number dose not exist");
			}
		} while (isPatientNumExist);
		return targetPatient;
	}
	
	public static Doctor askDoctorId(ArrayList<Doctor> doctors) {
		Scanner input = new Scanner(System.in);
		Doctor targetDoctor;
		boolean isDoctorNumExist = true;
		do {
			System.out.println("Enter your doctor ID:");
			int inputDoctorId = input.nextInt();
			targetDoctor = isDoctorId(doctors, inputDoctorId);
			if (targetDoctor != null) {
				isDoctorNumExist = false;
			} else {
				System.err.println("Doctor Number dose not exist");
			}
		} while (isDoctorNumExist);
		return targetDoctor;
	}
	
	public static void printAppointment(Doctor doctor, String type) {
		for (Appointment appointment : doctor.getAppointment()) {
			if (type.equals("d")) {
				System.out.println("The data and time of appointment: " + appointment.getAppointmentDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) +
									" " + appointment.getAppointmentDate().getHour() + ":" +appointment.getAppointmentDate().getMinute() +
									" with " + appointment.getPatient().getFirstName() + " " + appointment.getPatient().getLastName() + " of Patient");
			} else if (type.equals("p")) {
				System.out.println("Your Appointment is on " + appointment.getAppointmentDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) +
									" " + appointment.getAppointmentDate().getHour() + ":" +appointment.getAppointmentDate().getMinute() +
									" with " + doctor.getFirstName() + " " + doctor.getLastName() + " of Doctor");
			}
		}
	}
	

	public static void main(String[] args) {
		
		ArrayList<Patient> patients = new ArrayList<Patient>();
		Patient patient01 = new Patient("Bill", "Sadler", "040 765 1234", "bill@canada.com", "male", 2020, 11, 02);
		Patient patient02 = new Patient("Ammaar", "Allison", "090 765 1234", "ammaar@canada.com", "female", 2020, 01, 03);
		Patient patient03 = new Patient("Arvin", "Stacey", "111 765 1234", "arvin@canada.com", "male", 1999, 01, 05);
		Patient patient04 = new Patient("Elsie", "Mcclure", "234 765 1234", "elsie@canada.com", "female", 1980, 11, 13);
		Patient patient05 = new Patient("Areeb", "Bostock", "321 765 1234", "areeb@canada.com", "male", 2020, 01, 03);
		Patient patient06 = new Patient("Seren", "Griffith", "678 765 1234", "seren@canada.com", "male", 2000, 04, 23);
		Patient patient07 = new Patient("Loretta", "Wang", "434 765 1234", "loretta@canada.com", "female", 2015, 10, 03);
		Patient patient08 = new Patient("Catherine", "Barrow", "323 765 1234", "catherine@canada.com", "male", 2000, 05, 29);
		Patient patient09 = new Patient("Kim", "Everett", "040 787 1234", "kim@canada.com", "male", 1940, 8, 18);
		Patient patient10 = new Patient("Abdallah", "Melia", "890 765 1234", "abdallah@canada.com", "female", 1970, 07, 13);
		patients.add(patient01);
		patients.add(patient02);
		patients.add(patient03);
		patients.add(patient04);
		patients.add(patient04);
		patients.add(patient05);
		patients.add(patient06);
		patients.add(patient07);
		patients.add(patient08);
		patients.add(patient09);
		patients.add(patient10);
		
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		Doctor doctor01 = new Doctor("Lex", "Rivera", "890 643 4643", "lex@canada.com", "ALLERGY");
		Doctor doctor02 = new Doctor("Mary", "Riley", "367 764 7532", "mary@canada.com", "FAMILY MEDICINE");
		Doctor doctor03 = new Doctor("Joanne", "Kirk", "474 753 1256", "joanne@canada.com", "MEDICAL GENETICS");
		Doctor doctor04 = new Doctor("Eamonn", "Nairn", "437 864 2745", "eamonn@canada.com", "EMERGENCY MEDICINE");
		doctors.add(doctor01);
		doctors.add(doctor02);
		doctors.add(doctor03);
		doctors.add(doctor04);
		
		Appointment appointment01 = new Appointment(patient01, 2020, 12, 29, 13, 30);
		Appointment appointment02 = new Appointment(patient02, 2019, 11, 30, 14, 30);
		
		doctor01.addAppointment(appointment01);
		doctor01.addAppointment(appointment02);
		
		Scanner input = new Scanner(System.in);
		String enteredVal;
		do {
			System.out.println("Enter d for doctor and p for patient:");
			enteredVal = input.next().toLowerCase();
		} while (!(enteredVal.equals("d") || enteredVal.equals("p")));
		
		switch (enteredVal) {
			case "p":
				Patient targetPatient = askPatientId(patients);
				Appointment newAppointment = createAppointment(targetPatient);
				Doctor targetDoctorForPatient = askDoctorId(doctors);
				targetDoctorForPatient.addAppointment(newAppointment);
				
				System.out.println(DIVIDER);
				printAppointment(targetDoctorForPatient, enteredVal);
				break;
			case "d":
				Doctor targetDoctorForDoctor = askDoctorId(doctors);
				
				System.out.println(DIVIDER);
				printAppointment(targetDoctorForDoctor, enteredVal);
				break;
			default:
				System.err.println("Unexpected System Error");
				break;
		}
	}
}
