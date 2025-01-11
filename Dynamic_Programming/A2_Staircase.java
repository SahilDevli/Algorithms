/*  
note: Starircase problem is base in DP in this problem you have to out number of ways
that can be used to climb 'n' number of stairs if you can take either '1' or '2' step
at one time. 

ex: number of stairs = 3
    number of ways = 3
    i.e. 1. 1,1,1
         2. 2,1
         3. 1,2
*/

import java.util.*;

public class A2_Staircase{
    static int countWays(int n){
            // Base cases
            if(n==0){ // No stairs to climb
                return 1;
            }
            if(n < 0){ // Negative stairs (invalid)
                return 0;
            }
            // Recursive calls: ways to reach from (n-1) and (n-2) stairs
            return countWays(n - 1) + countWays(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of stairs: ");
        int number_of_stairs = sc.nextInt();
        
        int ways=countWays(number_of_stairs);
        System.out.println(ways);

        sc.close();
    }
}