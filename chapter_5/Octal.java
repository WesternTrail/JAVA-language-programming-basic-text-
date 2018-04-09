import java.util.Scanner;

public class Octal{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//输入一个10进制数
		int decimal = input.nextInt();
		int i = decimal;
		//存放8进制值的字符串 
		String Octal = ""; 
		int octalValue;
		
		while(decimal!=0)
		{
			octalValue = decimal%8;
			decimal/=8;
			Octal = octalValue + Octal;
		}
		
		System.out.println("the Octal of "+i+"is"+Octal);
	}
}
