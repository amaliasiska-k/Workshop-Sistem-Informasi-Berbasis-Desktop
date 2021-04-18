package tugasminggu6;

/**
 * NAMA : AMALIA SISKA KURNIAWATI
 * NIM  : E41201005
 * GOL  : A - BONDOWOSO
 */

public class BubbleSort {
    static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        int temp = 0;
        int tukar = 0;
         for(int i=0; i < n; i++){         
            for(int j=1; j < (n-i); j++){
                 if(arr[j-1] > arr[j]){
                     //swap elements
                     temp = arr[j-1];
                     arr[j-1] = arr[j];
                     arr[j] = temp;
                     tukar++;
                 }
             }
         }
        tampilkan(arr);
        System.out.println();
        System.out.println("Melakukan " + tukar + "x penukaran");
    }
    
    static void tampilkan(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ") ;
       }
            System.out.println() ;
    }
              
    public static void main (String [] args){
        int arr[] ={3,60,35,2,45,320,5};
        System.out.println("Array Sebelum Bubble Sort");
        tampilkan (arr);  
        System.out.println();
        System.out.println("Array Sesudah Bubble Sort");
        bubbleSort (arr) ;
        }
    }