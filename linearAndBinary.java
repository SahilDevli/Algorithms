import java.util.*;

// class make to define functions for both searching algorithms...
class Search {
    //Linear Search Algorithm...
    public int linearSearch(int[] A, int val) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == val)
                return i;
        }
        return -1;
    }

    // Binary Search Algorithm...
    public int binarySearch(int[] A, int val) {
        Arrays.sort(A); // sorting is must for binary search Algorithm...
        int lb = 0;
        int ub = A.length - 1;
        while (lb <= ub) {
            int mid = lb + (ub - lb) / 2;
            if (A[mid] == val) {
                return mid;
            } else if (A[mid] < val) {
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }
        }
        return -1;
    }
    
}

public class linearAndBinary {
    public static void main(String[] args) {
        int[] A = new int[10];
        for (int i = 0; i < 10; i++) {
            A[i] = 10 - i;
        }

        System.out.print("Enter the value to search: ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        sc.close();

        Search ob = new Search();
        // int x = ob.linearSearch(A, val);
        int x = ob.binarySearch(A, val);
        
        // Check if the value was found
        if (x == -1) {
            System.out.println("Value not found in the array.");
        } else {
            System.out.println("Value found at index: " + x);
        }
    }
}
