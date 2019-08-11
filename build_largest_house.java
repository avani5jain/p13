import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int hn[]=new int[n];
	    int ln[]=new int[n];
	    int i,j,temp,diff=0,diff1=0,x=0,y=0;
	    for(i=0;i<n;i++)
	    { hn[i]=sc.nextInt();
	    ln[i]=sc.nextInt();
	    }
	    System.out.print("[");
	    for(i=0;i<n;i++)
	    {System.out.print("["+hn[i]+","+ln[i]+"]"+",");
	    }
	    System.out.print("]");
	    for(i=0;i<n;i++)
	    { for(j=i+1;j<n;j++)
	    { if(ln[i]>ln[j])
	    { temp=ln[i];
	    ln[i]=ln[j];
	    ln[j]=temp;
	    }
	    }
	    System.out.print(ln[i]+" ");
	    }
	    for(i=0;i<n-1;i++)
	    {
	    diff1=ln[i+1]-ln[i];
	    if(diff1>diff)
	    { diff=diff1;
	        x=i+1;
	        y=i;
	    }
	    }
	    
	    System.out.println("["+hn[x]+","+hn[y]+"]");
	    
	    
	    
		
	}
}
