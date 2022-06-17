package Array;
import java.util.*;

public class ArrayRotation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,i,j,k,temp,l;
		n= sc.nextInt();
		int[] arr = new int[n];
		k=sc.nextInt();
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();	
		}
		k=n/k;
		for(i=0;i<n;i++)
		{
			while(k!=0)
			{
				int last = arr[n-1];
				for(j=n-2;j>=0;j--)
				{
					arr[j+1]=arr[j];
				}
				arr[0]=last;
				k--;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");	
		}
		
		
		
	}

}
