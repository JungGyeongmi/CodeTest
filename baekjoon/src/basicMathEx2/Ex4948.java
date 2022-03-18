package basicMathEx2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex4948 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        do {
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            int result = 0;
            boolean checker = true;
    
            for(int i = n; i<2*n; i++){
                checker = true;
                for(int j=1; j<=i; j++){    
                    if(i%j==0 && j!=1 && j!=i) {
                        checker = false;
                    }
                    if(!checker){
                        break;
                    }
                }
                if(checker) {
                    result++;
                }
            }

            // bw.write(result);
            // System.out.println(result);
        } while(true);

        br.close();
        
        // bw.flush();
        // bw.close();
    }
    
}
