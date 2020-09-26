import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Wage      : ");
        double wage = x.nextDouble();

        Scanner y = new Scanner(System.in);
        System.out.print("Monday    : ");
        double mon = y.nextDouble();

        Scanner z = new Scanner(System.in);
        System.out.print("Tuesday   : ");
        double tue = z.nextDouble();

        Scanner a = new Scanner(System.in);
        System.out.print("Wednesday : ");
        double wed = a.nextDouble();

        Scanner b = new Scanner(System.in);
        System.out.print("Thursday  : ");
        double thu = b.nextDouble();

        Scanner c = new Scanner(System.in);
        System.out.print("Friday    : ");
        double fri = c.nextDouble();

        Scanner d = new Scanner(System.in);
        System.out.print("Saturday  : ");
        double sat = d.nextDouble();

        Scanner e = new Scanner(System.in);
        System.out.print("Sunday    : ");
        double sun = e.nextDouble();

        double pay = wage*(mon+tue+wed+thu+fri+sat+sun);
        System.out.printf("\n" + "$%,.2f", pay);
        System.out.print(".");
    }
}
