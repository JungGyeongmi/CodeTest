package bruteForceEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex2798 {
    public static void main(String[] args) throws IOException {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫 번째 줄
        StringTokenizer st = new StringTokenizer(br.readLine());
        int tn = Integer.parseInt(st.nextToken());
        int maxNumber = Integer.parseInt(st.nextToken());
        // 두 번째 줄
        st = new StringTokenizer(br.readLine());
        int[] cardArray = new int[tn];
        for(int i = 0; i<tn; i++){
            cardArray[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < cardArray.length; i++){
            for(int j = i+1; j < cardArray.length-i; j++){
                System.out.println(cardArray[i]+" "+cardArray[j]+" "+cardArray[j+1]);
            }
        }


    }
}
