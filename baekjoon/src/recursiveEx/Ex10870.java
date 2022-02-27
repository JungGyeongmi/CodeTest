package recursiveEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10870 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int result = getFibonacciNumber(N);

        System.out.println(result);
    }

    public static int getFibonacciNumber(int n){

        if(n<2){
            return n;
        } else {
            // System.out.println(n);
            // System.out.println("n-2 "+getFibonacciNumber(n-2));
            // System.out.println("n-1 "+getFibonacciNumber(n-1));
            return getFibonacciNumber(n-2)+getFibonacciNumber(n-1);
        }
    }
}
