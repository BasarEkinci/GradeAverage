package NumberComparison;
import java.util.Scanner;

public class NumberComparison {

    public static double Smallest(double a,double b,double c){
        return Math.min(Math.min(a, b),c);
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 number : ");
        
        System.out.print("First  : ");
        double a = input.nextDouble();
        
        System.out.print("Second : ");
        double b = input.nextDouble();

        System.out.print("Third  : ");
        double c = input.nextDouble();

        System.out.println("Smallest number : " + Smallest(a, b, c));

        input.close();

    }
}
