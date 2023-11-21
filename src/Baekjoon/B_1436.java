package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1436 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int N = Integer.parseInt(br.readLine());
		int devil = 666;
		int count = 0;
		
		while(true) {
			if(String.valueOf(devil).contains("666")) {
				count++;
			}
			if(count == N) {
				System.out.println(devil);
				break;				
			}
			devil++;
		}
	}	
}
