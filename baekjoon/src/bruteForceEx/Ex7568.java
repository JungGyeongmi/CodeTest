package bruteForceEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex7568 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int TOTAL = Integer.parseInt(br.readLine());
        HashMap<Integer, int[]> hm = new HashMap<>();

        // 초기화
        for(int i = 0; i<TOTAL; i++){
            st = new StringTokenizer(br.readLine());
            hm.put(i, new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }
        // System.out.println(hm.get(0)[0]);

        for(int i = 0; i <TOTAL; i++) {
            int k = 1;
            for(int j = 0; j<TOTAL; j++){
                if(hm.get(i)[0] < hm.get(j)[0] && hm.get(i)[1] < hm.get(j)[1]){
                  k++;  
                }
            }
            System.out.print(k+" ");
        }
    }
}
