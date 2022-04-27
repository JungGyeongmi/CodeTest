package doitAlgorithm.page174;

public class Q6 {
    public static void main(String[] args) {
        move(3, 1, 3);
    }

    static void move(int no, int x, int y) {
        

        if (no > 1) {
            move(no - 1, x, 6 - x - y);
        }

        
        System.out.printf("원반[%d]를 %s번 기둥에서 %s번 기둥으로 옮김\n", no, toStringPillar(x), toStringPillar(y));

        if (no > 1) {
            move(no - 1, 6 - x - y, y);
        }
    }
    
    static String toStringPillar (int number) {
        String pillar = "";
        switch(number) {
            case 1: pillar = "A"; break; 
            case 2: pillar = "B"; break; 
            case 3: pillar = "C"; break; 
        }
        return pillar;
    }
}
