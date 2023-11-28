package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_9012 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            Stack<String> stack = new Stack<String>();
            String input = br.readLine().trim(); // trim()을 추가하여 문자열 양 끝의 공백을 제거

            for (int j = 0; j < input.length(); j++) {
                String currentChar = input.substring(j, j + 1);

                if (currentChar.equals("(")) {
                    stack.push("(");
                } else {
                    if (stack.isEmpty()) {
                        System.out.println("NO");
                        break;
                    } else {
                        stack.pop();
                    }
                }

                // 문자열의 끝까지 처리했을 때
                if (j == input.length() - 1) {
                    if (!stack.isEmpty()) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }
}