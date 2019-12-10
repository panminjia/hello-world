package perfectSquareDemo.java;

import java.util.Scanner;

public class perfectSquare {

	private int m;
	private int n = 1;
	private int j = 2;
	private int[] factor = new int[100];
    private int i = 2;
    private int a = 0;
    public void getFactor() {
    	System.out.println("Enter an inter m: ");
    	Scanner input = new Scanner(System.in);
    	m = input.nextInt();
    	for(i = 0;i<100;i++) {
    		factor[i] = 0;
    	}
    	a = m;
    	for(i = 2;m>1;i++) {
    		while(m%i==0) {
    			m = m/i;
    			j = i;
    			factor[j]++;
    		}
    	}
    	for(int k = 2;k <= j;k++) {
    		if(factor[k]%2!=0) {
    			n = n*k;
    		}
    	}
    }
    public void getResult() {
    	System.out.println("The smallest number n for m*n to be a square is " + n);
    	System.out.println("m*n is " + a*n);
    }

}
