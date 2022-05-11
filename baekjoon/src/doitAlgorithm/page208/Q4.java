package doitAlgorithm.page208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q4 {
    static int count = 0;
    static int swapCount = 0;

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    
    
    static void bubbleSort(int[]a, int n) {
        int i = 0;
        int last = n-1;
        int repeatCnt = 0;
        while(i < n-1) {
            repeatCnt++;
            
            System.out.println(repeatCnt+" 회차");

            for(int j = n-1; j > i; j--) {
                if(a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    swapCount++;
                    last = j;
                }

                for(int k = 0; k < n; k++) {
                    if(k == j) {
                        if(swapCount!=0) {
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

            i = last;
            
            if(swapCount==0){
                return;
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("버블정렬 (버전5)");
        System.out.print("요솟수 : ");
        int nx = Integer.parseInt(br.readLine());
        int[] x = new int[nx];
        
        for(int i = 0; i < nx; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = Integer.parseInt(br.readLine());
        }

        bubbleSort(x, nx);
        
        System.out.println("오름차순으로 정렬했습니다. ");
        System.out.println(count+"회 비교");
        System.out.println(swapCount+"회 교환");
        System.out.println(Arrays.toString(x));
    }
}
