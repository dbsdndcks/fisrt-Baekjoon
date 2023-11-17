package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10101 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[3];
		int num = 0;

		arr[0] = Integer.parseInt(br.readLine());
		arr[1] = Integer.parseInt(br.readLine());
		arr[2] = Integer.parseInt(br.readLine());
		

		
		
		if(arr[0] + arr[1] + arr[2] != 180) {
			System.out.println("Error");
		}else if(arr[0] + arr[1] + arr[2] == 180){
			if(arr[1] == arr[0]) {
				num++;
			}
			if(arr[0] == arr[2]) {
				num++;
			}
			if(arr[1] == arr[2]) {
				num++;
			}
			
			if(num == 3) {
				System.out.println("Equilateral");
			}else if(num == 1) {
				System.out.println("Isosceles");
			}else if(num == 0) {
				System.out.println("Scalene");
			}
		}
	}

}
