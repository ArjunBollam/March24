package com.cubic.assignment.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList123 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		Scanner sc= new Scanner(System.in);
		String quit="";
		do {
	     System.out.println("Enter the name");
	     al.add(sc.nextLine());
	     
	     Object[] ot=al.toArray();
	     for(Object o:ot){
	    	 if(al.indexOf(o)!=al.lastIndexOf(o)){
	    		 System.out.println("Already existed name");
	    		 al.remove(al.lastIndexOf(o));
	    	 }
	     
	     }
	     System.out.println("The name is...");
	     for (String n:al){
	    	 System.out.println(n);
	    	 
	     }
	     
	 System.out.println("Continue or not ?"); 
	 quit=sc.nextLine();
		}
		while(!quit.equals("n"));
		System.exit(0);
	 
	
	
	
	
	
	

	}

}
