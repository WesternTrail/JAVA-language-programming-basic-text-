import java.util.Scanner;

public class Octal{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//����һ��10������
		int decimal = input.nextInt();
		int i = decimal;
		//���8����ֵ���ַ��� 
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
