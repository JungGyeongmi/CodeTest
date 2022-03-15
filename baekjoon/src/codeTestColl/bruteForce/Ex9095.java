package codeTestColl.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex9095 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        D(N) = D(N-1)+D(N-2)+D(N-3)
        */
        int range = Integer.parseInt(br.readLine());
        for( int i = 0; i<range; i++){
            int N = Integer.parseInt(br.readLine());
            System.out.println(D(N));
        }


    }

    static int D(int N) {
        if(N==1) {
            return 1;
        } else if (N==2){
            return 2;
        } else if (N==3) {
            return 4;
        }
        return D(N-1)+D(N-2)+D(N-3);
    }
}
