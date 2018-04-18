import java.util.Scanner;

public class PrintCalendar{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//prompt the user to enter year
		System.out.println("Enter full year(e.g.g,2012):");
		int year = input.nextInt();
		
		System.out.println("Enter month as number between 1 and 12:");
		int month = input.nextInt();
		
		//print calendar for the month of the year
		printMonth(year,month);		
	}
	
	//打印日历 
	public static void printMonth(int year,int month){
		printMonthTitle(year,month);
		
		printMonthBody(year,month);
	}
	
	//打印日历的标题 
	public static void printMonthTitle(int year,int month){
		System.out.println("      "+getMonthName(month)
		+" "+year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
	
	//打印日历的主体 
	public static void printMonthBody(int year,int month){
		int startDay = getStartDay(year,month);
		
		int NumberOfDaysInMonth = getNumberOfDaysInMonth(year,month);
		
		int i = 0;
		for(i = 0;i < startDay;i++)
			System.out.print("    ");
		
		for(i = 1;i <= NumberOfDaysInMonth;i++){
			System.out.printf("%4d",i);
			
		if((i+startDay)%7 == 0)
			System.out.println();
		}
	}
	

	//获得日历的月份名字 
	public static String getMonthName(int month){
		String name = "";
		switch(month){
			case 1:name = "January";break;
			case 2:name = "February";break;
			case 3:name = "Match";break;
			case 4:name = "May";break;
			case 5:name = "April";break;
			case 6:name = "June";break;
			case 7:name = "July";break;
			case 8:name = "August";break;
			case 9:name = "September";break;
			case 10:name = "October";break;
			case 11:name = "November";break;
			case 12:name = "December";break;
		}
			return name;
	}
	
	//获得当月的第一天是星期几 
	public static int getStartDay(int year,int month){
		final int START_DAY_FOR_JAN_1_1800 = 3;
		
		int totalNumberOfDays = getTotalNumberOfDays(year,month);
		
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}
	
	//获得现在到1800年的总天数 
	public static int getTotalNumberOfDays(int year,int month){
		int total = 0;
		
		for(int i = 1800;i < year;i++)
		{
			if(isLeapYear(i))
				total += 365;
			else
				total += 366;
		}
		
		for(int i = 1;i < month;i++)
		{
			total += getNumberOfDaysInMonth(year,i);
		}
		return total;
	}
	
	//获得月份的天数 
	public static int getNumberOfDaysInMonth(int year,int month){
		if(month == 1||month == 3||month == 5||month == 7
		||month == 8||month == 10||month == 12)
			return 31;
		
		if(month == 4||month ==6||month ==9||month == 11)
			return 30;
		
		if(month == 2)
		{
			return isLeapYear(year)?29:28;
		}
		
		return 0;
	}
	
	//判断是否是闰年 
	public static boolean isLeapYear(int year){
		return (year%400==0)||(year%4==0&&year%100!=0);
	}
} 
