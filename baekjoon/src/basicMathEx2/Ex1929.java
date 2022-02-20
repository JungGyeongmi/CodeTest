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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
		// List<Integer> result = new ArrayList<>();
        boolean checker = false;

        for(int i = M; i <= N; i++) { 
            checker = true;
			for(int j = 2; j<i; j++) {				
                if(i%j==0) {
                    checker = false;
                    System.out.println( i +" 를"+ j+" 로 나눔");
                    break;
                    /*
                    break 쓰고 가장 가까운 반복 벗어나려고 썼는데
                    checker 안써주면 아래 코드까지 읽어버려서 문제임
                    내가 잘못생각하고있나?
                    */
                } 
			}
            if(checker) {
                bw.write(Integer.toString(i)+"\n");
                // System.out.println(i);
                // System.out.println("소수임" + i);
                // result.add(i);
            }
        }

		br.close();
        bw.flush();
        bw.close();
		// result.stream().forEach(System.out::println);
		   
    }
    
}
