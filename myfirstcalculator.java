package mypractice;

import java.util.*;

public class myfirstcalculator {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("please enter the values of \n 1=a+b\n 2=a-b\n 3=a*b\n nd so on like this ");
		int Switch = s.nextInt();
		System.out.println("enter 1st value now ");
		int a = s.nextInt();
		System.out.println("enter 2nd value now ");
		int b = s.nextInt();
		/**
		 * 1->+
		 * 2->-
		 * 3->*
		 * 4->/
		 * 5->%
		 */
		int x= a+b;
		int y= a-b;
		int d= a*b;
		int c= a/b;
		int e= a%b;
		
		switch (Switch) {
		case 1:System.out.println("addition of two num= "+x);
		break;
		case 2:System.out.println("subtraction of two num= "+y);
		break;
		case 3:System.out.println("multi of two num= "+d);
		break;
		case 4:System.out.println("div of two ="+ c);
		break;
		default:System.out.println("30 days challenge= " +e);
		}
	}
}
