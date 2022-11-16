import java.util.*;
class GFG {
 
    // Function to find the NGE
    static void printNGE(int[] A, int n)
    {
        // Formation of circular array
        int[] arr = new int[2 * n];
        // Append the given array element twice
        for (int i = 0; i < 2 * n; i++)
            arr[i] = A[i % n];
        int next;
        // Iterate for all the elements of the array
        for (int i = 0; i < n; i++) {
            // Initialise NGE as -1
            next = -1;
            for (int j = i + 1; j < 2 * n; j++) {
                // Checking for next greater element
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
        // Given array arr[]
        int[] arr = { 1, 2, 1 };
        int N = arr.length;
        // Function call
        printNGE(arr, N);
    }
}
