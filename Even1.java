package com.cubic.assignment.demo;

public class Even1 extends Thread{
public void run(){
	System.out.println("Printing even numbers from 0 to 20....");
	for (int i=0; i<=20; i+=2){
		           
                 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
	System.out.println(i);
	}
}
	

}
