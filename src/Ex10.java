import java.util.Scanner;
import java.util.Locale;
public class Ex10 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Fahrenheit : ");
        double far = x.nextDouble();

        double cel = (far-32)/1.8;
        double kel = cel + 273.15;
        System.out.printf("\nCelsius : " + "%,.2f", cel);
        System.out.printf("\nKelvin  : " + "%,.2f", kel);
    }
}
