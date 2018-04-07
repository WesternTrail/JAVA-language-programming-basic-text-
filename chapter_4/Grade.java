import java.util.Scanner;

public class Grade{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter grade:");
		String ch = input.next();
		System.out.printf("The numeric value for grade %c is %d\n",ch.charAt(0),4-(ch.charAt(0) - 'A'));
	}
}
