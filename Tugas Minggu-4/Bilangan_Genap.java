package tugasminggu4;

/**
 * NAMA : AMALIA SISKA KURNIAWATI
 * NIM  : E41201005
 * GOL  : A - BONDOWOSO
 */

import java.util.Scanner;
    public class Bilangan_Genap {
        
        public static void main(String[] args) {
        System.out.println(" Menampilkan Bilangan Genap dari Kecil ke Besar ");
        System.out.println("================================================");
        
        // Memasukkan Batas Bilangan
        Scanner batas = new Scanner(System.in);
        System.out.print("Masukkan batas awal bilangan : ");
        int batasawal = batas.nextInt();
        System.out.print("Masukkan batas akhir bilangan : ");
        int batasakhir = batas.nextInt();
        
        // Hasil Output Bilangan genap
        System.out.print("Deretan bilangan genap : ");
        for (int i = batasawal; i <= batasakhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
