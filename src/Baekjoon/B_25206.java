package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_25206 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = new String[20];
		double total = 0;
		double scoresum = 0;
	    String gradeList[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
	    double gradeScore[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
	    
	    for(int i=0 ; i<20 ; i++) {
	    	arr[i] = br.readLine();
	    	StringTokenizer st = new StringTokenizer(arr[i], " ");
	    	String subject = st.nextToken();
	    	double score = Double.parseDouble(st.nextToken());
	    	String grade = st.nextToken();
	    	
	    	for(int j=0 ; j<10 ; j++) {
	    		if(grade.equals(gradeList[j])) {
	    			total += score * gradeScore[j];
	    			if(j != 9) {
	    				scoresum += score;
	    			}
	    		}
	    	}
	    }
	    
	    double avr = total/scoresum;
	    System.out.printf("%.6f\n", avr);
	    br.close();
	}

}
