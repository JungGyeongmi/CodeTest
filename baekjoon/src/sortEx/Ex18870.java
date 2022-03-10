package sortEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex18870 {
    public static void main(String[] args) throws IOException {

        /*

            수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다.
            이 좌표에 좌표 압축을 적용하려고 한다.

            Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 
            서로 다른 좌표의 개수와 같아야 한다.

            X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N
        
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N  = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0 ; i<N; i++) arr[i]=Integer.parseInt(st.nextToken());
        List<Integer> dist = new ArrayList<>();
        for(int i = 0; i<N; i++){
            int test = arr[i];
            int count = 0;
            for(int j = 0; j<N; j++) {
                if(test > arr[j]) {
                    if(!dist.contains(arr[j])){
                        dist.add(arr[j]);
                        count++;
                    }
                }
            }
            dist.clear();
            bw.write(count+" ");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}