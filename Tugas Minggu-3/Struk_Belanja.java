package tugasminggu3;
/**
 * NAMA : AMALIA SISKA KURNIAWATI
 * NIM  : E41201005 
 */
import java.util.Scanner;
    public class Struk_Belanja {
        public static void main(String[] args) {
        Scanner belanja = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("          Kharisma Agung Plaza < KAP >");
        System.out.println("            Promo Belanja Berhadiah");
        System.out.println("        Khusus Pembelian 5 Barang Pertama");
        System.out.println("         Dengan harga minimum Rp 10000,00");
        System.out.println("---------------------------------------------");
        //nama pembeli
        System.out.print("Masukkan nama pembeli : ");
        String nama = belanja.nextLine();
        System.out.println();
        //harga barang
        System.out.print("Masukkan harga barang ke-1    : ");
        int harga1 = belanja.nextInt();
        System.out.print("Masukkan harga barang ke-2    : ");
        int harga2 = belanja.nextInt();
        System.out.print("Masukkan harga barang ke-3    : ");
        int harga3 = belanja.nextInt();
        System.out.print("Masukkan harga barang ke-4    : ");
        int harga4 = belanja.nextInt();
        System.out.print("Masukkan harga barang ke-5    : ");
        int harga5 = belanja.nextInt();
        //total
        int total = harga1 + harga2 + harga3 + harga4 + harga5;
        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp " + total);
        System.out.println();
        System.out.println("Selamat....");
        System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("               Terima Kasih");
        System.out.println("  Anda sudah belanja di Kharisma Agung Plaza");
    }
}