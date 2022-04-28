package codeTestColl.stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in)); 
        Stack<Integer> st = new Stack<>();

        int K = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < K; i ++) {
            int checkItem = Integer.parseInt(br.readLine());
            if(checkItem != 0) {
                st.push(checkItem);
            } else {
                st.pop();
            }
        }

        if(st.size() != 0) {
            System.out.println(st.stream().mapToInt(s->(int)s).sum());
        } else {
            System.out.println(st.size());
        }
    
    }
}
