/****************************************************
*Author:  Rusyaidi Afiffhan Bin Rafhan
*Program Name: Activity1.ii.java
*Description: get input using Dialog box
*Date: 22 October 2026
*Modified Date: None
*Version: 1.0
*****************************************************/
package Activity1;

import javax.swing.JOptionPane;

public class ii {
   public static void main(String[] args) {
       //get input from user
       String shours = JOptionPane.showInputDialog("Please enter hours: ");
       double hours = Double.parseDouble(shours);
       String spay = JOptionPane.showInputDialog("Please enter pay per hours: ");
       double pay = Double.parseDouble(spay);
       
       //calculate gross pay
       double gpay = hours*pay;
       String message = String.format("Your gross pay total is: RM%.2f", gpay);
       
       JOptionPane.showMessageDialog(null,message);
   }
}
