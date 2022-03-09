package sortEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        /*
         * 첫 산술평균(소수점 이하 첫째 자리에서 반올림)
         * 둘 중앙값
         * 셋 최빈값 다수일 경우 두 번째로 작은 값 (네?)
         * 넷 범위(최대값-최소값)
        */

        int[] arr = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] += Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int arithmeticMean = Math.round((float) sum / N * 10 / 10);
        System.out.println("산술평균 " + arithmeticMean);


        int middleIdx = (int)N/2;
        Arrays.sort(arr);
        System.out.println("중앙값 "+arr[middleIdx]);

        // int[] countNegativeInt = new int[N];
        // int[] countPositiveInt = new int[N];
        // for(int i = 0; i<N; i++) {
        //     if(arr[i]<0) {
        //         countNegativeInt[Math.abs(arr[i])]++;
        //     } else {
        //         countPositiveInt[arr[i]]++;
        //     }
        // }

        // int maxCountNegative = countNegativeInt[0];
        
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<N; i++){
           max = (max < arr[i])?arr[i]:max;
           min = (min > arr[i])?arr[i]:min;          
        }


        // System.out.println("최댓값" + max+" 최솟값" + min);
        System.out.println("범위" + (max-min));
        
    }
}
