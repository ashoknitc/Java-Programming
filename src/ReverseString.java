import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name:-");
		String s=sc.next();
		
		//Using SrringBuffer class
		String name=new StringBuffer(s).reverse().toString();
		System.out.println("Original String ="+s);
		//System.out.println("Reverse String ="+name);
		
		
		//Using iteator
		char[] name1=s.toCharArray();
		String revString="";
		for(int i=name1.length-1;i>=0;i--)
		{
			revString+=name1[i];
		}
		System.out.println("Reverse String ="+revString);
	}

}
