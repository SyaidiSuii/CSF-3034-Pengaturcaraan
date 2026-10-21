import java.util.Scanner;
public class Sum {
    public static void main(String args[]){
        
        //scanner class
        Scanner get_data = new Scanner(System.in);
        
        //read no1
        System.out.print("Please enter first number: ");
        int no1 = get_data.nextInt();
        
        //read no2
        System.out.print("Please enter second number: ");        
        int no2 = get_data.nextInt();

        //total number
        int total = no1+no2;
        
        //display total
        System.out.println("The total is :"+total);
    }
}
