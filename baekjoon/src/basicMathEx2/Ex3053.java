package basicMathEx2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3053 {

    public static void main(String[] args) throws IOException{
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int radius = Integer.parseInt(br.readLine());
        

        System.out.printf("%.6f%n%.6f",Math.PI*Math.pow(radius, 2), 2*Math.pow(radius, 2));

    }
}
