package tugasminggu6;

/**
 * NAMA : AMALIA SISKA KURNIAWATI
 * NIM  : E41201005
 * GOL  : A - BONDOWOSO
 */

public class Sequential_Search {
    public static void main(String[] args) {
    int[] exampleVariableOne = {2, 9, 6, 7, 4, 5, 3, 0, 1};
    int target = 4;
    sequentialSearch(exampleVariableOne, target);
    }
    
    public static void sequentialSearch (int[] parameterOne, int parameterTwo) {
        int index = -1;
        // mencari setiap indeks dari array hingga mencapai indeks terakhir
    for (int i = 0; i < parameterOne.length; i++ ) {
        if (parameterOne [i] == parameterTwo) {
       // jika target ditemukan, int index diset sebagai nilai i dan 
       // loop for dihentikan
        index = i;
        break;
        }
    }
    if (index == -1) {
        System.out.println("Data tidak ditemukan");
    } else {
        System.out.println("Data ditemukan pada index ke-" + index);
        }
    }
}