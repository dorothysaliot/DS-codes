/**
 * Saliot,Regine Joy Dorothy L.
 * BS IT 2IT
 * -bubble sort
 */

public class BubbleSort {  

    //driver method
    public static void main(String[] args) {  
        int myArray[] ={45,35,25,55,65};  
         
        System.out.println("Before Bubble Sort");  
        for(int i=0; i < myArray.length; i++){  
                System.out.print(myArray[i] + " ");  
        }  
        System.out.println();  
          
        bubbleSort(myArray);
         
        System.out.println("After Bubble Sort");  
        for(int i=0; i < myArray.length; i++){  
                System.out.print(myArray[i] + " ");  
        }  

} 

    static void bubbleSort(int[] myArray) {  
        int n = myArray.length;  
        int temp = 0;  
        int flag;
         for(int i=0; i < n; i++){  
             flag =0;
                 for(int j=1; j < (n-i); j++){  
                          if(myArray[j-1] > myArray[j]){  
                               
                                 temp = myArray[j-1];  
                                 myArray[j-1] = myArray[j];  
                                 myArray[j] = temp;  
                                 flag =1;
                         }  
                          
                 }  
                 if(flag == 0){
                    break;
         }  
        
         }
    }  
   
}  