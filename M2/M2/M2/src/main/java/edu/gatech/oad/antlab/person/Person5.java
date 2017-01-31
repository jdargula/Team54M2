package edu.gatech.oad.antlab.person;
import java.util.Arrays;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person5 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Split the string into its characters
	    char[] splitInput = input.toCharArray();

	  //First two characters get pushed to the back
        char firstLetter = splitInput[0];
        char secondLetter = splitInput[1];
		
	  //Iterate through
        for (int i = 0; i < input.length() - 3; i++) {
            splitInput[i] = splitInput[i + 2];
        }
		
	  //Put the two characters at the end
        splitInput[input.length() - 2] = firstLetter;
        splitInput[input.length() - 1] = secondLetter;
		
		String output = Arrays.toString(splitInput);
        return output;
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}