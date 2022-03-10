package sortEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Ex1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> stringSet = new HashSet<>();
        
        for(int i = 0; i < N; i++){ stringSet.add(br.readLine()); }

        stringSet.stream().sorted(new Example()).forEach(System.out::println);
        
        br.close();
    }

}

class Example implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        
        if(s1.length()!=s2.length()) {
            return s1.length()-s2.length();
        } else {
            return s1.compareTo(s2);
        }
    }
}
