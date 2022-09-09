/**
 * Saliot, Regine Joy Dorothy L.
 * BS IT 2IT
 * -insertion sort
 */
public class InsertionSort {  

    //driver method
    public static void main(String a[]){    
        int[] myArray = {45,35,25,55,65};    
        System.out.println("Before Insertion Sort: ");    
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i] + " ");
        }
   
        insertionSort(myArray);  
           
        System.out.println("\nAfter Insertion Sort");    
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i] + " ");
        }
    }   

    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
 
}    