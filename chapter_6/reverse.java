import java.util.Scanner;

public class reverse{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("please enter a nnumber");
		int number = input.nextInt();
		reverse(number);
	}
	
	public static void reverse(int i)
	{
		while(i!=0)
		{
			System.out.print(i%10);
			i/=10;
		}
	}
}
