package tugasminggu3;
/**
 * NAMA : AMALIA SISKA KURNIAWATI
 * NIM  : E41201005
 */
public class Array2dimensi {
      public static void main(String[] args) {
         int [][] nilai = {{5,6,1,7},{8,1,2,9},{5,4,7,1},{8,3,7,5}};
         for (int x=0; x<4;x++){
             for(int y=0; y<4; y++){
                 System.out.print(nilai[x][y]+" ");
             }
             System.out.println(" ");
         }
    }
}
