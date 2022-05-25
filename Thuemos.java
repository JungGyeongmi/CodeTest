import static java.lang.Math.ceil;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thuemos {
    
    static long k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        k = Long.parseLong(br.readLine());

        

    }

    static String thueMorse(long cnt, String str) {
        
        if(cnt == 1) {
            return "0";
        }

        if(cnt >= k) {
            return str.substring((int)(k), (int)(k)+1);
        }

        return thueMorse(cnt+1, str);
    }
}