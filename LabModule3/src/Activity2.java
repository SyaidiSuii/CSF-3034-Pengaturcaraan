
import java.util.Scanner;

/****************************************************
*Author:  Rusyaidi Afiffhan Bin Rafhan
*Program Name: Calculate average fee
*Description: Display the output at console
*Date: 22 October 2026
*Modified Date: None
*Version: 1.0
*****************************************************/
public class Activity2 {
    public static void main (String[] args){
        System.out.println("**************************");
        System.out.println("MY CELL FROM OVERAGE FEE");
        System.out.println("**************************");
        
        //get input from user
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF EXCESS MINUTES: ");
        double minute = input.nextDouble();
        
        //calculate fee
        double fee = (minute)*0.35;
        
        //display
        System.out.printf("OVERAGE FEE = RM%.2f\n",fee);
    }
}
