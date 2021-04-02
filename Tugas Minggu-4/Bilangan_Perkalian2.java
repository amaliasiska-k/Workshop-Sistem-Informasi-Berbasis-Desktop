package tugasminggu4;

/**
 * NAMA  : AMALIA SISKA KURNIAWATI
 * NIM   : E41201005
 * GOL   : A - BONDOWOSO
 */

public class Bilangan_Perkalian2 {
    
    public static void main(String[] args) {
        System.out.println("Bilangan perkalian 2 ( 0 - 100 )");
        System.out.println("================================");
        int a = 0;
        do {
            if(a == 0) {
                a = 1;
            } else {
                System.out.print(a * 2 + " ");
            }
            a++;
        } while(a <= 100);
    }
}
