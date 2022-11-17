import java.util.*;
class GFG {
 
    // Function to find the NGE
    static void printNGE(int[] A, int n)
    {
        // Формирование кольцевого массива
        int[] arr = new int[2 * n];
        // Добавить данный элемент массива дважды
     for (int i = 0; i < 2 * n; i++)
            arr[i] = A[i % n];
        int next;
        //Выполнение итерации для всех элементов массива
        for (int i = 0; i < n; i++) {
            // Initialise NGE as -1
            next = -1;
            for (int j = i + 1; j < 2 * n; j++) {
                // Проверка наличия следующего большего элемента
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            // Print the updated NGE
            System.out.print(next + ", ");
        }
    }
 
    // Driver Code
    public static void main(String args[])
    {
        // Заданный массив arr[]
        int[] arr = { 1, 2, 1 };
        int N = arr.length;
        // Function call
        printNGE(arr, N);
    }
}
