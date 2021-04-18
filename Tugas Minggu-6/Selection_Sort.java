package tugasminggu6;

/**
 * NAMA : AMALIA SISKA KURNIAWATI
 * NIM  : E41201005
 * GOL  : A - BONDOWOSO
 */

public class Selection_Sort {
    static void selectionSort(int[] arr)
    {
        int n = arr.length;
        int tukar = 0;
        
        for(int i = 0; i < n; i++){   
            int min = i;
            for(int j = i + 1; j < n; j++){
                 if(arr[j] > arr[min]){
                     min = j;
                 }
            }
            int temp = arr [min];
            arr[min] = arr [i];
            arr[i] = temp;
            tukar++ ;
        }
            
        tampilkan(arr);
        System.out.println();
        System.out.println("Mengalami " + tukar + "x penukaran");
    }
    
    static void tampilkan(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n; ++i) {
            System.out.print(arr[i] + " ") ;
       }
        System.out.println() ;
    }
              
    public static void main (String [] args){
        int arr[] ={7, 4, 5, 9, 8, 2, 1 };
        System.out.println("Array Sebelum Selection Sort");
        tampilkan (arr);  
        System.out.println();
        System.out.println("Array Sesudah Selection Sort");
        selectionSort (arr) ;
        }
    }