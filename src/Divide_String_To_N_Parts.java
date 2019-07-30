import java.util.Scanner;

public class Divide_String_To_N_Parts {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:-");
		String str=sc.next();
		System.out.println("Enter the part to divide String:-");
		int n=sc.nextInt();
		int len=str.length();
		String[] eqal_String=new String[n];
		int j=0,chars;
		if(len%n!=0)
		{
			System.out.println("You Can not divide String with "+n+" parts");
		}
		else
		{
			chars=len/n;
			for(int i=0;i<len;i=i+chars)
			{
				eqal_String[j]=str.substring(i,i+chars);
				j++;
			}
			System.out.println("Original String ="+str);
			System.out.println("Parts Of given String:-");
			for(int i=0;i<eqal_String.length;i++)
			{
				System.out.println(eqal_String[i]);
			}
		}
	}

}
