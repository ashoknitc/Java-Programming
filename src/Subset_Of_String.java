import java.util.Scanner;

public class Subset_Of_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String:-");
		String str=sc.next();
		int len=str.length();
		int temp=0,total_subStrings=0;
		String[] subString=new String[len*(len+1)/2];
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				subString[temp]=str.substring(i,j+1);
				total_subStrings++;
				temp++;
			}
		}
		System.out.println("Origianl String ="+str);
		System.out.println("List of "+total_subStrings+" SubStrings are:-");
		
		for(int i=0;i<subString.length;i++)
		{
			System.out.println(subString[i]);
			
		}
	}

}
