import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Height : ");
        double height = x.nextDouble();

        Scanner y = new Scanner(System.in);
        System.out.print("Width  : ");
        double width = y.nextDouble();

        double perimeter = 2.54*((width*2) + (height*2));
        System.out.printf("\n"+"%,.2f", perimeter);
        System.out.print(" centimeters.");
    }
}