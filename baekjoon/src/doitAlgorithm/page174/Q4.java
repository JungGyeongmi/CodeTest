package doitAlgorithm.page174;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        recur(n);
    }

    static void recur(int n) {
        System.out.println("초기 "+ n);
        
		if (n > 0) {
			recur(n - 2);
			System.out.println("연산 "+n);
			recur(n - 1);
		}
	}
}
