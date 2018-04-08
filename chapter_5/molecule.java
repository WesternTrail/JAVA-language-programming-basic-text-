import java.util.Scanner;

public class molecule{
	public static void main(String[] args)
	{
		double sum = 0;
		for(int i = 0;i < 49;i++)
		{
			double molecule = 2*i + 1;
			double j = molecule + 2;
			sum += (molecule / j);
		}
		System.out.printf("the sum is:%2.2f",sum);
	}
}
