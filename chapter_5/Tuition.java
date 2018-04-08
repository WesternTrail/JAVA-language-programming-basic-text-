import java.util.Scanner;

public class Tuition{
	public static void main(String[] args)
	{
		double Tuition = 10000;
		int count = 0;
		while(count < 10)
		{
			Tuition = Tuition * (1+0.05);
			count++;
		}
		System.out.println("the Tuition of the ten year later is:"+Tuition);
		
		double TotalTuition = 0;
		
		for(int i = 0;i < 4;i++)
		{
			TotalTuition += Tuition * (1+0.5);
		}
		System.out.println("the TotalTuition of the four year is:"+TotalTuition);
	}
}
