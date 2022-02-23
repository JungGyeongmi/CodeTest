package basicMathEx2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex3009 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // List<String> list = new ArrayList<>();
        int[] xCoordinate = new int [3];
        int[] yCoordinate = new int [3];
        int x = 0;
        int y = 0;
        int idx = 0;
        for(int i = 0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            xCoordinate[idx] = x;
            yCoordinate[idx] = y;
            idx++;
        }

        Arrays.sort(xCoordinate);
        Arrays.sort(yCoordinate);
        
        // for(int i : xCoordinate) System.out.println(i);

        for(int i=0; i<xCoordinate.length; i++) {
            for(int j=i+1; j<xCoordinate.length; j++){
                // System.out.println(i+" "+j);

                if(xCoordinate[i] == xCoordinate[j]){
                    System.out.println(i+" "+j);
                    x = i+j;
                 
                }

                if(yCoordinate[i] == yCoordinate[j]){
                    System.out.println(i+" "+j);
                    y = i+j;
                 
                }

            }
        }

        x = x==3?0:x==2?1:2;
        y = y==3?0:y==2?1:2;

        System.out.println(xCoordinate[x]+" "+yCoordinate[y]);
        
        




        // for(int i = 0; i<3; i++){
        //     StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //     list.add(st.nextToken());
        //     list.add(st.nextToken());
        // }

        // // HashMap<String, Integer> hm = new HashMap<>();
        // String temp = "";
        // String temp2 = "";
        // int idx = 0;
        // String [] test = new String[3];
        // for(int i = 0; i < 6; i+=2) {
        //     // System.out.println(list.get(i));
        //     test[idx] = list.get(i);
        //     idx++;
        // }

        // for(int i = 0; i<test.length; i++){
           
        //     for(int j = i+1; j<test.length; j++) {
        //         // System.out.println(i+" "+j);
        //         if(test[i].equals(test[j])){
        //            temp = test[i];
        //            System.out.println(temp);
        //         }
        //         if(!test[i].equals(test[j])){
        //             temp2 = test[j];
        //             System.out.println(temp2);
        //          }
        //     }
        // }


        // for(int i = 1; i < 6; i+=2) {
        //     System.out.println(list.get(i));          
        // }

        // equal일때 add해주고 counting해준다음에 hash에 저장하고 counting되어있지 않은 녀석을 뽑아줌?
        // 으으으으으!!!!!!!!!
    }
}
