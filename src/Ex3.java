import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Height : ");
        double height = x.nextDouble();

        Scanner y = new Scanner(System.in);
        System.out.print("Width  : ");
        double width = y.nextDouble();

        double volume = (width * 25.4) * (height * 25.4);
        System.out.printf("\n"+"%,.2f", volume);
        System.out.print(" square millimeters.");
    }
}
