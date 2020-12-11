/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
        int temp = 1;
        int power=1;
        while(temp<n){
            temp = (int)Math.pow(2,power);
            power++;
        }
        System.out.println(power-1);
	}
}
