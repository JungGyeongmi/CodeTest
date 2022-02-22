package basicMathEx2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4153 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        do{

            String[] input = br.readLine().split(" ");
    
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            
            if(a==0 && b==0 && c==0) break;
    
            if(Math.pow(a, 2)+Math.pow(b, 2) == Math.pow(c, 2)){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
            
        }while(true);
        
        br.close();

    }
}
