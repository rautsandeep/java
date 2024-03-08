package basics;

public class IfElseIF {
	public static void main(String[] args) {
		String env = "prod";
		if (env == "poc") {
			System.out.println("This is POC environment");
		}
		else if (env == "dev")
		{
			System.out.println("This is dev environment");
		}
		else if (env == "uat")
		{
			System.out.println("This is UAT environment");
		}
		else
		{
			System.out.println("THis is prod environment. Do not mess with it");
		}
	}

}
