import java.util.Scanner;
public class week{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a year :");
        int year=input.nextInt();
        System.out.print("Enter the first day of the year is a few weeks :");
        int week=input.nextInt();
        String M=null;
        int mouth;
        int W;
        boolean LeapYear=(year%4==0&&year%100!=0)||(year%400==0);	//判断是否是闰年 
        for(mouth=1;mouth<=12;mouth++){
            if(mouth==1){	//第一天已经给出了星期所以不用进行操作 
                M="January";
            }else if(mouth==2){		//因为第一天有31天，所以第二个月的第一天的礼拜数是这样 
                W=(31%7+week)%7;
                week=W;
                M="February";
            }else if(mouth==3){	//第二个月的天数会因平闰年的不同而不同 
                    if(LeapYear){
                W=(29%7+week)%7;
                week=W;
                 M="March";
                }else
                {W=(28%7+week)%7;
                week=W;}
                M="March";
            }else if(mouth==4){
                W=(31%7+week)%7;
                week=W;
                M="April";
            }else if(mouth==5){
                W=(30%7+week)%7;
                week=W;
                M="May";
            }else if(mouth==6){
                W=(31%7+week)%7;
                week=W;
                M="June";
            }else if(mouth==7){
                W=(30%7+week)%7;
                week=W;
                M="July";
            }else if(mouth==8){
                W=(31%7+week)%7;
                week=W;
                M="August";
            }else if(mouth==9){
                W=(31%7+week)%7;
                week=W;
                M="September";
            }else if(mouth==10){
                W=(30%7+week)%7;
                week=W;
                M="October";
            }else if(mouth==11){
                W=(31%7+week)%7;
                week=W;
                M="November";
            }else if(mouth==12){
                W=(30%7+week)%7;
                week=W;
                M="December";
            }
                   switch(week){
            case 1: System.out.println(M+" "+mouth+" "+year+" is Monday");break;
            case 2: System.out.println(M+" "+mouth+" "+year+" is Tuesday");break;
            case 3: System.out.println(M+" "+mouth+" "+year+" is Wednesday");break;
            case 4: System.out.println(M+" "+mouth+" "+year+" is Thursday");break;
            case 5: System.out.println(M+" "+mouth+" "+year+" is Friday");break;
            case 6: System.out.println(M+" "+mouth+" "+year+" is Saturday");break;
            case 0: System.out.println(M+" "+mouth+" "+year+" is Sunday");break;
            }
        }
}  
}	
