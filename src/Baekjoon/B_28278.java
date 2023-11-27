package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_28278 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<Integer>();
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            		
            // 명령이 1일때
            if (order == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
                
            // 명령이 2일때
            } else if (order == 2) {
                if (stack.isEmpty()) {;
                    sb.append("-1").append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
                
            // 명령이 3일 때
            } else if (order == 3) {
            	sb.append(stack.size()).append("\n");
          
            // 명령이 4일 때
            } else if (order == 4) {
                if (stack.isEmpty()) {
                	sb.append("1").append("\n");
                } else {
                	sb.append("0").append("\n");
                }
                
            // 명령이  5일 때
            } else if (order == 5) {
                if (!stack.isEmpty()) {
                	sb.append(stack.peek()).append("\n");
                }else {
                    sb.append("-1").append("\n");

                }
            }
        }
        
        System.out.println(sb);
    }
}
