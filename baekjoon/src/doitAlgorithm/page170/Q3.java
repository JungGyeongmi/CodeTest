package doitAlgorithm.page170;

import java.io.IOException;

public class Q3 {
    
    public static void main(String[] args) throws IOException {

        int[] arr = {30, 20, 21, 33, 55};

        getArrayGCD(arr);

    }
    
    static int EuclidGCD(int x, int y) {
        while(y != 0) {
            int originX = x;
            x = y;
            y = originX % y;
        }
        return x;
    }

    static void getArrayGCD(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                int gcd = EuclidGCD(arr[i], arr[j]);
                System.out.println(arr[i] + "과 " + arr[j] +"의 최대공배수" + gcd);
            }
        }
    }
}
