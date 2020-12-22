package homework;

public class ReqexDLValidation {

	public static void main(String[] args) {
//		*Task...REQEX..Write a reqex to validate a phone number
//		 *write a regex to validate a driving license number
		
		String phoneNumber = "+1-51056308479";
		System.out.println("\nValidating phone number");
		if(phoneNumber.matches("\\+1-[0-9]{10}")) {			//Note: \\ are escape sequence used because of the + used
			System.out.println("Valid phone Number");
		} else {
			System.out.println("Invalid phone Number");
		}
		
		String dlNumber = "Y2134567";
		System.out.println("\nValidating driving license number");
		if(dlNumber.matches("[A-Z]{1}[0-9]{7}")) {			//Note: \\ are escape sequence used because of the + used
			System.out.println("Valid driving license Number");
		} else {
			System.out.println("Invalid driving license Number");
		}
		
	}

}
