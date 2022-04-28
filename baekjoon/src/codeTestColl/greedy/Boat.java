package codeTestColl.greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Boat {
    public static void main(String[] args) {
        int[] people = {20, 40, 50, 50, 50, 60, 70};
        // int[] people = {20, 40, 50, 50, 50, 60, 70};
        // int[] people = {70, 50, 80, 50};
        int limit = 100;
        System.out.println(solution(people, limit));
    }
    
    public static int solution(int[] people,int limit) {
        Queue<Integer> pp = new LinkedList<>();
        Arrays.sort(people);
        for(int person : people ){
            pp.offer(person);
        }

        int count = 0;

        while(pp.size()>1) {
            int p1 = pp.poll();
            count ++;

            for(int p : pp) {
                if(p1 + p == limit) {
                    pp.remove();
                    System.out.println(p);
                    break;
                }
            }

            if(p1 + pp.peek() < limit) {
                System.out.println(pp.peek());
                pp.remove();
            }
        }

        return count+1;
    }
}
