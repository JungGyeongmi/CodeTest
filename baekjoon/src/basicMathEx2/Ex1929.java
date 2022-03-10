package basicMathEx2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
		// List<Integer> result = new ArrayList<>();
        boolean checker = false;

        for(int i = M; i <= N; i++) { 
            checker = true;
			for(int j = 2; j<=Math.sqrt(i); j++) {				
			// for(int j = 2; j<i; j++) {				
                if(i%j==0) {
                    checker = false;
                    break;
                } 
			}
            
            if(checker && i != 1) {
                // bw.write(Integer.toString(i)+"\n");
                System.out.println(i);
            }
        
        }

		br.close();
        // bw.flush();
        // bw.close();
		// result.stream().forEach(System.out::println);
		   
    }
    
}
