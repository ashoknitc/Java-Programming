import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
	public void validateAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			System.out.println("Both String are not equal in length");
		}
		else
		{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)==true)
			{
				System.out.println("Both are anagram String");
			}
			else
			{
				System.out.println("Strings are not anagram");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String:-");
		String s1=sc.next();
		System.out.println("Enter 2nd String:-");
		String s2=sc.next();
		
		AnagramString check_anagram=new AnagramString();
		check_anagram.validateAnagram(s1,s2);
	}

}
