import java.util.Scanner;
public class CalculateArea {
    public static void main(String[] args) {
        //get radius
        System.out.println("Please enter a radius:");
        
        //create class scanner
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        
        //calculate arae
        double area = radius * radius * Math.PI;
        
        
        
        //display output
        System.out.printf("Total of area: %.2f\n",area);
    }
}
