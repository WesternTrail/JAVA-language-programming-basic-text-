import java.util.Scanner;

public class Binary{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//����һ��10������
		System.out.print("Enter an integer:");
		int decimal = input.nextInt();
		int deci = decimal;
		//���8����ֵ���ַ��� 
		String Binary = ""; 
		int binaryValue;
		
		while(decimal!=0)
		{
			binaryValue = decimal%2;
			decimal/=2;
			Binary = binaryValue + Binary;
		}
		
		int Length = Binary.length();
		for(int i = 0;i < (16-Length);i++)
		{
			if(deci > 0)
				Binary = 1 + Binary;
			else
				Binary = 0 + Binary;
		}
		
		System.out.println("the bits are" + Binary);
	}
}
