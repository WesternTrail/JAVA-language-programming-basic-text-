import java.util.Scanner;


public class SixArea {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the sid:");
		double s = input.nextDouble();
		double area = (6 * Math.pow(s,2))/(4 * Math.tan(Math.PI / 6));
		System.out.printf("the area of hexagon: %2.2f",area);
	}
} 
