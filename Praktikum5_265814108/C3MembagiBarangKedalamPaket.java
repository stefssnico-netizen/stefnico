import java.util.Scanner;

public class C3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah barang: ");
        int jumlahBarang = sc.nextInt();
        System.out.print("Kapasitas paket: ");
        int kapasitasPaket = sc.nextInt();

        int paketPenuh = jumlahBarang / kapasitasPaket;
        int sisa = jumlahBarang % kapasitasPaket;

        System.out.println("Jumlah paket penuh = " + paketPenuh);
        System.out.println("Sisa barang = " + sisa);

        sc.close();
    }
}