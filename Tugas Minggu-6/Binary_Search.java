package tugasminggu6;

 /**
 * NAMA : AMALIA SISKA KURNIAWATI
 * NIM  : E41201005
 * GOL  : A - BONDOWOSO
 */

public class Binary_Search {
    public static void main(String[] args) {
        int angka[] = {3,9,11,12,15,17,20,23,31,35};//deret angka yang sudah terurut
        int kunci = 17 ;//key atau kunci yang akan di cari
        int index = angka.length /2;
        boolean ketemu = false;
        int tengah = index;

        while (index >= 0 && index < angka.length && ketemu == false) {
            if (kunci == angka[index]) {
                System.out.println("Data ditemukan pada index ke-" + index);
                ketemu = true;
            } else {
                if (kunci < angka[tengah]) {
                    index--;
                } else {
                    index++;
                }
            }
        }
        if (ketemu == false) {
            System.out.println("Data tidak ditemukan");
        }
    }
}