package codeTestColl.recursion;

import java.util.Arrays;

public class KakaoHotelRecur {
    
    static long k = 10;
    static long[] roomNumber = {1, 3, 4, 1, 3, 1};
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(k, roomNumber)));
    }    
    
    static long[] solution(long k, long[] room_number) {

        long[] answer = new long[room_number.length];
        boolean[] checker = new boolean[(int)(k+1)];
        
        for(int i = 0; i < room_number.length; i++) {
           answer[i] = hotelRecur(room_number[i], checker);
        }
        
        return answer;
    }

    static long hotelRecur(long targetRoomNumber, boolean[] checker) {
        
        System.out.println(targetRoomNumber);
        
        if(checker[(int)targetRoomNumber]) {
            return hotelRecur(++targetRoomNumber, checker);
        }
        
        checker[(int)targetRoomNumber] = true;
        
        return targetRoomNumber;
    }
}
