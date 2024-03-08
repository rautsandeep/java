package basics;

public class FiveMehod {
	static void add() {
		int a = 100;
		int b = 50;
		int sum = a + b;
		System.out.println("The sum of two number is" + sum);

	}

	static void sub() {
		int a = 100;
		int b = 200;
		int sub = b - a;
		System.out.println("subtraction of two number is: " + sub);
	}

	static void mul() {
		byte monthnumber = 3;
		byte salary = 100;
		int totalsalary = monthnumber * salary;
		System.out.println("total salary drawn by Employee is: " + totalsalary);
	}

	static void div() {
		short s = 5000;
		int c = 4000;
		int d = s / c;
		System.out.println("Division of two number is: " + d);

	}

	static void quo() {
		int a = 32;
		int b = 5;
		float quo = a % b;
		System.out.println("The quotient of division is" + quo);
	}

	public static void main(String[] args) {
		
		System.out.println("We will call all the mehod one by one");
		add();
		sub();
		div();
		quo();
	}

}
