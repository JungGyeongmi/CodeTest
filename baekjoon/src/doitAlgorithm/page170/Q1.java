package doitAlgorithm.page170;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        int result = factorialFunction(n);
        System.out.println("반환값 : "+result);
    }
    
    static int factorialFunction(int n ) {
        int result = 1;
        
        while(n>0) {
            System.out.println("초기 값 n " + n);
            System.out.println("초기 값 result " + result);
            result *= n;
            n = n-1;
            System.out.println("다음 n 값 " + n);
        }
        
        return result;
    }
}
