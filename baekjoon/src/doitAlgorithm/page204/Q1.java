package doitAlgorithm.page204;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1 {
    
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    
    
    static void bubbleSort(int[]a, int n) {
        for(int i = 0; i < n-1; i++) {
            boolean breaker = true;
            for(int j = 0; j < n-1; j++) {
                if(a[j] > a[j+1]) {
                    swap(a, j, j + 1);
                    breaker = false;
                }
                System.out.println(Arrays.toString(a));
            }
            System.out.println((i+1)+" 회");
            if(breaker) {
                return;
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("버블정렬 (버전2)");
        System.out.print("요솟수 : ");
        int nx = Integer.parseInt(br.readLine());
        int[] x = new int[nx];
        
        for(int i = 0; i < nx; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = Integer.parseInt(br.readLine());
        }

        bubbleSort(x, nx);
        
        System.out.println("오름차순으로 정렬했습니다. ");
        for(int i = 0; i < nx; i ++) {
            System.out.println("x["+i+"] = "+x[i]);
        }

        System.out.println(Arrays.toString(x));
    }
}
