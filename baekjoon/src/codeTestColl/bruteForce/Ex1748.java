package codeTestColl.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int rangeN = Integer.toString(N).length()-1;

        System.out.println(D2(N, rangeN)+(D(rangeN)));
        

    }
    public static int D2(int N, int rangeN){
        int sum=0;
        int i = (int)Math.pow(10, rangeN);
        for(; i<=N; i++){
            sum += Integer.toString(i).length();
        }
        return sum;
    }

    public static int D(int N) {
        if (N == 0) {
            return 0;
        } else if (N > 0) {
            return ((int)((Math.pow(10, N))-Math.pow(10, (N-1)))*N)+D(N-1);
        }
        return 0;
    }
}
