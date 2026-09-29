import java.util.Scanner;

public class C4 {
    static final String TOKO = "Toko Belajar Java";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama depan: ");
        String firstName = sc.nextLine();
        System.out.print("Nama belakang: ");
        String lastName = sc.nextLine();
        System.out.print("Nama barang: ");
        String namaBarang = sc.nextLine();
        System.out.print("Harga satuan: ");
        double hargaSatuan = sc.nextDouble();
        System.out.print("Jumlah: ");
        int jumlah = sc.nextInt();

        String fullName = firstName + " " + lastName;
        double subtotal = hargaSatuan * jumlah;

        System.out.println();
        System.out.println("Nama toko : " + TOKO);
        System.out.println("Pembeli   : " + fullName);
        System.out.println("Barang    : " + namaBarang);
        System.out.println("Harga     : " + hargaSatuan + " | Jumlah: " + jumlah);
        System.out.println("Subtotal  : " + subtotal);

        sc.close();
    }
}