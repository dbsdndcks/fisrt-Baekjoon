package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_9506 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			int sum = 0;
			int count = 0;
			int n = Integer.parseInt(br.readLine());
			String arr[] = new String[n+1];
			StringBuilder sb = new StringBuilder();
			if(n == -1) {
				break;
			}
			for(int i=1 ; i<n ; i++) {
				if(n % i == 0) {
					arr[count] = String.valueOf(i);
					count++;
				}
			}
			
			for(int i=0; i<count; i++) {
				sum += Integer.parseInt(arr[i]);
				if(i < count-1) {
					sb.append(arr[i]).append(" + ");
				}else {
					sb.append(arr[i]);
				}
				
			}
			if(n == sum) {
				System.out.println(n + " = " + sb);
			}else {
				System.out.println(n + " is NOT perfect.");
			}
			
			
		}
			
	}

}
