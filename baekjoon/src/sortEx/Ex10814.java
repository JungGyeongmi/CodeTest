package sortEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Ex10814  {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String [][] StringArray = new String[N][2];
        StringTokenizer st = new StringTokenizer("");
        for(int j = 0; j < N; j++) {
            st = new StringTokenizer(br.readLine());
            StringArray[j][0]=st.nextToken();
            StringArray[j][1]=st.nextToken();
        }

        Arrays.sort(StringArray, new CompareToTest());

        for(int i = 0; i<N; i++) {
            System.out.println(StringArray[i][0] +" "+StringArray[i][1]);
        }

    }
}

class CompareToTest implements Comparator<String[]> {
    @Override
    public int compare(String[] o1, String[] o2) {
        // System.out.println("나이"+ o1[0]);
        return   Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
    }

}
