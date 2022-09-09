/**
 * Saliot, Regine Joy Dorothy L.
 * BS IT 2IT 
 * -selection sort
 */
public class SelectionSort { 

    //driver method
    public static void main(String a[]){  
        int[] myArray = {45, 35, 25, 55,65};  
        System.out.println("Before Selection Sort");  
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i] + " ");
        } 
        System.out.println();  
          
        selectionSort(myArray);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i] + " ");
        }
    }  


    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int min = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[min]){  
                    min = j;
                }  
            }  
            int smallerNumber = arr[min];   
            arr[min] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
   
}  