import java.util.Scanner;

public class Money2{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double dollar = input.nextDouble();
		int rate = input.nextInt();
		int month = input.nextInt();
		int i = month;
		double sum = 0;
		
		while(i!=0){
			sum = (sum+dollar)*(1+rate/1200);
			i--;
		}
		
		System.out.println("the Amount of the "+month+"months later is:"+sum);
	}
}
