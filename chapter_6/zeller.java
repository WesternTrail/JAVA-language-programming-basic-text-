import java.util.Scanner;

public class zeller{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int day = input.nextInt();
		int month = 3;
		while(month <= 14)
		{
			System.out.println(year+" "+(month-2)+"first day is:");
			if(Zeller(year,month,day) == 0)
				System.out.println("星期日");
			if(Zeller(year,month,day) == 1)
				System.out.println("星期1");
			if(Zeller(year,month,day) == 2)
				System.out.println("星期2");
			if(Zeller(year,month,day) == 3)
				System.out.println("星期3");
			if(Zeller(year,month,day) == 4)
				System.out.println("星期4");
			if(Zeller(year,month,day) == 5)
				System.out.println("星期5");
			if(Zeller(year,month,day) == 6)
				System.out.println("星期6");
			month++;
		}
	}
	
	public static int Zeller(int year,int month,int day){
		int w = (int)((year/100-1)/4) - 2*(year/100-1) + 
		(year%100) + (int)((year%100)/4) + (int)(13*(month+1)/5)
		+ day - 1;
		w = w%7;
		return w;
	}
}
