import java.util.HashMap;
import java.util.Scanner;

public class No_Of_Occurance_Word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :-");
		String str=sc.nextLine();
		String[] No_Of_Words=str.split(" ");
		HashMap<String,Integer> count=new HashMap<>();
		for(String s:No_Of_Words)
		{
			if(count.containsKey(s))
			{
				count.put(s, count.get(s)+1);
			}
			else
			{
				count.put(s,1);
			}
		}
		System.out.println("Original String="+str);
		System.out.println("Occurance Of String="+count);
	}

}
