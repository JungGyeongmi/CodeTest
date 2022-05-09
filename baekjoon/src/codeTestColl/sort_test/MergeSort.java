package codeTestColl.sort_test;

import javax.sql.rowset.FilteredRowSet;

public class MergeSort {
    
    public static int solution(int[]a, int start, int end) {
        
        if(start == end) {
            return 0;
        }

        int mid = (int)(start+end)/2; // 기존 배열의 반
        int[] sorted = new int[end-start+1]; // 임시 배열
        int ans = solution(a, start, mid) + solution(a, mid+1, end);
        
        int frontIdx = start; // 앞 부분 인덱스
        int lastIdx = mid+1; // 뒷 부분 인덱스
        int i = 0;
        while(frontIdx <= mid || lastIdx <= end) {
            sorted[i++] = a[frontIdx++];
        }

        return 0;
    }
    
    public static void main(String[] args) {
        
    }    
}
