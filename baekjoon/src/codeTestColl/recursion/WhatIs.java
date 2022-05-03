package codeTestColl.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatIs {
    static String[] outputStringArr = new String [6];
    static String underbar = "";
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long n = Long.parseLong(br.readLine());

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");

        outputStringArr[0] = "\"재귀함수가 뭔가요?\"";
		outputStringArr[1] = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
		outputStringArr[2] = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
		outputStringArr[3] = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
		outputStringArr[4] = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
		outputStringArr[5] = "라고 답변하였지.";

        recursiveExample(n);
    }

    static void recursiveExample(long repeatCount) {
        String repeatUnderbar = underbar;

        if(repeatCount == 0L) {
			System.out.println(repeatUnderbar + outputStringArr[0]);
			System.out.println(repeatUnderbar + outputStringArr[4]);
			System.out.println(repeatUnderbar + outputStringArr[5]);
			return;
		}

        for(int i = 0; i < 4; i++) {
            System.out.println(repeatUnderbar+outputStringArr[i]);
        }

        underbar += "____";
        recursiveExample(repeatCount-1);

        System.out.println(repeatCount);
        System.out.println(repeatUnderbar + outputStringArr[5]);

    }
}
