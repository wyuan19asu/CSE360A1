package cse360assignment02;

/**
 * Main class AddingMachine, initializes an int called total
 *  and a string called history
 */
public class AddingMachine {
	private int total;
	private String history = "0";

	/**
	 * Adding machine method with the int total set to 0
	 */
	public AddingMachine() {
		total = 0; // not needed - included for clarity
	}

	/**
	 * getTotal method returns the total of the sum and subtraction.
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * add method that takes in an int value and adds it to the total 
	 * and adds the value to the history string.
	 */
	public void add(int value) {
		total = (total + value);
		history += " + " + value;
	}

	/**
	 * subtract method that takes in an int value and subtracts from the total 
	 * and adds the value to the history string.
	 */
	public void subtract(int value) {
		total = (total - value);
		history += " - " + value;
	}

	/**
	 * to string method that returns the output of history
	 */
	public String toString() {
		return history;
	}

	/**
	 * void method to clear values of total and history
	 */
	public void clear() {
		total = 0;
		history = "0";
	}

	/**
	 * Main method for testing purposes
	 */
	
	/**
	 * public static void main(String[] args) { AddingMachine myCalculator = new
	 * AddingMachine(); myCalculator.add(4); myCalculator.subtract(2);
	 * myCalculator.add(5);
	 * 
	 * System.out.println(myCalculator.toString()); System.out.println("Total = " +
	 * myCalculator.getTotal()); myCalculator.clear();
	 * 
	 * }
	 */

}