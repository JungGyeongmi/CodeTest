package basicMathEx2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.HashSet;
// import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Ex3009 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        for(int i = 0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            list.add(st.nextToken());
            list.add(st.nextToken());
        }

        // HashMap<String, Integer> hm = new HashMap<>();
        String temp = "";
        String temp2 = "";
        int idx = 0;
        String [] test = new String[3];
        for(int i = 0; i < 6; i+=2) {
            // System.out.println(list.get(i));
            test[idx] = list.get(i);
            idx++;
        }

        for(int i = 0; i<test.length; i++){
           
            for(int j = i+1; j<test.length; j++) {
                // System.out.println(i+" "+j);
                if(test[i].equals(test[j])){
                   temp = test[i];
                   System.out.println(temp);
                }
                if(!test[i].equals(test[j])){
                    temp2 = test[j];
                    System.out.println(temp2);
                 }
            }
        }


        // for(int i = 1; i < 6; i+=2) {
        //     System.out.println(list.get(i));          
        // }

        // equal일때 add해주고 counting해준다음에 hash에 저장하고 counting되어있지 않은 녀석을 뽑아줌?
        // 으으으으으!!!!!!!!!
    }
}
