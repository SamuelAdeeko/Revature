package homework;

import java.util.Arrays;

public class TitleCaseConversion {

	public static void main(String[] args) {
		
		String sentence1 = "Revature Software Engineering Training" ;
		String[] word1 = sentence1.split(" ");
		System.out.println(Arrays.toString(word1));
		System.out.println("\nPrinting uppercase of last character in every word");
		StringBuilder lWord = new StringBuilder();
		for(int x = 0 ; x < word1.length ; x++) {
			lWord.append(word1[x].toLowerCase().substring(0, word1[x].length()-1)).append(Character.toUpperCase(word1[x].charAt(word1[x].length() - 1))).append(" ") ;
		}
		System.out.println(lWord.toString().trim());

	}

}
