package doitAlgorithm.page40;

public class Q17 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            for(int j = 1; j <= i-1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
