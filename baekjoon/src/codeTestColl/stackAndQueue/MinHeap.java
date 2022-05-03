package codeTestColl.stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinHeap {

    private static Queue<Integer> heap = new PriorityQueue<Integer>();
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while(--N != 0) {
            int inputValue = Integer.parseInt(br.readLine());

            if(inputValue == 0) {

                if(heap.isEmpty()) {
                    System.out.println(0);
                    continue;
                }

                System.out.println(heap.poll());
                continue;

            } else {
                
                heap.offer(inputValue);
            } 

        }
    }
}
