package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BiggestNumber2 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
    
        Solution sl = new Solution();
        
        sl.solution(n);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int count  = Integer.bitCount(n);

        for(int i = n+1; i<1000000; i++) {
            if(count == Integer.bitCount(i)) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}