import java.util.*;
import java.lang.*;
import java.io.*;

// Problem link: https://www.codechef.com/practice/course/strings/STRINGS/problems/DIFFCONSEC
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{try{
	    Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		while(total>=0)
		{   total--;
		

		   int n=sc.nextInt();
		   String str=sc.next();
		   int noOfOperation=0;
		   
		   
		 
		      for(int i=0;i<n;i++)
		      {
		          int nextIndex=i+1;
		          
		          if(nextIndex>=n)
		          {
		              break;
		          }
		          
		          
		       if(str.charAt(i)==str.charAt(i+1))
		       {
		           noOfOperation++;
		       }
		      }
		   
		   
	
		   System.out.println(noOfOperation);
		}
	}catch(Exception e)
	{
	 
	    return;
	}
	}
}
