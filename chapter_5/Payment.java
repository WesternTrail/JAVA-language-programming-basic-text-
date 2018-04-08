import java.util.Scanner;

public class Payment{
	public static void main(String[] args)
	{
		final double Payment = 856.26;
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount:");
        double amount = input.nextDouble();
        System.out.print("Numeber of years:");
    	int years = input.nextInt();
    	System.out.print("Annual Interest Rate:");
		double rate = input.nextInt();
    	double m_rate = rate/1200;
    	
    	double Interest;
    	double Principal;
    	double Balance = amount;
    	
    	System.out.println("Payment#\t\tInterest\t\tPrincipal\t\tBalance");
    	for(int i = 1;i <= years*12;i++)
    	{
    		Interest  = Balance * m_rate;
    		Principal = Payment - Interest;
    		Balance = Balance - Principal;
    		System.out.println(i +"\t\t" + Interest +"\t\t"+ Principal +"\t\t" + Balance);
		}	
	}
}
