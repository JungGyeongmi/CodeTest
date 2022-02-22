package basicMathEx2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
// import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Ex9020 {
    public static void main(String[] args) throws IOException {
        
        /*
         접근 1
         해당 n 의 범위 안에있는 소수를 출력한 후 
         그 수의 합이 해당 n이 되는 값을 추출해보기 --> 1차 완

         n은 짝수

         1-1 
         해당 수의 합이 12가 돼야함
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputEvenNumber = Integer.parseInt(br.readLine());
        boolean checker = false;
        List<Integer> numberList = new ArrayList<>();

        for(int i = 2; i < inputEvenNumber; i++){
           
            for(int j = 2; j<i; j++ ){

                if(i%j == 0 && j != i){
                    checker = false;
                    break;
                }
                checker = true;

            }
            if(checker)  {
                numberList.add(i);
            }

        }

        // int[] arr = new int[numberList.size()];
        int[] arr = numberList.stream().mapToInt(i -> i).toArray();

        // int[] n = (int[])x.toArray(int[x.size()]);

        // for(int i : arr) {
        //     System.out.println(i);
        // }


        // int[] resultSumArr = new int [arr.length];
        HashMap<Integer, String> hm = new HashMap<>();

        // int[] min = new int [arr.length];
        // int idx = 0;
        for(int i=0; i<arr.length; i++){

            for(int j =0; j<arr.length; j++){

                if(arr[i]+arr[j] == inputEvenNumber){
                    // resultSumArr[idx] = arr[i]+arr[j]; // map으로 변환해서 값 두개 받기
                   
                    if(!hm.containsKey(arr[i]-arr[j])){
                        hm.put(Math.abs(arr[i]-arr[j]), arr[i]+" "+arr[j]);
                    }
                    // min[idx] = Math.abs(arr[i]-arr[j]);
                    // idx++;
                    // System.out.printf("%d와%d%n", arr[i], arr[j]);
                }
            }
        }

            hm.forEach((i, j)->{
                System.out.println(i + " " + j); // 제일 첫 번째 것만 받고싶음
            });



        // for(int i = 0; i< resultSumArr.length; i++) {
        //     System.out.println(resultSumArr[i] +" "+ min[i]);
        // }



        br.close();

    }
}
