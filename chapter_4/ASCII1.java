import java.util.Scanner;

public class ASCII1{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a ASCII code:");
		int ch = input.nextInt();
		System.out.printf("The cahracter for ASCii code %d is %c",ch,ch);
	}
} 
