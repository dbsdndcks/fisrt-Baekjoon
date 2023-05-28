package น้มุ;

import java.util.Scanner;

public class B_10810 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int temp = 0;
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[]buket = new int[N];
		for(int i=0 ; i<buket.length ; i++) {
			buket[i] = i+1;
		}
		
		for(int i=0 ; i<M ; i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			temp = buket[j-1];
			buket[j-1] = buket[k-1];
			buket[k-1] = temp;
		}
		for(int i=0 ; i<buket.length ; i++) {
			System.out.print(buket[i] + " ");
		}
	}

}
