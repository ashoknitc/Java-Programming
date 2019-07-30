import java.util.HashMap;
import java.util.Scanner;

public class Find_Duplicate_Character_Of_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter String:-");
		String str=sc.next();
		char[] ch=str.toCharArray();
		HashMap<Character,Integer> count_Character=new HashMap<>();
		for(char c:ch)
		{
			if(count_Character.containsKey(c))
			{
				count_Character.put(c,count_Character.get(c)+1);
			}
			else
			{
				count_Character.put(c,1);
			}
		}
	}

}
