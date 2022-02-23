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

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TN = Integer.parseInt(br.readLine());
        int controll = 0;
        while(controll<TN){

            int inputEvenNumber = Integer.parseInt(br.readLine());
            List<Integer> numberList = new ArrayList<>();
            boolean checker = false;
    
    
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
            // for(int i : arr) {
            //     System.out.println(i);
            // }
            
    
            int min = 1000;
            int[] result = new int[2];
            for(int i = 0; i < arr.length; i++) {
                for(int j = i; j <arr.length-i; j++){
                    if(inputEvenNumber == arr[i]+arr[j]) {
                        if(min > arr[i]-arr[j]){
                            
                            min = arr[j]-arr[i];
                            
                            result[0] = arr[i];
                            result[1] = arr[j];
                        }
                    }
                }
                
            }
            
            System.out.println(result[0]+" "+result[1]);
            
            controll++;
        }


        // int[] n = (int[])x.toArray(int[x.size()]);

      


        // int[] resultSumArr = new int [arr.length];
        // HashMap<Integer, String> hm = new HashMap<>();

        // int[] min = new int [arr.length];
        // int idx = 0;




        // for(int i=0; i<arr.length; i++){

        //     for(int j =0; j<arr.length; j++){

        //         if(arr[i]+arr[j] == inputEvenNumber){
        //             // resultSumArr[idx] = arr[i]+arr[j]; // map으로 변환해서 값 두개 받기
                   
        //             if(!hm.containsKey(arr[i]-arr[j])){
        //                 hm.put(Math.abs(arr[i]-arr[j]), arr[i]+" "+arr[j]);
        //             }
        //             // min[idx] = Math.abs(arr[i]-arr[j]);
        //             // idx++;
        //             // System.out.printf("%d와%d%n", arr[i], arr[j]);
        //         }
        //     }
        // }

       
        


        // for(int i = 0; i< resultSumArr.length; i++) {
        //     System.out.println(resultSumArr[i] +" "+ min[i]);
        // }



        br.close();

    }
}
