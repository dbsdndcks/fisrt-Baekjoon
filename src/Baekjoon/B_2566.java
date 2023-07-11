package Baekjoon;

import java.util.Scanner;

public class B_2566 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][]arr1 = new int[9][9];
		int maxNum = 0;
		int hang = 0;
		int yul = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				
				if(maxNum <= arr1[i][j]) {
					maxNum = arr1[i][j];
					hang = i+1;
					yul = j+1;
				}
				
			}
		}
		
		System.out.println(maxNum);
		System.out.println(hang + " " + yul);
		
		
	}

}
