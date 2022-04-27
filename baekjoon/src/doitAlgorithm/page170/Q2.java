package doitAlgorithm.page170;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // int x = Integer.parseInt(br.readLine());
        // int y = Integer.parseInt(br.readLine());
        int x = 22;
        int y = 8;

        int result = EuclidGCD(x, y);
        System.out.println("반환값 : "+result);
    }
    
    static int EuclidGCD(int x, int y) {
        
        while(y != 0) {
            System.out.println("초기 값 y " + y);
            System.out.println("초기 값 x " + x);
            
            int originX = x;
            x = y;
            y = originX % y;

            System.out.println("다음 값 y (x % y = ) " + y);
            System.out.println("다음 값 x (y = ) " + x);
        }
       
        return x;
    }
}
