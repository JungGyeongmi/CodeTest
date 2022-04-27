package doitAlgorithm.page38;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("사각형의 단수를 출력합니다.");
        System.out.print("단수 : ");
        int n = sc.nextInt();
        System.out.println();
        
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
