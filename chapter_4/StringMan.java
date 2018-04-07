import java.util.Scanner;

public class StringMan{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String s = input.next();
		System.out.printf("length: %d first char: %c",s.length(),s.charAt(0));
	}
}
