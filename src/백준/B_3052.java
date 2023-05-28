package น้มุ;

import java.util.Arrays;
import java.util.Scanner;

public class B_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int[]num = new int[10];
		
		for(int i=0 ; i<num.length ; i++) {
			int A = sc.nextInt();
			num[i] = A%42;
		}
		Arrays.sort(num);
		for(int i=0 ; i<num.length-1 ; i++) {
			if(num[i] != num[i+1]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
