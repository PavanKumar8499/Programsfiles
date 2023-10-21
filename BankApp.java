package bankapp;

public class BankApp {
private static int bal =1000;

 int show() {
	System.out.println("Your Avl Bal is "+bal+" RS");
	return bal;
}

 int credit(int amt) {
	bal+=amt;
	System.out.println("Your Acc is Credited with "+amt+" Rs");
	show();
	return bal;
}

int withdraw(int wit) {
	bal-=wit;
	System.out.println("Your Acc is Debited with "+wit+" Rs");
	show();
	return bal;
}



public static void main(String[] args) {
	BankApp ba= new BankApp();
	ba.credit(1200);
	ba.withdraw(200);
}



//public static int getBal() {
//	return bal;
//}
//
//public static void setBal(int bal) {
//	BankApp.bal = bal;
//}

}
