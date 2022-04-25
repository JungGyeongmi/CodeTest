package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class CorrectParenthesis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solution(br.readLine());
    }

    static boolean solution(String s) {

        Stack<Boolean> stack = new Stack<>();
        if (s.charAt(0) == ')') {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(true);
            } else if (!stack.empty()) {
                stack.pop();
            } else if (stack.empty() && s.charAt(i) == ')') {
                return false;
            }
        }
        return stack.empty();
    }
}
