package tugasminggu3;
/**
 * NAMA : AMALIA SISKA KURNIAWATI
 * NIM  : E41201005
 */
import java.util.Scanner;
    public class Switch_Case {
        public static void main(String[] args) {
        Scanner beliminum = new Scanner(System.in);

        System.out.println("       CAFE CERIA");
        System.out.println("     ANEKA MINUMAN");
        System.out.println("-----------------------");
        //data minuman
        System.out.println("     SPECIAL MENU");
        System.out.println("    1. Soft drinks");
        System.out.println("    2. Mix juice");
        System.out.println("    3. Nescafe");
        System.out.println("    4. Soda milk");
        System.out.println("    5. Tea");
        System.out.println("------------------------");

        //nama pembeli
        System.out.print("Masukkan nama pembeli : ");
        String nama = beliminum.nextLine();
        System.out.println("");

        //pilih minuman
        System.out.print("Silahkan masukkan pilihan anda : ");
        int minuman = beliminum.nextInt();

        //switch case minuman
        switch (minuman) {
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Tidak ada data minuman");
        }
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima kasih " + nama + " telah berkunjung diCafe Ceria");
    }
}
  
