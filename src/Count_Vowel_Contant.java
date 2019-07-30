import java.util.Scanner;

public class Count_Vowel_Contant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String:-");
		String name=sc.nextLine();
		int vCount=0,cCount=0;
		System.out.println("Original String ="+name);
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)!=' ')
			{
				if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
				{
					vCount++;
				}
				else
				{
					cCount++;
				}
			}
			
		}
		System.out.println("Original String ="+name);
		System.out.println(vCount+" Vowel and "+cCount+" Consonant available in "+name);
	}

}
