package doitAlgorithm.page208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q5 {
    static int count = 0;
    static int swapCount = 0;
    static int repeatCnt = 0;

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
        swapCount ++;
        System.out.println("idx1 과 idx2 교환 : " + idx1 + " " + idx2);
    }

    static void bubbleSort(int[] a, int n) {

        int last = n - 1;
        int first = 0;

        int idx1 = 0;
        int idx2 = n - 1;

        int max = a[last];
        int min = a[first];

        while (idx1 != idx2) {
            swapCount = 0;
            repeatCnt++;

            System.out.println(repeatCnt + " 회차");

            for (int j = first; j <= last; j++) {
                // System.out.println(j + " ");
                if (a[j] <= min) {
                    first = j;
                    min = a[j];
                }
            }

            if (idx1 != first) {
                // System.out.println("swap " + first + " " + a[first]);
                swap(a, idx1, first);
                idx1++;
            } else {
                // System.out.println("swap 없음"+"idx1 "+idx1+"first "+ first + " " + a[first]);
            }

            for (int j = last; j >= first; j--) {
                // System.out.println(j + " ");
                if (a[j] >= max) {
                    last = j;
                    max = a[j];
                }
            }

            if (idx2 != last) {
                // System.out.println("swap " + last + " " + a[last]);
                swap(a, idx2, last);
                idx2--;
            } else {
                // System.out.println("swap 없음"+"idx2 "+idx2+"last "+ last + " " + a[last]);
            }

            System.out.println(idx1 + " " + idx2);

            if (swapCount == 0) {
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

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            
            x[i] = Integer.parseInt(br.readLine());
        }

        bubbleSort(x, nx);

        System.out.println("repeat count " + repeatCnt);
        System.out.println("오름차순으로 정렬했습니다. ");
        System.out.println(Arrays.toString(x));
    }
}
