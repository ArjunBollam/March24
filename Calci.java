package com.cubic.Assignments;

import java.util.Scanner;

public class Calci {
	int a;
	int b;
	//int ans=1;
	void power(int a,int b) throws NegativeException{
		if (a<0 || b<0) {
			throw new NegativeException("a and b should be non-negative");
		}
			for (int i=1;i<=b;i++){
				if (b==0){
					 ans=1;
					 }
				else {
					ans=ans*a;
					}
				}
			System.out.println("The answer is " + ans);
			
		}
		
	public static void main(String[] args) throws NegativeException {
		Calci C=new Calci();
		System.out.println("Enter the base Number");
		Scanner base_number=new Scanner(System.in);
		int a=base_number.nextInt();
		System.out.println("Enter the power Number");
		Scanner power_number=new Scanner(System.in);
		int b=power_number.nextInt();
		C.power(a,b);

	}

}
