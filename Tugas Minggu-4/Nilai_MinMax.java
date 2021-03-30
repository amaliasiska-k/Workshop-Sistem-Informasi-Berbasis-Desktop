package tugasminggu4;

/**
 * NAMA  : AMALIA SISKA KURNIAWATI
 * NIM   : E41201005
 * GOL   : A - BONDOWOSO
 */

 import java.util.Scanner;
    public class Nilai_MinMax {
    
    public static void main(String[] args) {
    System.out.println(" Menampilkan Nilai Minimum, Nilai Maksimum dan Rata - Rata ");
    System.out.println("===========================================================");
    
        // Membuat Variable
        int nilai[], banyakdata, rata_rata;
        int total = 0;
        Scanner data = new Scanner(System.in);
        System.out.print("Masukkan banyaknya data nilai = ");
        banyakdata = data.nextInt();
        nilai = new int[banyakdata];
        
        for (int a = 0; a < banyakdata; a++) {
            System.out.print("Masukkan data nilai ke-" + (a + 1) + " = ");
            nilai[a] = data.nextInt();
            total += nilai[a];
        }
        // Membuat Variable Minimum dan Maksimum
        int max = nilai[0];
        int min = nilai[0];

        // Mencari Nilai Maksimum
        for (int b = 0; b < banyakdata; b++) {
            if (nilai[b] > max) {
                max = nilai[b];
            }
        }
        // Mencari Nilai Minimum
        for (int c = 0; c < banyakdata; c++) {
            if (nilai[c] < min) {
                min = nilai[c];
            }
        }
        // Rumus Mencari Nilai Rata - Rata
        rata_rata = total / banyakdata;
        System.out.println("");
        // Menampilkan Nilai Maksimum, Minimum dan Rata - Rata
        System.out.println("Nilai minimum = " + min);
        System.out.println("Nilai maksimum = " + max);
        System.out.println("Nilai rata ratanya adalah = " + rata_rata);
    }
}

