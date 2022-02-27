package recursiveEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        int result = factorial(N);
        
        System.out.println(result);
    }

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}