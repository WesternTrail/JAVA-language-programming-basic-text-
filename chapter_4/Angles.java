import java.util.Scanner;

public class Angles{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double x = -2*Math.PI + Math.random() * 2 *Math.PI;
		double y = -2*Math.PI + Math.random() * 2 *Math.PI;
		double z = -2*Math.PI + Math.random() * 2 *Math.PI;
	
		double x1 = Math.cos(x);
		double y1 = Math.sin(x);
		
		double x2 = Math.cos(y);
		double y2 = Math.sin(y);
		
		double x3 = Math.cos(z);
		double y3 = Math.sin(z);
		
		double a = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
		double b = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
		double c = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		
		double A = Math.acos((b*b + c*c - a*a)/(2*b*c));
		double B = Math.acos((a*a + c*c - b*b)/(2*a*c));
		double C = Math.acos((a*a + b*b - c*c)/(2*a*b));
		
		System.out.printf("The three angles are: %2.2f %2.2f %2.2f",A,B,C);
	}
} 

