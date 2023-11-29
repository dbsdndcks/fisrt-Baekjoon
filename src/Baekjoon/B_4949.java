package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String input = br.readLine();
            if(input.equals(".")) {
                break;
            }
            balanc(input);
        }
    }

    static void balanc(String input) {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if(c == '(' || c == '[') {
                stack.push(c);
            } else if(c == ')') {
                if(stack.isEmpty() || stack.peek() != '(') {
                    System.out.println("no");
                    return;  // ���� �׽�Ʈ ���̽������� ��� ��� �� ���� �׽�Ʈ ���̽��� ����
                } else {
                    stack.pop();
                }
            } else if(c == ']') {
                if(stack.isEmpty() || stack.peek() != '[') {
                    System.out.println("no");
                    return;  // ���� �׽�Ʈ ���̽������� ��� ��� �� ���� �׽�Ʈ ���̽��� ����
                } else {
                    stack.pop();
                }
            }
        }

        if(!stack.isEmpty()) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
	
