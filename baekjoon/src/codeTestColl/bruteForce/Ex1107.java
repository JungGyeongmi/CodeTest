package codeTestColl.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Ex1107 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int targetNumber = Integer.parseInt(br.readLine());
        int brokenBtnCount = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        int[] brokenBtn = new int[brokenBtnCount];
        for(int i = 0; i<brokenBtnCount;) brokenBtn[i++] = Integer.parseInt(st.nextToken());

        List<Integer> remoteController = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        for(int i =0; i<brokenBtnCount;){
            remoteController.remove(Integer.valueOf(brokenBtn[i++]));
        }
        System.out.println(remoteController.toString());
    

        
    }

}
