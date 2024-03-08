package basics;

public class Static {
	static void add()
	{
		System.out.println("This method is used to add two number");
	}
	static void subtract()
	{
		System.out.println("This method will subtract two number");
	}
	public static void main(String[] args) {
		System.out.println("This is the execution of main method");
		add();
		add();
		subtract();
		add();
		System.out.println("CAlling of all method is finished.");
	}
}
