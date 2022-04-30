package codeTestColl.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CantorSet2 {
    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = 0;
        String input = "";

        while((input = br.readLine()) != null ) {

            n = Integer.parseInt(input);

            cnatorFunction(n);

            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    private static void cnatorFunction(int n) {

        if(n == 0) {
            sb.append("-");
            return;
        }

        cnatorFunction(n - 1);

        for( int i = 0; i < Math.pow(3, n-1); i++) {
            sb.append(" ");
        }

        cnatorFunction(n - 1);

        return;
    }
}
