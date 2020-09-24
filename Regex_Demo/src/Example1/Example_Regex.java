package Example1;

public class Example_Regex {
	public void isValid() {
		String zipCode = "38555";
		String license_plate = "1Z3-M9O";
		String drivers_license = "123456789";
		String social_security = "000-00-0000";
		String phone_number = "931-000-1234";
		String school_id = "T0331577";
		if (zipCode.matches("[0-9]{5}")) {
			System.out.println("Valid zip code!");
		}else {
			System.out.println("Invalid zip code");
		}
		
		if (license_plate.matches("[A-Z0-9]{3}-[A-Z0-9]{3}")) {
			System.out.println("Valid license plate!");
		}else {
			System.out.println("Invalid license plate");
		}

		if (drivers_license.matches("[0-9]{9}")) {
			System.out.println("Valid drivers license!");
		}else {
			System.out.println("Invalid drivers license");
		}
		
		if (social_security.matches("[0-9]{3}-[0.9]{2}-[0-9]{4}")) {
			System.out.println("Valid social security!");
		}else {
			System.out.println("Invalid social security");
		}
		
		if (phone_number.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")) {
			System.out.println("Valid phone number!");
		}else {
			System.out.println("Invalid phone number");
		}
		
		if (school_id.matches("T[0-9]{7}")) {
			System.out.println("Valid school id!");
		}else {
			System.out.println("Invalid school id");
		}
	}
		
		public static void main(String[] args) {
			Example_Regex myValid = new Example_Regex();
			myValid.isValid();
			}
}
