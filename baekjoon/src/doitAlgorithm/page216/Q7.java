package doitAlgorithm.page216;

import java.util.Arrays;

public class Q7 {
    static void insertionSort(int[] a) {
        /*
            삽입 기준 인덱스 : i 
            교환할 인덱스 : j
        */
        for(int i = 1; i <a.length; i++) {
            int j;  
            int tmp = a[i];
            for(j = i; j > 0 && a[j-1] > tmp; j--) {
                a[j] = a[j-1];
            }
            a[j] = tmp;
            
            for(int k = 0; k < a.length; k++) {
                if(k == i) {
                    System.out.print("+");
                }
                System.out.print(" ");
                System.out.println();

                System.out.print(a[k]);
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {22, 5, 11, 35, 120, 68, 70};
        
        insertionSort(arr);
        System.out.println("오름차순 정렬");
        System.out.println(Arrays.toString(arr));
    }
}
