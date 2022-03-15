package sortEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Ex1427 {
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tempArray = br.readLine().split("");
        Integer[] intArray = new Integer [tempArray.length];
        // System.out.println(intArray.length);
        int i = 0;
        for(String test : tempArray) intArray[i++] = Integer.parseInt(test);
        Arrays.sort(intArray, Collections.reverseOrder());

        // for(int result : intArray) bw.write(Integer.toString(result)); 

        br.close();
        bw.flush();
        bw.close();
    }     
}
