package tugasminggu4;

/**
 * NAMA  : AMALIA SISKA KURNIAWATI
 * NIM   : E41201005
 * GOL   : A - BONDOWOSO
 */

public class Bilangan_Kelipatan {
    
    public static void main(String[] args) {
        int nilai = 1;
        System.out.println("         Do__While");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        do {
            System.out.print("  " + nilai);
            nilai = nilai * 2;
        } while (nilai < 100);
        System.out.println("");
    }
} 
