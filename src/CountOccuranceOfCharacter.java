import java.util.Scanner;

public class CountOccuranceOfCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String :-");
		String s=sc.next();
		System.out.println();
		System.out.println("Enter your Character to find:-");
		String c=sc.next();
		
		
		
		int number_without_character=s.replace(c,"").length();
		int no_of_occurance_of_char=s.length()-number_without_character;
		System.out.println(no_of_occurance_of_char);
	}

}
