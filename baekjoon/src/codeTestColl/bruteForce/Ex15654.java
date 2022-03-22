package codeTestColl.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex15654 {
    public static int[] arr;
    public static int[] result;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        result=new int[N];
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        int i = 0;
        while(st.hasMoreTokens()) {
            arr[i++]=Integer.parseInt(st.nextToken());
        }
        // 오름차순 정렬 
        Arrays.sort(arr);
        result = Arrays.copyOf(arr, arr.length);

        visit = new boolean[N];
        dfs(N, M, 0);
        System.out.println(sb);
    }

    public static void dfs(int N, int M, int depth) {
        if(depth == M) {
            for(int i=0; i<M;i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
           
            return;
        }

        for(int i = 0; i < N; i++) {
            if(!visit[i]){
                visit[i]=true;
                arr[depth]=result[i];
                dfs(N, M, depth+1);
                visit[i]=false;
               
            }
        }
    }
}
