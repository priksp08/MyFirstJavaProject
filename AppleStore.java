
import java.util.*;

public class AppleStore {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String[] name = new String[3];
String[] Prod = new String[3];
String[] cost = new String[3];
int[] c = new int[3];
int sum = 0,sum2 = 0,sum3 = 0 ;

for(int i=0;i<3;i++){
			
System.out.println("Enter the details of the customers\n ");
name[i] = sc.nextLine();
Prod[i] = sc.nextLine();
cost[i] = sc.nextLine();
int c1 = Integer.parseInt(cost[i].trim());
 sum = sum + c1;
}	
		
for(int i=0;i<3;i++){
System.out.println("The customer \t" + name[i] + " purchased the product  \t " + Prod[i] + " with the cost  \t " + "$"+cost[i]);
if(Prod[i].equals("iphone6s"))
{
int c2 = Integer.parseInt(cost[i]);	
sum2 = sum2 + c2;
}
else {
int c3 = Integer.parseInt(cost[i]);	
sum3 = sum3 + c3;
	}
	
	
}

System.out.println("Total sales of the iphones is  :\t" +"$"+ sum);
System.out.println("Total sales of iphone6s is :\t" +"$"+ sum2);
System.out.println("Total sales of  iphone6splus is :\t" +"$"+ sum3);

}


}