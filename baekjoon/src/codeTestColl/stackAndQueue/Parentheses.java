package codeTestColl.stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> st = new Stack<>();
        int resultCount = 0;
        String[] tempArray = br.readLine().split("");

       
        for(int i = 0; i < tempArray.length; i++ ) {

            if (st.isEmpty()) {
                st.push(tempArray[i]);
                continue;
            }
        
            if(tempArray[i].equals("(")) {
                st.push(tempArray[i]);
            }

            if(tempArray[i].equals(")")) {
                
                if(st.peek().equals("(")) {
                    st.pop();
                } else {
                    st.push(tempArray[i]);
                }
            }
            
        }

        System.out.println(st.size());

    }
}
