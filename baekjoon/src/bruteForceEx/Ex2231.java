package bruteForceEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 1; i<N; i++){
            if(N == getConstructorNumber(i)){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);

        br.close();

    }

    public static int getConstructorNumber(int number){
        int result = number;
        int num = number;
        for(int i = 0; i < Integer.toString(number).length(); i++) {
            result += num%10;
            num/=10;
        }
        return result;
    }
}
