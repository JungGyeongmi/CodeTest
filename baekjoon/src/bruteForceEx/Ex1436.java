package bruteForceEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int i = 666;
        String compareNumber = Integer.toString(i);
        
        // System.out.println((IntStream.iterate(666, i->i+1).anyMatch(i-> i==666)));
        do {
            compareNumber = Integer.toString(i);
            if(compareNumber.contains("666")){
                count++;
            };
            i++;
        } while(N != count);
        System.out.println(compareNumber);
    }
}
