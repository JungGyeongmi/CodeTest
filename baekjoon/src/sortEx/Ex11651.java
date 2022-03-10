package sortEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Ex11651 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] inputIntArray = new int[N][2];
        StringTokenizer st = new StringTokenizer("");
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            inputIntArray[i][0] = Integer.parseInt(st.nextToken());
            inputIntArray[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(inputIntArray, new ComEx());

        for (int i = 0; i < N; i++) {
            System.out.println(inputIntArray[i][0] + " " + inputIntArray[i][1]);
        }

        br.close();
    }
}


class ComEx implements Comparator<int[]> {
    @Override
    public int compare(int[] ia1, int[] ia2) {
        if(ia1[1]!=ia2[1]){
            return ia1[1]-ia2[1];
        } else {
            return ia1[0]-ia2[0];
        }
    }
}