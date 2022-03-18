package basicMathEx2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex11653 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> result = new ArrayList<>();
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());

        while(input != 1){
            for(int i =2; i<=input; i++) {
                if(input % i == 0 ){
                    input = input/i;
                    // bw.append(Integer.toString(i)+"\n");
                    result.add(i);
                    // System.out.println(i);
                    // System.out.println("나눠진 값"+input);
                    // System.out.println("나눈값"+i);
                    break;
                }
            }
        }

        result.stream().forEach(System.out::println);

        // result.stream().forEach(i->{
        //     try {
        //         bw.append(Integer.toString(i)+"\n");
        //     } catch (IOException e) { e.printStackTrace(); }
        // });
        br.close();
        // bw.flush();
        // bw.close();

    }
}
