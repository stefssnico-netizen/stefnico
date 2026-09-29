import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan a: ");
        int a = sc.nextInt();
        System.out.print("Masukkan b: ");
        int b = sc.nextInt();

        System.out.println("a + b       = " + (a + b));
        System.out.println("a - b       = " + (a - b));
        System.out.println("a * b       = " + (a * b));
        System.out.println("a / b       = " + (a / b));
        System.out.println("a * 1.0 / b = " + (a * 1.0 / b));
        System.out.println("a % b       = " + (a % b));

        sc.close();
    }
}