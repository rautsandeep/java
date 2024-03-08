package basics;

public class IfBlock {
	public static void main(String[] args) {
		int age =20;
		if (age > 18)
		{
			System.out.println("The person can cast a vote as age "+age+" is greater than 18");
		}
		age=3;
		if (age < 18)
		{
			System.out.println("The person cannot cast the vote as age "+age+" is less than 18");
		}
	}
}
