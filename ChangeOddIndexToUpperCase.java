package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		 String sample = "changeme"; 
		    // initialize string buffer to hold updated string 
		    StringBuffer updatedString = new StringBuffer(); 
		    // get array of characters in string 
		    char[] characters = sample.toCharArray(); 
		    // iterate over characters 
		    for (int index = 0; index < characters.length; index++) { 
		      // get current character 
		      char c = characters[index]; 
		      // check if position of this character is odd 
		      if (index % 2 != 0) { 
		        // convert it to upper case 
		        c = Character.toUpperCase(c); 
		      } 
		      // append character to string buffer 
		      updatedString.append(c); 
		    } 
		    System.out.println("Modified string is: " + updatedString.toString()); 

	}

}
