package codeTestColl.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Tree {
    
    private static Map<String, String[]> treeMap = new HashMap<>();
    private static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        for(int i = 0; i < N; i++) {
            String[] nodeArray = br.readLine().split(" ");
            treeMap.put(nodeArray[0], nodeArray);
        }

        sb.append("A");
        frontFindNodeArr("A", 1);
        frontFindNodeArr("A", 2);
        sb.append("\n");
        
        middleFindNodeArr("A", 1);
        sb.append("A");
        middleFindNodeArr("A", 2);
        sb.append("\n");

        
        backFindNodeArr("A", 1);
        backFindNodeArr("A", 2);
        sb.append("A");
        
        System.out.println(sb.toString());
        // System.out.println("ECFG");

    }

    private static void frontFindNodeArr(String root, int side) {
        
        String[] node = treeMap.get(root);
        String rootNode = node[side];
        
        if(!rootNode.equals(".")) {
            
            frontFindNodeArr(rootNode, 1);
            frontFindNodeArr(rootNode, 2);
            sb.append(rootNode);
        }
        return;
    }

    private static void backFindNodeArr(String root, int side) {
        
        String[] node = treeMap.get(root);
        String rootNode = node[side];
        
        if(!rootNode.equals(".")) {
            
            frontFindNodeArr(rootNode, 1);
            frontFindNodeArr(rootNode, 2);
            sb.append(rootNode);
        }
        return;
    }

    private static void middleFindNodeArr(String root, int side) {
        
        String[] node = treeMap.get(root);
        String rootNode = node[side];

        System.out.println("root node : "+rootNode);
        
        if(rootNode.equals(".")) {
           return;
        }

        // frontFindNodeArr(rootNode, 1);
        frontFindNodeArr(rootNode, 2);
        sb.append(rootNode);
        
    }
}
