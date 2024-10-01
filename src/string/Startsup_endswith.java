package string;

public class Startsup_endswith {

	public static void main(String[] args) 
	{
		String h1="Welcome harsha to Java Traning";
		
		System.out.println("Excepted startsWith Welcome :"+h1.startsWith("Welcome"));
		System.out.println("Excepted startsWith Wel :"+h1.startsWith("Wel"));
		System.out.println("Excepted startsWith W :"+h1.startsWith("W"));
		System.out.println("Excepted startsWith come :"+h1.startsWith("come"));
		
		System.out.println("********************************************************");
		//endswith
		System.out.println("Excepted endsWith Traning :"+h1.endsWith("Traning"));
		System.out.println("Excepted endsWith ing :"+h1.endsWith("ing"));
		System.out.println("Excepted endsWith g :"+h1.endsWith("g"));
		System.out.println("Excepted endsWith Welcome :"+h1.endsWith("Welcome"));
		
	}

}
