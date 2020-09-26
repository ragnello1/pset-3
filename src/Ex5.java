import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Homework 1 : ");
        double hw1 = x.nextDouble();

        Scanner y = new Scanner(System.in);
        System.out.print("Homework 2 : ");
        double hw2 = y.nextDouble();

        Scanner z = new Scanner(System.in);
        System.out.print("Homework 3 : ");
        double hw3 = z.nextDouble();

        Scanner a = new Scanner(System.in);
        System.out.print("Quiz 1     : ");
        double qz1 = a.nextDouble();

        Scanner b = new Scanner(System.in);
        System.out.print("Quiz 2     : ");
        double qz2 = b.nextDouble();

        Scanner c = new Scanner(System.in);
        System.out.print("Test 1     : ");
        double ts1 = c.nextDouble();

        double hwavg =((hw1+hw2+hw3)/3)*0.15;
        double qzavg =((qz1+qz2)/2)*0.35;
        double tsavg = (ts1)*0.5;
        double total = hwavg + qzavg + tsavg;
        System.out.printf("\n" + "%,.2f%%", total);
        System.out.print(".");
    }
}
