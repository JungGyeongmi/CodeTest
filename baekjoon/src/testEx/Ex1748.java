package testEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1748 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int rangeN = Integer.toString(N).length();
        /*
            rangeN-1;
            N*(N%rangeN);
        */
        int sum = 0;
        for(int i = 1; i<=N; i++){
            sum += Integer.toString(i).length();
        }
        
        System.out.println(sum);
        
    }
}
