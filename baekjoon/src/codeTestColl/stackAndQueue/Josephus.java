package codeTestColl.stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Josephus {
    public static void main(String[] args) throws IOException {
       
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Queue<Integer> deQue = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] josephusArr = new int[N];

        for (int i = 0; i < josephusArr.length; i++) {
            deQue.offer(i + 1);
        }
        
        sb.append("<");
        
        while (!deQue.isEmpty()){
            int repeatCount = K;
            
            while(repeatCount > deQue.size()) {
                repeatCount -= deQue.size();
            }
            
            while (repeatCount > 0) {

                int pollVal = deQue.poll();
    
                if (repeatCount != 1) {
                    deQue.offer(pollVal);
                }
                
                
                if(repeatCount == 1) {
                    if(deQue.size() != 0) {
                        sb.append(pollVal).append(", ");
                    } else {
                        sb.append(pollVal);
                    }
                }

                repeatCount--;
            }
            
        }

        sb.append(">");
        System.out.println(sb.toString());
    }
}
