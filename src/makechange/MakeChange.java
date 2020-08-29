package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompts user for item price and amount tendered.
		System.out.print("Please enter the price of your item: ");
		float itemPrice = input.nextFloat();
		System.out.print("Please enter the amount tendered: ");
		float amountTendered = input.nextFloat();
		// Produces error message and re-prompts user for valid input.
		if (amountTendered < itemPrice) {
			System.out.print("Insufficient funds.\n" + "Please re-enter valid amount: ");
			amountTendered = input.nextFloat();
		}
		// Calculates change into fewest possible denominations.
		if (amountTendered >= itemPrice) {
			float change = (float) ((float) (amountTendered - itemPrice) + .001);
			int remainingChange = (int) (change * 100);
			int dollars = remainingChange / 100;
			remainingChange = remainingChange % 100;
			int quarters = remainingChange / 25;
			remainingChange = remainingChange % 25;
			int dimes = remainingChange / 10;
			remainingChange = remainingChange % 10;
			int nickels = remainingChange / 5;
			remainingChange = remainingChange % 5;
			int pennies = remainingChange / 1;
		// Outputs change amount and the number of each coin returned, then closes program.
			System.out.println("Your change is: " + change + "\n" + "Returning: " + "\n" + dollars + " dollar(s)" + "\n"
					+ quarters + " quarter(s)" + "\n" + dimes + " dime(s)" + "\n" + nickels + " nickel(s)" + "\n"
					+ "and" + "\n" + pennies + " pennies");
			System.out.print("Have a nice day!");
			input.close();
		}
	}
}