import java.util.HashMap;
import java.util.Scanner;

public class Occurance_Of_Each_Character {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String :-");
		String s=sc.next();
		char[] ch=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap();
		for(char c:ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c,hm.get(c)+1);
			}
			else
			{
				hm.put(c,1);
			}
		}
		System.out.println("Origianl String ="+s);
		System.out.println("Occurance Of Character ="+hm);
	}

}
