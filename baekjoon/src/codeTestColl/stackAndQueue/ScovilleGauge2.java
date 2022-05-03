package codeTestColl.stackAndQueue;

import java.util.PriorityQueue;

public class ScovilleGauge2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 10, 12};
        int k = 11;

        solution(arr, k);
    }

    static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int aScoville : scoville) {
            heap.offer(aScoville);
        }

        while (heap.peek() <= K) {
            if (heap.size() == 1) {
                System.out.println("result>> -1");
                return -1;
            }
            int a = heap.poll();
            int b = heap.poll();

            int result = a + (b * 2);

            heap.offer(result);
            answer++;
        }

        System.out.println("result >> "+answer);
        return answer;
    }
}
