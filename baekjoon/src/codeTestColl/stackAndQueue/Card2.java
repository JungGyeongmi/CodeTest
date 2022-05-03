package codeTestColl.stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Card2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> deQue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
            deQue.offer(i+1);
        }

        // while(deQue.size() != 1) {
        while(deQue.size() > 1) {
            deQue.poll();
            deQue.offer(deQue.poll());
        }

        System.out.println(deQue.poll());
    }
}
