package doitAlgorithm.page174;

public class Q7 {
    public static void main(String[] args) {
        move(3, 1, 3);
    }

    /* 
        no = 원반 갯수
        x = 시작
        y = 목표
    */

    static void move(int no, int x, int y) {

        int originNo = no;
        int originX = x;
        int originY = y;
        System.out.println(no);
              
        while (no > 1) {
            no--;
            y = 6 - (originX + originY);
            System.out.printf("원반[%d]를 %s번 기둥에서 %s번 기둥으로 옮김\n", no, toStringPillar(x), toStringPillar(y));
        }
        

        while (originNo > 1) {
            originNo--;
            x = 6 - (originX + originY);
            y = originY;
            System.out.printf("원반[%d]를 %s번 기둥에서 %s번 기둥으로 옮김\n", originNo, toStringPillar(x), toStringPillar(y));
        }
        System.out.println(no);
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
