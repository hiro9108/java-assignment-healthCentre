package ca.java.healthCareCenter;


public class User {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	
	public User(String firstName, String lastName, String phoneNumber, String email) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setEmail(email);
	
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
	
	@Override
	public String toString() {
		return "\nFirst Name: " + firstName +
				"\nLast Name: " + lastName + 
				"\nPhone Number: " + phoneNumber + 
				"\nEmail: " + email ;
	}
}
