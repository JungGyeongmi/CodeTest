package doitAlgorithm.page206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q3 {
    static int count = 0;
    static int swapCount = 0;

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    
    
    static void bubbleSort(int[]a, int n) {
        for(int i = 0; i < n-1; i++) {
            boolean breaker = false;
            for(int j = n-1; j > i; j--) {
                if(a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    breaker = true;
                    swapCount++;
                }

                for(int k = 0; k < n; k++) {
                    if(k == j) {
                        if(breaker) {
                            System.out.print("+"+a[k]+" ");
                        } else {
                            System.out.print("-"+a[k]+" ");
                        }
                    } else {
                        System.out.print(a[k]+" ");
                    }
                    count++;
                }
                System.out.println();
            }
            if(!breaker){
                return;
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("버블정렬 (버전4)");
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
        System.out.println(count+"회 비교");
        System.out.println(swapCount+"회 교환");

        System.out.println(Arrays.toString(x));
    }
}
