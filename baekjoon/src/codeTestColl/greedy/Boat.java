package codeTestColl.greedy;

import java.util.Arrays;

public class Boat {
    public static void main(String[] args) {
        int[] people = {70, 80, 50};
        // int[] people = {70, 50, 80, 50};
        int limit = 100;
        solution(people, limit);
    }
    
    static int solution(int[] people, int limit) {
        int answer = 0;
        boolean[] checker = new boolean[people.length];

        Arrays.sort(people);

        while(Arrays.toString(checker).indexOf("false") != -1){
            int peopleSum = 0;
            for(int i = people.length-1; i >= 0; i -- ) {
                
                if(!checker[i]) {
    
                    if(peopleSum + people[i] <= limit) {
                        peopleSum += people[i];
                        checker[i] = true;
                    }
                    
                    System.out.println("people[i] = " + people[i]);
                    System.out.println("i = " + i);
                    System.out.println(peopleSum);
                    System.out.println(Arrays.toString(checker));
                    continue;
                    
                }
            }
            answer ++;
            System.out.println("answer "+answer);
        }

        return answer;
    }
}
