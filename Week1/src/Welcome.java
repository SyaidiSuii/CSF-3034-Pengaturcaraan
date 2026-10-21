import java.util.Scanner;

public class Welcome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner class
        Scanner inputage = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = inputage.nextInt();
        
        //display output
        System.out.println("Your age is "+age+" years old");
        
    }
    
}
