import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        double tot;
        Scanner x = new Scanner(System.in);
        System.out.print("Salary  : ");
        double sal = x.nextDouble();
        double pay = sal/24;
        tot = pay;

        Scanner y = new Scanner(System.in);
        System.out.print("401(k)  : ");
        double four = y.nextDouble();
        tot = tot * (1-(four/100));

        Scanner z = new Scanner(System.in);
        System.out.print("Federal : ");
        double fed = z.nextDouble();

        Scanner a = new Scanner(System.in);
        System.out.print("State   : ");
        double sta = a.nextDouble();
        tot = tot * (1-((fed+sta)/100));

        System.out.printf("\n" + "$%,.2f", tot);
        System.out.print(".");
    }
}
