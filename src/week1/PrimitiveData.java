package week1;

public class PrimitiveData {

	public static void main(String[] args) {
		
		byte b=100;
		int a=b;
		System.out.println("byte to int data is ="+a);
		
		char c='p';
		int d=c;
		System.out.println("char to int data is ="+d);
		
		
		System.out.println("****************");
		
		int y=112;
		char x=(char)y;
		System.out.println("int to char conversation ="+x);
		
		long l1=9999999999l;
		int i=(int) l1;
		System.out.println("long to int conversion ="+i);
		
		System.out.println("*******Wrapper class*************");
		
		String s1="100";
		System.out.println(s1+100);
		int in=Integer.parseInt(s1);
		System.out.println("converting string to int is = "+(in+100));
		
		String s2="55.55";
		System.out.println(s2+11.11);
		double d1=Double.parseDouble(s2);
		System.out.println("converting string to double ="+(d1+11.11));
		
		String s3="Adffvbzdsjkvb";
		System.out.println("converting string to char"+(s3+2));
		s3.charAt(5);
		
		
		s3.toCharArray();		
		
		

	}

}
