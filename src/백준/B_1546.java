package น้มุ;

import java.util.Arrays;
import java.util.Scanner;

public class B_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		int num1 = sc.nextInt();
		int[]arr = new int[num1];
		
		for(int i=0 ; i<arr.length ; i++) {
			int num2 = sc.nextInt();
			arr[i] = num2;
		}
	
		Arrays.sort(arr);
		for(int i=0 ; i<arr.length ; i++) {
			total += arr[i];
		}
		
		double avg = total*100.0/arr[num1-1]/num1;
		
		System.out.println(avg);
		
		
		
	}

}
