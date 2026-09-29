import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double total = a + b + c;
        double rata = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Rata-rata = " + rata);

        sc.close();
    }
}