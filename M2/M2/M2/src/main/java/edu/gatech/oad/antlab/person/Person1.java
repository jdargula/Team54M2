package edu.gatech.oad.antlab.person;
import java.util.Arrays;

/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string
 *
 *  @author Bob
 *  @version 1.1
 */
public class Person1 {
    /** Holds the persons real name */
    private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
    public Person1(String pname) {
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
        //Person 1 put your implementation here
        char[] inputArr = input.toCharArray();
        char firstChar = inputArr[0];
        char secondChar = inputArr[1];
        for (int i = 0; i < input.length() - 3; i++) {
            inputArr[i] = inputArr[i + 2];
        }
        inputArr[input.length() - 2] = firstChar;
        inputArr[input.length() - 1] = secondChar;
        
		String output = "";
		for (int j = 0; j < input.length(); j++) {
			output = output + inputArr[j];
		}
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