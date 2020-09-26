import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Students : ");
        double stu = x.nextDouble();

        Scanner y = new Scanner(System.in);
        System.out.print("Teachers : ");
        double tea = y.nextDouble();

        double tot = stu+tea;

        Scanner z = new Scanner(System.in);
        System.out.print("Capacity : ");
        double cap = z.nextDouble();

        int bus = (int) ((tot + (cap-1))/cap);
        int rem = (int) (tot % cap);

        System.out.println("\nBusses required     : " + bus);
        System.out.println("Overflow passengers : " + rem);
    }
}
