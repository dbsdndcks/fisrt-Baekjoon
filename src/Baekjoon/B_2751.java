package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		for(int i =0; i < N; i++) {
			arr[i] = Math.abs(Integer.parseInt(br.readLine()));
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
	}

}
