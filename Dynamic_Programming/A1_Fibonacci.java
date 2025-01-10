class Fibonacci{
    void fibo_by_recursion(int previous, int present, int destination) {
        if (previous == 0) {
            System.out.print(previous + ", " + present);
        }
        int next = previous + present;
        if (next <= destination) {
            System.out.print(", " + next);
            fibo_by_recursion(present, next, destination);
        }
    }
    

    void fibo_by_iteration(int destination){
        int previous = 0;
        int present = 1;
        System.out.print(previous + ", " + present);
        while((present+previous) <= destination){
            int next = previous + present;
            System.out.print(", "+next);
            previous = present;
            present = next;
        }
        return;
    }

}
public class A1_Fibonacci{
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.fibo_by_recursion(0, 1,40);
        System.out.println("");
        f.fibo_by_iteration(40);
    }
}