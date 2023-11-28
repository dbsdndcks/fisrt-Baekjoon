package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer>stack = new Stack<Integer>();
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				sum -= stack.pop();
			}else {
				sum += stack.push(num);
			}
		}
		System.out.println(sum);
	}

}
