import java.util.*;

class Search {

    //Linear Search Algorithm...
    public int linearSearch(int[] A, int val) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == val)
                return i;
        }
        return -1;
    }

}

public class linearSearch{
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
