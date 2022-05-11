package doitAlgorithm.page216;

import java.util.Arrays;

public class Q6 {
    static void selectionSort(int[] a) {
        for(int i = 0; i < a.length-1; i++) {
            int min = i;
            int j;
            for(j = i + 1 ; j < a.length; j ++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            
            for(int k = 0; k < a.length; k ++) {
                if(k == min) {
                    System.out.print(" + ");
                } else if (k == i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            for(int arr : a) {
                System.out.print(arr+" ");
            }
            System.out.println();

            swap(a, i, min);
            for(int arr : a) {
                System.out.print(arr+" ");
            }
            System.out.println();
        }
    }

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    
    public static void main(String[] args) {
        int[] arr = {22, 5, 11, 35, 120, 68, 70};
        
        selectionSort(arr);
        System.out.println("오름차순 정렬");
        System.out.println(Arrays.toString(arr));
    }

}
