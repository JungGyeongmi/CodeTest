package bruteForceEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
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

        List<Integer> resultArrayList = new ArrayList<>();

        for(int i = 0; i < cardArray.length-2; i++){
            for(int j = i+1; j < cardArray.length-1; j++){
                for(int k = j+1; k < cardArray.length; k++){
                    // System.out.println(i+" "+j+" "+k);
                    int sum = cardArray[i]+cardArray[j]+cardArray[k];
                    if(sum <= maxNumber) {
                        resultArrayList.add(sum);
                        // System.out.println(sum);
                    }
                }
            }
        }

        // 정렬
        Collections.sort(resultArrayList, Collections.reverseOrder());
        System.out.print(resultArrayList.get(0));
    }
}
