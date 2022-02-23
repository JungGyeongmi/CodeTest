package basicMathEx2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Sosu_3 {
	
	static List<Integer> solution(int start, int end) {
		//StringBuffer sb = new StringBuffer();
		List<Integer> set2 = new ArrayList<>();
		for(int i =start;i<=end;i++) {
			if(i==2) {
				set2.add(i);
			}
			for(int j = 2;j<i;j++) {
				if(i%j == 0) {
					break;
				} else if(i == j+1) {
					set2.add(i);
				}
			}
		}		
		return set2;
	}

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		solution(start, end).stream().forEach(System.out::println);
	}
}