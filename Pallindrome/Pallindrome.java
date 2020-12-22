package homework;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Print all pallindrome between 1000 to 9999	
		
				String checkWord = "11000011";
				StringBuffer compareWord = new StringBuffer(checkWord);
				System.out.println(checkWord);
				if(compareWord.reverse().toString().equals(checkWord)) {
					System.out.println("Palindrome");
				} else {
					System.out.println("Not a Palindrome");
				}
				System.out.println();

	}

}
