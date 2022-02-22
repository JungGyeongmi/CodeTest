package basicMathEx2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1085 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
    
        int result = w-x>x?x:w-x>(h-y>y?y:h-y)?h-y>y?y:h-y:w-x>x?x:w-x;


        // int minX = w-x>x?x:w-x;
        // int minY = h-y>y?y:h-y;

        // System.out.println(minX>minY?minY:minX);
        System.out.println(result);
    }
}
