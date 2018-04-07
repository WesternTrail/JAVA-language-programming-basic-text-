import java.util.Scanner;


public class Maximum_circle {
	public static void main(String[] args)
	{
		final double radius = 6371.01;
		
		Scanner input = new Scanner(System.in);
		double x1,y1,x2,y2;
		double x_1,y_1,x_2,y_2;
		double d;
		
		System.out.print("Enter point 1 in degeress:");	
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		
		System.out.print("\n");
		System.out.print("Enter point 2 in degeress:");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		System.out.print("\n");
		
		x_1 = Math.toRadians(x1);
		y_1 = Math.toRadians(y1);
		x_2 = Math.toRadians(x2);
		y_2 = Math.toRadians(y2);
		
		d = radius * Math.acos(Math.sin(x_1) * Math.sin(x_2) + Math.cos(x_1) * Math.cos(x_2) * Math.cos(y_1-y_2) );
		System.out.printf("the distance between the two points is %5.11f km",d);
	}
} 
