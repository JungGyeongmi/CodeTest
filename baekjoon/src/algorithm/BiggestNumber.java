package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BiggestNumber {
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
        
        int count  = countNumber(n);
 
        for(int i = n+1; i<1000000; i++) {
            if(count == countNumber(i)) {
                answer = i;
                break;
            }
        }
 
        return answer;
    }
 
    private int countNumber (int number) {
        String[] binaryNumberStrArray = Integer.toBinaryString(number).split("");
        int count = 0;
        for(int i = 0; i < binaryNumberStrArray.length; i++) {
            if(binaryNumberStrArray[i].equals("1")){
                count++;
            }
        }
        return count;
    }
}