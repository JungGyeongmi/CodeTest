package codeTestColl.stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> st = new Stack<>();

        String[] tempArray = br.readLine().split("");

        for (String item : tempArray) {
            st.push(item);
        }

        int result = 0;

        while (st.size() != 0) {
            String popItem = st.pop();

            if (popItem.equals(")") && st.size() > 1) {
                if (st.peek().equals("(")) {
                    st.pop();
                } else {
                    result++;
                }
            } else {
                result++;
            }
        }

        System.out.println(result);

    }
}
