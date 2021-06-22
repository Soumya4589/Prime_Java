package primeno;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// Prgm to check whether entered no is prime or not.
		int num;
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		num= s.nextInt();
		int flag=1;
		for(int i=2;i<=(num/2);i++) {
			if(num%i==0) {
				flag=0;
				break;
			}
			
		}
		if(flag==1)
			System.out.println(num+" is a Prime no.");
		else
			System.out.println(num+" not a Prime no.");

	}

}
