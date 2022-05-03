package codeTestColl.stackAndQueue;

import java.util.PriorityQueue;

public class ScovilleGauge {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 9, 10, 12 };
        int k = 11;

        solution(arr, k);
    }

    static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int gauage : scoville) {
            heap.offer(gauage);
        }

        int answer = 0;

        while (heap.size() != 1) {
            if (heap.peek() < K) {
                int minSco = heap.poll();
                int nextMinSco = heap.poll();

                int result = minSco + (nextMinSco * 2);

                heap.offer(result);
                answer++;
                continue;
            }
            return answer;
        }

        if(heap.size() == 1 && heap.peek() < K) {
            answer = -1;
        }
        return answer;
    }
}
