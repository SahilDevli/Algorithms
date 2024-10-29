import java.util.*;

class sort{
    // ..... BUBBLE SORT ......
    public void bubble(int[] a){
        for(int i = 0 ; i < a.length-1 ; i++){
            for(int j = i+1 ; j < a.length ; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("\nSorten array after bubble sort : ");
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(" "+a[i]);
        }
    }

    //..... SELECTION SORT .....
    public void selection(int[] a){
        for(int i = 0 ; i < a.length ; i++){
            int minVal = i;
            for(int j = i ; j < a.length ; j++){
                if(a[minVal] > a[j]){
                    minVal = j;
                }
            }
            int temp = a[minVal];
            a[minVal] = a[i];
            a[i] = temp;
        }
        System.out.print("\nSorten array after Selection sort : ");
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(" "+a[i]);
        }
    }
    

    // ....... INSERTION SORT ........
    public void insertion(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int popVal = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > popVal) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = popVal;
        }
        System.out.print("\nSorted array after Insertion sort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }
}

public class BSIsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter array size : ");
        int size = sc.nextInt();
        int[] a = new int[size];

        for(int i = 0 ; i < size ; i++){
            a[i] = size-i;
        }
        // array....
        System.out.print("\nBefore Sorting : ");
        for(int i = 0 ; i < size ; i++){
            System.out.print(" "+a[i]);
        }
        
        sort Sort = new sort();


        // appling sorting....

        // Sort.bubble(a);
        // Sort.selection(a);
        Sort.insertion(a);

        sc.close();
    }
}
