package com.revature.calculator;

import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {
		
		double result = 0;
		
		Calculator robo = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("input the first number: ");
		while(!sc.hasNextDouble()) {
			System.out.println("Invalid input try again");
			sc.next();
		}
		robo.setOperatorOne(sc.nextDouble());
		
		System.out.println("input the math operator");
		while(!sc.hasNext()) {
		System.out.println("invalid input try again");
		sc.next();
		}
		/*while((!sc.next().equals("*") | !sc.next().equals("+") | !sc.next().equals("/")| !sc.next().equals("-"))){
			System.out.println("invalid input try again");
			sc.next();
		}*/
		robo.setOperatorArithmetic(sc.next());
		
		System.out.println("input the second number: ");
		while(!sc.hasNextDouble()) {
			System.out.println("Invalid input try again");
			sc.next();
		}
		robo.setOperatorTwo(sc.nextDouble());
		
		sc.close();
		//System.out.println(robo.getOperatorArithmetic());
		if(robo.getOperatorArithmetic().equals( "+")) {
			result = robo.addition();
		}
		else if(robo.getOperatorArithmetic().equals("-")) {
			result = robo.subtract();
		}
		else if(robo.getOperatorArithmetic().equals( "*")) {
			result = robo.multiply();
		}
		else if(robo.getOperatorArithmetic().equals( "/")) {
			result = robo.divide();
		}
		
		System.out.println("the answer is: "+result);

	}
	

}
