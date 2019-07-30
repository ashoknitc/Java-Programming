import java.util.Scanner;

public class Reverse_Each_Word_Of_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String:-");
		String s=sc.nextLine();
		String[] original_string=s.split(" ");
		String revStringList="";
		for(int i=0;i<original_string.length;i++)
		{
			String word=original_string[i];
			String revString="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revString=revString+word.charAt(j);
			}
			revStringList=revStringList+" "+revString;
		}
		System.out.println("Origianl String ="+s);
		System.out.println("Reverse Of Each Character Of String="+revStringList);
	}

}
