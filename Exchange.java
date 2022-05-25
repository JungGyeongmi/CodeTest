import java.util.Stack;

public class Exchange {
    static String inputVal = "()))((()";
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {

        if (checker(inputVal)) {
            System.out.println(" -- origin --");
            System.out.println(inputVal);
            return;
        }
        
        solution(inputVal);

        System.out.println("result : " + sb.toString());

    }

    static int count = 0;
    static String v, u;
    
    static String solution(String target) {
		
        if(target.length() == 0) return "";

        count++;
		System.out.println(count+"번째 재귀순회");

        int n = 2;
        u = target.substring(0,n);
        v = "";

        if(target.length() > 2) {
            v = target.substring(n);
        }

        while(!counting(u)) {
            n += 2;
            u = target.substring(0,n);
            v = target.substring(n);
        }
        
        
        System.out.println("target "+target);
        System.out.println("substr u : "+u);
        System.out.println("substr v : "+v);

        if(!checker(u)) {
    		u = switchStr(u);
        }

        sb.append(u);
        
        if(v.length() == 0) {
            System.out.println("공백 v ");
        	return "";
    	} else if (checker(v)) {
            System.out.println("바른 문자열 v ");
    		sb.append(v);
    	} else {
            System.out.println("v 에 대해서 재귀 ");
    		solution(v);
    	}

    	return "";
    }
    
    //  이 부분 수정 조건 잘못 봤음
    static String switchStr(String target) {
		
    	StringBuffer returnStr = new StringBuffer();
    	
    	returnStr.append("(");
        
        System.out.println("switch v : "+v);
        
        String aa = solution(v);
        System.out.println("aa "+aa);
        returnStr.append(aa);

        System.out.println("temp sw");
    	
    	returnStr.append(")");
    	
    	String tmp = target.substring(1, target.length()-1);
    	
    	for(int i = 0; i < tmp.length(); i++ ){
    		if(tmp.charAt(i)==')') {
    			returnStr.append("(");
    		} else {
    			returnStr.append(")");
    		}
    	}
    	
    	System.out.println(returnStr.toString());
    	
    	return returnStr.toString();
    }
    
    static boolean counting(String target) {
        int leftside = 0;
        int rightside = 0;
        
        for(int i = 0; i < target.length(); i++) {
            if(target.charAt(i)=='(') { leftside++; } else { rightside++; }
        }
        
        return leftside==rightside?true:false;
    }
    
    static boolean checker(String target) {
    	
    	Stack<Integer> st = new Stack<>();
    	
    	if(target.charAt(0) == ')') { return false; }
    	
	    for(int i = 0; i < target.length(); i++ ) {
	    	if(target.charAt(i) == '(') {
	    		st.push(0);
	    	} else if(!st.empty()) { 
	    		st.pop();
	    	} else if (st.empty() && target.charAt(i) != '(' ) {
	    		return false;
	    	}
	    }
	    
	    return st.empty();
    }
}
