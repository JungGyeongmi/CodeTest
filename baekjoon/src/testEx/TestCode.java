package testEx;

import java.util.ArrayList;
import java.util.List;

public class TestCode {
    public static void main(String[] args) {
        List<Integer> randmember = new ArrayList<>();

        while (randmember.size()!=10) {
            int inputrandomNumber = (int) (Math.random() * 10) + 1;
            for (int k = 0; k < 10; k++) {
                if (!randmember.contains(inputrandomNumber)) {
                    randmember.add(inputrandomNumber);
                    break;
                }

            }
        }

        for( int result : randmember ){
            System.out.print(result+ " ");
        }

    }
}
