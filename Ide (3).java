/* package codechef; // don't place package name! */
//Question 1

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
	
		int evensum =0;
		int oddsum = 0;
		int n=sc.nextInt();
	
		for(int i = 0 ; i<n; i++) {
		    int input = sc.nextInt();
		    if((i+1) % 2 == 0) {
		        evensum += input
		        
		    };
		    else {
		        oddsum += input
		        
		    };
		}
	    System.out.println(evensum-oddsum);
	}
}
