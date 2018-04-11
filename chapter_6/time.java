import java.util.Scanner;

public class time{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		long millis;
		millis = input.nextLong();
		System.out.println(convertMillis(millis));
	}
	
	public static String convertMillis(long millis)
	{
		long totalmillis = System.currentTimeMillis();
		long totalsecond = totalmillis/1000;
		long nowsecond = totalsecond % 60;
		long totalminute = totalsecond/60;
		long nowminute = totalminute%60;
		long totalhour = totalminute / 60;
		long nowhour = totalhour % 24;
		
		String s = "";
		s = nowhour+":"+nowminute+":"+nowsecond;
		return s;
	}
}
