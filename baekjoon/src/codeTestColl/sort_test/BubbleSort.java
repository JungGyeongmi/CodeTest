package codeTestColl.sort_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BubbleSort {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine());
        
        br.close();
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int countingrepeat = 0;
        for (int j = 0; j < arr.length; j++) {
            boolean breaker = true;
            
            for (int i = 0; i < arr.length - 1; i++) {
                
                if (arr[i] > arr[i+1]) {
                    // 교환하기
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    count++;
                    breaker = false;
                }
            }
            countingrepeat++;

            if(breaker) {
                break;
            }
        }

        System.out.println(count);
        System.out.println(countingrepeat);
    }
}

class BubbleCompare implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return 1;
        } else if (o1 > o2) {
            return -1;
        }
        return 0;
    }

}