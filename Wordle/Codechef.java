/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{try{
	    Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
	
		while(total>=0)
		{   total--;
		    
		    String realStr=sc.next();
		    String guess=sc.next();
		    String finalStr="";
	
		    
		    for(int i=0;i<realStr.length();i++)
		    {
		        if(realStr.charAt(i)==guess.charAt(i))
		        {
		            finalStr=finalStr+"G";
		        }else{
		               finalStr=finalStr+"B";
		        }
		    }
		  
		    System.out.println(finalStr);
		}
	}catch(Exception e)
	{
	    return;
	}
	}
}
