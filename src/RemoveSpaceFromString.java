import java.util.Scanner;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String:-");
		String s=sc.nextLine();
		String withoutSpace=s.replaceAll("\\s","");
		System.out.println("Original String="+s);
		System.out.println("WithoutSpac="+withoutSpace);
		char[] ch=s.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ' && ch[i]!='\t')
			{
				sb.append(ch[i]);
			}
		}
		System.out.println("WithoutSpac="+sb);
	}

}
