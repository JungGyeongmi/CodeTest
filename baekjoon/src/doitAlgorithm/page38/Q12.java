package doitAlgorithm.page38;

public class Q12 {
    public static void main(String[] args) {

        for (int i = -1; i < 10; i++) {

            if (i == -1) {
                System.out.print(" |");
            } else if(i != 0) {
                System.out.print(i + "|");
            }

            for (int j = 1; j < 10; j++) {
                if (i == -1) {
                    System.out.printf("%2d ", j);
                } else if (i == 0) {
                    if(j==1){
                        System.out.print("---+");
                    } else{
                        System.out.print("---");
                    }
                } else  {
                    System.out.printf("%2d ", i * j);
                }
            }
            System.out.println();
        }

    }
}
