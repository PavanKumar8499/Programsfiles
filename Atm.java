package bankapp;

public class Atm {
//private static final String Date = date;
//	Create a Java program that simulates a basic ATM machine. The program should ask the user for their account balance and the amount they want to withdraw. Use if-else statements to ensure that the withdrawal amount does not exceed the account balance and that the user is not attempting to withdraw more than the daily withdrawal limit.

	private static double balance = 10000.00;

	double show() {
		System.out.println("Your Available Balance is " + balance);
		return balance;
	}

	private double pin;

	Atm(double pin) {
		this.pin = pin;
		show();
//		System.out.println("Your Balance is "+balance);
	}

	boolean verifyPin(double enteredPin) {
		return this.pin == enteredPin;
	}

//	Atm(int p) {
//		System.out.println("Your Balance is " + balance);
//	}

	double withdraw(double enteredPin, double a) {
		if (verifyPin(enteredPin)) {
			if (balance >= a) {
				balance -= a;
				System.out.println("HDFC bank has debited " + a);
				
			} else {
				System.out.println("Withdrawal amount exceeds the available balance. " + show());
			}

		} else {
			System.out.println("Incorrect PIN. Please try again.");
		}
//		if (balance > a) {
//			balance = balance - a;
//			System.out.println("HDFC Bank Rs. "+a+" debited from a/c on "+" Not you then call on 7558467627 now ur available bal is: "+balance);
//		}else {System.out.println("Amt not available coz ur bal is "+balance);}
		return show();
	}

	double credit(double enteredPin, double b) {
		balance += b;
		System.out.println("Your Acc has been credited " + b );
		return show();
	}

	public static void main(String[] args) {
		final double accPin = 123;
		Atm a = new Atm(accPin);
//		show();

		if (a.verifyPin(accPin)) {
//			a.withdraw(accPin, 0);
			a.credit(123, 5000);
		} else {
			System.out.println("Incorrect PIN. please Try Again.");
		}
		
//		a.withdraw(1234, 20000);
		
//		a.withdraw(500,123);
//		a.withdraw(700,123);
//		System.out.println(balance);
//		a.credit(700);
//		System.out.println(balance);
//		a.withdraw(200);
//		a.withdraw(279);

	}

//	double withdraw () {
//		
//		return balance;
//	}
}
