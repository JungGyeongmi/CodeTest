package doitAlgorithm.page40;

public class Q15 {
    public static void main(String[] args) {

        // 1 번 예제
        for (int i = 0; i < 3; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------");

        // 2 번 예제
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------");

        // 3 번 예제
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 3; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------");

        // 4 번 예제
        for (int i = 1; i <= 3; i++) {						
			for (int j = 1; j <= 3 - i; j++) {		
				System.out.print(" ");
			}
			for (int j = 1; j <= i ; j++) {			
				System.out.print("*"); 				
			}
			System.out.println();						
		}
    }
}
