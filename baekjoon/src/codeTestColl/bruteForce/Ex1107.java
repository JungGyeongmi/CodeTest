// package codeTestColl.bruteForce;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.StringTokenizer;

// public class Ex1107 {
//     public static void main(String[] args) throws IOException {

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int targetNumber = Integer.parseInt(br.readLine());
//         int brokenBtnCount = Integer.parseInt(br.readLine());
//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//         br.close();

//         int[] brokenBtn = new int[brokenBtnCount];
//         for (int i = 0; i < brokenBtnCount;)
//             brokenBtn[i++] = Integer.parseInt(st.nextToken());

//         List<Integer> remoteController = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

//         for (int i = 0; i < brokenBtnCount;) {
//             remoteController.remove(Integer.valueOf(brokenBtn[i++]));
//         }
//         System.out.println("클릭 할 수 있는 버튼 " + remoteController.toString());

//         if (targetNumber != 100) {
//             int resultCount = 0;
//             int min = targetNumber;
//             String[] targetNumberString = Integer.toString(targetNumber).split("");
//             int[] tempCreateNumber = new int[targetNumberString.length];
//             for (int i = 0; i < tempCreateNumber.length;)
//                 tempCreateNumber[i++] = 0;

//             for (int j = 0; j < targetNumberString.length; j++) {

//                 for (int i = 0; i < remoteController.size(); i++) {
//                     System.out.println("현재 탐색 i : "+i+ " "+remoteController.get(i));
//                     String checker = Integer.toString(remoteController.get(i));
//                     if (min > Math.abs(Integer.parseInt(targetNumberString[j]) - remoteController.get(i))) {
                    
//                         min = Math.abs(Integer.parseInt(targetNumberString[j]) - remoteController.get(i));
//                         System.out.println("최소 : "+min+" 값 "+remoteController.get(i));
//                         tempCreateNumber[j] = remoteController.get(i);

//                     } else if (targetNumberString[j].equals(checker)) {
//                         tempCreateNumber[j] = remoteController.get(i);
//                     } 
//                 }

//             }

//             for (int a : tempCreateNumber)
//                 System.out.print(a);
//         } else {
//             System.out.println("0");
//         }
//     }

// }
