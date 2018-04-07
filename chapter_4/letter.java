import java.util.Scanner;

public class letter{
	public static void main(String[] args)
	{
		//a + (int)(Math.random() * b) 产生a - a+b不包括a+b的随机数;
		int ch = 56 + (int)(Math.random() * 35);
		System.out.printf("letter is:%c",ch);
	}
}
