package codeTestColl.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1476 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        /*
         1 ≤ E ≤ 15
         1 ≤ S ≤ 28
         1 ≤ M ≤ 19
        */

        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int years = 1;
        
        while((years-E)%15!=0||(years-S)%28!=0||(years-M)%19!=0){
            years++;
            // System.out.println((years-E)%15);
            // System.out.println((years-S)%28);
            // System.out.println((years-M)%19);
        }
        
        System.out.println(years);


    }
}
