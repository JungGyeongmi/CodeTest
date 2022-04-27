// package codeTestColl.bruteForce;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.List;

// public class Ex2309 {
//     public static void main(String[] args) throws IOException {

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         List<Integer> noums = new ArrayList<>();
//         for (int i = 0; i < 9; i++)
//             noums.add(Integer.parseInt(br.readLine()));

//         int needNum = noums.stream().mapToInt(i -> i).sum() - 100;
//         for (int i = 0; i < noums.size(); i++) {
//             for (int j = i + 1; j < noums.size(); j++) {
//                 int result = noums.get(i) + noums.get(j);
//                 if (result == needNum) {
//                     Integer inum = noums.get(i);
//                     Integer jnum = noums.get(j);
//                     noums.remove(inum);
//                     noums.remove(jnum);
//                     noums.stream().sorted().forEach(System.out::println);
//                     return;
//                 }
//             }
//         }
//     }
// }
