// package codeTestColl.stackAndQueue;

// import java.util.Arrays;
// import java.util.LinkedList;
// import java.util.Queue;

// class Printer {

//     public static void main(String[] args) {
//         // int[] arr = {2, 1, 3, 2};
//         // int[] arr2 = {1, 1, 1 , "1", 1};
//         int[] arr2 = {1, 1, 9, 1, 1, 1};

//         // System.out.println(solution(arr, 2));   
//         System.out.println(solution(arr2, 0));
//     }

//     public static int solution(int[] priorities, int location) {

//         Queue<Integer> queue = new LinkedList<>();
        
//         Boolean triger = false;
        
//         for (int pri : priorities) {
//             if (pri < priorities[location]) {
//                 triger = true;
//             }
//             queue.add(pri);
//         }
               
//         if (triger) {

//             return 1;

//         }

//         Arrays.sort(priorities);
        
//         // 재할당 되는것
//         int maxLength = priorities.length; 
//         int maxValueIndex = priorities.length-1; 
//         int indexNumber = location; 
//         int counter = 0; // 같이 돌면서 인덱스 값 추적
//         int pollQueValue = 0; // Queue에 있는 값을 빼냄
//         int result = 0; // 뽑힌 순서 

//         while(queue.peek()!=null) {

//             // 하위 반복
//             pollQueValue = queue.poll();
//             System.out.println("target index number = "+indexNumber);
            
//             // 바로 뽑힌 경우에 
//             if (pollQueValue == priorities[maxValueIndex]) {
                
//                 System.out.println("max value = "+priorities[maxValueIndex]);
//                 // 봅혔으니까 해당 값을 제해줌
//                 maxValueIndex -= 1;
                
//                 if (counter == indexNumber) {
//                     break;
//                 }
                
//                 // max length를 빼줌 길이가 변하니까
//                 maxLength -= 1;

//                 // print 한 값 counting
//                 result ++;
//                 indexNumber--;
//                 System.out.println("result = "+result);
//                 System.out.println("하나 뽑아가서 index number 줄임 = "+indexNumber);

//             } else {

//                 queue.add(pollQueValue);

//                 if (indexNumber == counter) {

//                     System.out.println("타겟 인덱스 넘버 변경");

//                     indexNumber = maxLength - 1;

//                 }
                
//             }

//             System.out.println("max length = "+maxLength);
//             System.out.println("indexNumber = "+indexNumber);
//             System.out.println("counter = "+counter);
//             System.out.println("result = "+result);
//             System.out.println("---------------------");
            
//             if (counter == maxLength-1) {
                
//                 System.out.println("카운터 초기화");

//                 counter = 0;
//                 continue;   
//             }
//             counter++;
//         }

//         return result;
//     }
// }