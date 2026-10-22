/****************************************************
*Author:  Rusyaidi Afiffhan Bin Rafhan
*Program Name: Activity1.i.java
*Description: get input gross pay
*Date: 22 October 2026
*Modified Date: None
*Version: 1.0
*****************************************************/
package Activity1;
import java.util.Scanner;
public class i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // get input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter hours: ");
        double hours = input.nextDouble();
        
        System.out.print("Please enter pay per hours: ");
        double pay = input.nextDouble();
        
        //calculate gross pay
        double gpay = hours*pay;
        
        //diplay gpay
        System.out.printf("Your pay is : RM%.2f\n",gpay);
        
    }
    
}
