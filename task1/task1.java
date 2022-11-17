
// Java program to find min operation
import java.io.*;
 
class minOperation {
    // Function to print minimum operation required to make
    // все элементы массива равны
    static void printMinOp(int arr[])
    {
        int arraySum, smallest, arr_size = arr.length;
        arraySum = 0;
        smallest = arr[0];
        for (int i = 0; i < arr_size; i++) {
            // Если  текущий элемент меньше, чем самый маленький
            if (arr[i] < smallest)
                smallest = arr[i];
 
            // Найти сумму массива
            arraySum += arr[i];
        }
 
        int minOperation = arraySum - arr_size * smallest;
 
        // Print min operation required
        System.out.println("Minimum Operation = " + minOperation);
    }
 
    // Driver program to test above functions
    public static void main(String[] args)
    {
        int arr[] = { 5, 6, 2, 4, 3 };
        printMinOp(arr);
    }
}
