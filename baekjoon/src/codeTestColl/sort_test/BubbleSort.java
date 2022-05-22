package codeTestColl.sort_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BubbleSort {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        int sum = 0;
		for(int i=1; i<=1000000; i++){
			sum += i;
		}  
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

      

        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine());
        
        br.close();


		System.out.println("합계 : "+sum);

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
        long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
		System.out.println("프로그램 실행시간 : " + (end - start)/1000.0 +"초");
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