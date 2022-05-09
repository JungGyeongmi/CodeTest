package codeTestColl.recursion;

import static java.lang.Math.ceil;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThueMorseString {
    
    static long k, n;
    static int[] xArray;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        k = Long.parseLong(br.readLine());
        n = getRepeatCount(k);

        xArray = new int[(int)pow(2, n-1)];

        thueMorse(1);
    }

    static void thueMorse(long cnt) {

        int idx = (int)pow(2, cnt-1);
        
        if(cnt == 1) {
            xArray[0] = 1;
        }

        if(cnt == n) {
            System.out.println("____ result ___");
            if( xArray[(int)k-1] == 1) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
            return;
        }

        int[] xCloneArray = xArray.clone();
        for(int i = 0; i < xCloneArray.length; i++) {
            xCloneArray[i] = xArray[i]*(-1);
        }

        for(int i = 0, j = idx; i < idx; i++, j++) {
            xArray[j] = xCloneArray[i];
        }

        thueMorse(cnt+1);
        
        return;
    }

    static long getRepeatCount(long k) {
        long n = 0;
        
        if(k % 2 == 0) {
            n = (int)(sqrt(k))+1;
            if((int)pow(2, n) != k) {
                n++;
            }
        } else { 
            k = k-1;
            n = (int)ceil(sqrt(k))+1;
        }

        
        return n;
    }

}
