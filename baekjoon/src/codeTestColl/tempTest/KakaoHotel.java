package codeTestColl.tempTest;

import java.util.Arrays;

public class KakaoHotel {
    
    public static void main(String[] args) {
        
        long k = 10;
        long[] roomNumber = {1, 3, 4, 1, 3, 1};
        
        long[] result = solution(k, roomNumber);
        
        System.out.println(Arrays.toString(result));
    }    
    
    static long[] solution(long k, long[] room_number) {
        
        long[] answer = new long[room_number.length];
        boolean[] checker = new boolean[(int)(k+1)];
        
        for (int i = 0; i < room_number.length; i++ ){
            
            int checkRoomNum = (int)room_number[i];
            
            System.out.println("i = "+i);
            System.out.println("check room number = "+ checkRoomNum);
            
            if(!checker[checkRoomNum]){
                System.out.println(" 원하는 층 배정 ");                
                answer[i] = checkRoomNum;
                System.out.println(i+"층 방 배정 여부"+answer[i]);
                checker[checkRoomNum] = true;
                System.out.println(i+"층 방 배정 완료"+answer[i]);
                System.out.println(checker[checkRoomNum]);
                 
                continue;
                
            }
            
            for(int j = checkRoomNum + 1; j < room_number.length; j++ ) {
                
                System.out.println("원하는 층 찾기");
                
                if(!checker[j]) {
                    
                    answer[j] = checkRoomNum;
                    checker[j] = true;
                    
                    System.out.println("j = "+j);
                    System.out.println(answer[j]);
                    System.out.println(checker[j]);
                    break;
            
                }
            }
        }

        return answer;
    }
}
