package น้มุ;

import java.util.Arrays;
import java.util.Scanner;

public class B_5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
	
		int[]st = new int[30];
		
		for(int i=0 ; i<st.length ; i++) {
			st[i] = i+1;
		}
		
		for(int i=0 ; i<st.length-2 ; i++) {
			int num = sc.nextInt();
			st[num-1] = 0;
		}
		
		for(int i=0 ; i<st.length ; i++) {
			if(st[i] != 0) {
				System.out.println(st[i]);
			}
		}
	}

}
