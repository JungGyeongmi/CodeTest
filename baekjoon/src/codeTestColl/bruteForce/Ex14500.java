package codeTestColl.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex14500 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 입력 
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        // 선언 및 초기화
        int [][] arr = new int[x][y];
        for(int i = 0; i <arr.length; i++) {
            st = new StringTokenizer(br.readLine()); 
            for(int j=0; j<arr[i].length;j++) {
                arr[i][j]= Integer.parseInt(st.nextToken());
            }
        }

        // 비교 변수
        int sum = 0;
        int max = 0;


        // 1번 가로
        for(int i = 0; i <x; i++){
            for(int j = 0; j<=y-4; j++){
                sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i][j+3];
                if(max  < sum) {
                    max = sum;
                }
            }
        }
        // 1번 세로
        for(int i = 0; i <=x-4; i++){
            for(int j = 0; j<y; j++){
                sum = arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+3][j];
                if(max  < sum) {
                    max = sum;
                }
            }
        }

        // 2번
        for(int i = 0; i <=x-2; i++){
            for(int j = 0; j<=y-2; j++){
                sum = arr[i][j]+arr[i][j+1]+arr[i+1][j]+arr[i+1][j+1];
                if(max  < sum) {
                    max = sum;
                }
            }
        }


        // 3번 세로
        for(int i = 0; i <=x-3; i++){
            for(int j = 0; j<=y-2; j++){
                sum = arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i][j+1];
                int sum2 = arr[i][j]+arr[i+1][j]+arr[i+2][j]+arr[i+2][j+1];
                sum = sum<sum2?sum2:sum;
                if(max  < sum) {
                    max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
