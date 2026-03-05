/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
  
    public static void move1( Queue<Integer> q1)
    {
        int x=q1.remove();
		q1.add(x);
    }
    
    public static int move2( Queue<Integer> q1)
    {
      return q1.remove();
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{try{
	    Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		int i,j,k;
		int res;
		int r;
		int size;
		int sum;
		int m;
		while(total>=0)
		{   total--;
		   int n=sc.nextInt();
		   
		     Queue<Integer> q1=new LinkedList<>();
		     
		   for( i=0;i<n;i++)
		   {
		       k=sc.nextInt();
		      q1.add(k);
		   }
		   
		   boolean isAmanTurn=true;
		    while(q1.size()>1)
		    {
		        if(isAmanTurn)
		        {
		            move1(q1);
		            move2(q1);
		            
		            if(q1.size()==1)
		            {
		                break;
		            }
		            
		           isAmanTurn=false;
		        }
		        
		        
		        if(!isAmanTurn)
		        {
		             move1(q1);
		             move1(q1);
		             move2(q1);
		             
		            if(q1.size()==1)
		            {
		                break;
		            }
		           isAmanTurn=true;
		         }
		    }
		    
		    if(isAmanTurn)
		    {
		        System.out.println("1 "+q1.remove());
		    }else{
		        System.out.println("0 "+q1.remove());
		    }
		}
	}catch(Exception e)
	{
	    return;
	}
	}
	}

