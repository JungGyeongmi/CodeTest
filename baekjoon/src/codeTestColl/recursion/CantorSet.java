package codeTestColl.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CantorSet {
    static StringBuffer result = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int number = Integer.parseInt(br.readLine());        
        int totalNumber = (int)(Math.pow(3, number));

        while(totalNumber != 0) {
            sb.append("-");
            totalNumber--;
        }

        int firstIndex = (int)sb.length()/3;

        cantorSetFunction(sb, firstIndex);


    }

    static void cantorSetFunction(StringBuffer n, int firstIndex) {

        StringBuffer enterSb = new StringBuffer();
        // 초기화
        enterSb.setLength(0);

        System.out.println("input String "+n.toString());
        System.out.println("input first index "+firstIndex);
        
        int lastIndex = firstIndex * 2;

        for(int j = 0; j < lastIndex-firstIndex; j++ ) {
            enterSb.append(" ");
        }
        
        n.replace(firstIndex, lastIndex, enterSb.toString());
        if(firstIndex == 1) {
            System.out.println(n.toString());
            return;
        }

        
        // System.out.println("change String "+n.toString());

        int newfirstIndex = firstIndex / 3;
        // int newlastIndex = newfirstIndex / 3;
        // enterSb.setLength(0);
        // for(int j = 0; j < newlastIndex-newfirstIndex; j++ ) {
        //     enterSb.append(" ");
        // }
        // n.replace(newfirstIndex, newlastIndex, enterSb.toString());
        // System.out.println("second index "+newfirstIndex);
        // System.out.println("second String "+n.toString());
        cantorSetFunction(n, newfirstIndex);
        
        // firstIndex = lastIndex;
        // lastIndex = firstIndex * 2;
        // System.out.println(firstIndex);
        // System.out.println(lastIndex);
        // enterSb.setLength(0);
        // for(int j = 0; j < lastIndex-firstIndex; j++ ) {
        //     enterSb.append(" ");
        // }
        // System.out.println(lastIndex-firstIndex);
        // n.replace(firstIndex, lastIndex, enterSb.toString());
        // System.out.println("third index "+firstIndex);
        // System.out.println("third String "+n.toString());
        // cantorSetFunction(n, firstIndex);
    }
}
