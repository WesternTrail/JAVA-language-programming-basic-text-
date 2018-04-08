import java.util.Scanner;

public class gcd{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        int d = (a>b)?b:a;
        for(;;d--)
        {
        	if(a%d == 0 && b%d==0)
        	{
        		break;
			}
		}
		
		System.out.println("最大公约数是："+d);
	}
}
