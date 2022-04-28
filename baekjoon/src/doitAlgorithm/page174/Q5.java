package doitAlgorithm.page174;

public class Q5 {
    public static void main(String[] args) {
        recur3(3);
    }

    static void recur3(int n) {
        if(n > 0) {
            recur3(n-1);  // 2 -> 2 // 1 -> 1
            recur3(n-2); //    // 0 -> X
            System.out.println(n);
            System.out.println("--------");
        }
    }
}
