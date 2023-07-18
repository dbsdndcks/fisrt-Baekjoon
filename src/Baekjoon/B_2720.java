package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = {25,10,5,1};
		int T = Integer.parseInt(br.readLine());
		int money;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			money = Integer.parseInt(br.readLine());
			for(int j = 0; j < 4; j++) {
				if(money % arr[j] == 0) {
					sb.append(money / arr[j]).append(" ");
					for(int k = 3; k > j; k--) {
						sb.append(0).append(" ");
					}
					break;
				}else {
					sb.append(money / arr[j]).append(" ");
					money %= arr[j];
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		
	}

}
