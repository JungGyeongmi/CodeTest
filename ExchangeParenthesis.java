import java.util.Stack;

public class ExchangeParenthesis {

    static String inputVal = "()))((()";

    public static void main(String[] args) {

        if (checker(inputVal)) {
            System.out.println(inputVal);
            return;
        }

        System.out.println(solution(inputVal));
    }

    static int count = 0;
    // static String result = "";
    
    static String solution(String target) {
        String result = "";
        String v, u = "";

        if (target.length() == 0) {
            return "";
        }

        if (checker(target)) {
            return target;
        }
        
        // 2. 문자열 target을 u / v 로 분리
        int n = 2;
        u = target.substring(0, n);
        v = "";

        if (target.length() > 2) {
            v = target.substring(n);
        }


        while (!counting(u)) {
            n += 2;
            u = target.substring(0, n);
            v = target.substring(n);
        }

        System.out.println("target s : " + target);
        System.out.println("substr u : " + u);
        System.out.println("substr v : " + v);
        System.out.println("********");

        // 3. 문자열 u 가 바른 문자열이라면
        if (checker(u)) 
        {
            // v에 대해서 반복, 수행 결과를 u에 이어 붙인 후 반환함
            result += u;
            
            // v 가 공백일 경우 분기
            if(v.length() != 0) {
                result += solution(v);
            }
        } 
        else // 4. 문자열 u가 바르지 않은 경우 
        {
            // System.out.println("---------------");
            // 빈 문자열에 (를 붙임
            String tmpStr = "(";
            // v에 대해 1단계부터 재귀적으로 수행
            tmpStr += solution(v);
            // System.out.println("return v : "+solution(v));
            // )를 붙임
            tmpStr += ")";

            // u의 첫 번째와 마지막 문자를 제거후 괄호 방향을 뒤집는다
            // String tmp = u.substring(1, u.length()-1);
            // System.out.println("test string h "+u);
            // System.out.println("test string h "+tmp);
            // String aa = "";

            for (int i = 1; i < u.length()-1; i++) {
                if (u.charAt(i) == ')') {
                    tmpStr += "(";
                } else {
                    tmpStr += ")";
                }
            }
            // tmpStr += aa;
            
            result += tmpStr;
        }
        
        // count++;
        // System.out.println(count +"번째 "+result);
        return result;
    }

    static boolean counting(String target) {
        int leftside = 0;
        int rightside = 0;

        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == '(') {
                leftside++;
            } else {
                rightside++;
            }
        }

        return leftside == rightside ? true : false;
    }

    static boolean checker(String target) {

        Stack<Integer> st = new Stack<>();

        if (target.charAt(0) == ')') {
            return false;
        }

        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == '(') {
                st.push(0);
            } else if (!st.empty()) {
                st.pop();
            } else if (st.empty() && target.charAt(i) != '(') {
                return false;
            }
        }

        return st.empty();
    }
}
