import java.util.Scanner;

public class makeChange {

	public static void main(String[] args) {

		double price = askPrice();
		double payment = askPayment();
		double change = payment - price;

		int wholeC = (int) change;
		double deciC = change - wholeC + 0.005;

		if (price < 0 || payment < 0) {
			System.out.println("Please enter positive number");
		}

		else if (change < 0) {
			System.out.println("Not enough money paid");
			;
		} else {

			int twentyBill = wholeC / 20;
			int tenBill = wholeC % 20 / 10;
			int fiveBill = wholeC % 20 % 10 / 5;
			int oneBill = wholeC % 20 % 10 % 5;

			int quarter = (int) (deciC / 0.25);
			int dime = (int) (deciC % 0.25 / 0.1);
			int nickel = (int) (deciC % 0.25 % 0.1 / 0.05);
			int penny = (int) (deciC % 0.25 % 0.1 % 0.05 / 0.01);

			System.out.println("Please give the following change to customer: ");
			if (twentyBill != 0)
				System.out.println("Twenty bill: " + twentyBill);
			if (tenBill != 0)
				System.out.println("Ten bill: " + tenBill);
			if (fiveBill != 0)
				System.out.println("Five bill: " + fiveBill);
			if (oneBill != 0)
				System.out.println("Dollar bill: " + oneBill);
			if (quarter != 0)
				System.out.println("Quarters: " + quarter);
			if (dime != 0)
				System.out.println("Dime: " + dime);
			if (nickel != 0)
				System.out.println("Nickel: " + nickel);
			if (penny != 0)
				System.out.println("Penny: " + penny);
		}
	}

	public static double askPrice() {
		System.out.println("Please enter the price of products: ");
		return getInput();
	}

	public static double askPayment() {
		System.out.println("Please enter the customer payments: ");
		return getInput();
	}

	public static double getInput() {
		Scanner input = new Scanner(System.in);
		double amt = input.nextDouble();
		return amt;
	}
}
