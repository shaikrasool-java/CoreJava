import java.io.*;
import java.util.*;
class abcd
{
	static PrintWriter out=new PrintWriter(System.out);
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[]) throws Exception
	{
		int n=sc.nextInt(),mindiff=101,minelem=101;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(Math.abs(a[i])<mindiff)
			{
				mindiff=Math.abs(a[i]);
				minelem=a[i];
			}
			else if(Math.abs(a[i])==mindiff)
			{
				if(a[i]>minelem)
				{
					minelem=a[i];
				}
			}
		}
		out.println(minelem);
		out.close();
	}
}