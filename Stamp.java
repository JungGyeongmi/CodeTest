import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stamp {
    static int n, k;
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; 
        String inputVal = "";
        while ((inputVal = br.readLine()) != null && !inputVal.isEmpty()) {
            st = new StringTokenizer(inputVal);
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            System.out.println(rec(n, 0));
            result = 0;
        }

    }
    
    static int result = 0;

    static int rec (int n, int m) {
        if(n == 0) {
            return result;
        }
        result += n;
        m += n;
        n = m/k;
        m = m%k;        
        return rec(n, m);
    }
}
