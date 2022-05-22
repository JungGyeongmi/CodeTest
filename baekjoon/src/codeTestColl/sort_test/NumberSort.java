package codeTestColl.sort_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     
    
        int N = Integer.parseInt(br.readLine());
        int number;
        int[] numberArr = new int[N];
        int i = 0;
// br.nullReader() != null 
        while(i < N){
            number = Integer.parseInt(br.readLine());
            numberArr[i] = number;
            i++;
        }

        insertSort(numberArr);
        System.out.println("삽입 정렬");
        System.out.println(Arrays.toString(numberArr));
        
        selectionSort(numberArr);
        System.out.println("선택 정렬");
        System.out.println(Arrays.toString(numberArr));
        
    }

    static void insertSort(int[] a) {
        for(int i = 1; i <a.length; i++) {
            int j;  
            int tmp = a[i];
            for(j = i; j > 0 && a[j-1] > tmp; j--) {
                a[j] = a[j-1];
            }
            a[j] = tmp;

        }

    }

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void selectionSort(int[] a) {
        for(int i = 0; i < a.length-1; i++) {

            int min = i;
            int j;

            for(j = i + 1 ; j < a.length; j ++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }

            swap(a, i, min);
        }
    }
}
