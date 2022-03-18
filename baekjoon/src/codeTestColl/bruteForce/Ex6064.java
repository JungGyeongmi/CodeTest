package codeTestColl.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex6064 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int range = Integer.parseInt(br.readLine());

        for (int i = 0; i < range; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M, N, x, y = 0;
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            int years = 1;
            x = M==x?0:x;
            y = N==x?0:x;

            while (true){
                if(years  % M == x && years % N == y) {
                    System.out.println(years);
                    break;
                }
                if((years % M == 0 && years % N == 0)){
                    System.out.println("-1");
                    break;
                }
                years++;
            }
        }
        br.close();
    }
}