import java.util.Scanner;

public class Substring{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String s1:");
		String s1 = input.next();
		System.out.print("Enter String s2:");
		String s2 = input.next();
		
		if(s1.contains(s2))
			System.out.printf("%s is a substring of %s",s2,s1);
		else
			System.out.printf("%s is not a substring of %s",s2,s1);
	}
}
