// package basicMathEx2;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;
// import java.util.StringTokenizer;

// public class N8_LastRectanglePoint {
    
// 	public static void main(String[] args) throws IOException {
		
// 		List<Integer> a = new ArrayList<>();
// 		List<Integer> b = new ArrayList<>();
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		for(int i =0;i<3;i++) {
// 			StringTokenizer st = new StringTokenizer(br.readLine());
// 			int x = Integer.parseInt(st.nextToken());
// 			int y = Integer.parseInt(st.nextToken());
// 			a.add(x);
// 			b.add(y);
			
// 			if(Collections.frequency(a, x)>=2) {
//                 System.out.println(a);
// 				a.removeAll(Arrays.asList(x));
// 			}
// 			if(Collections.frequency(b, y)>=2) {
//                 System.out.println(b);
//                 b.removeAll(Arrays.asList(y));
// 			}
// 		}
//         br.close();
// 		System.out.printf("%d %d",a.get(0),b.get(0));
// 	}
// }