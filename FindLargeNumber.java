import java.util.*;
class FindLargeNumber
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int array[],n,temp;
		System.out.println("enter the array size: ");
		n = input.nextInt();
		array = new int[n];
		System.out.println("enter the array values: ");
		for(int i=0;i<n;i++)
		{
			array[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)  
		{  
			for (int j=0;j<(n-1);j++)  
			{  
				if(array[i]<array[j])
					{
						temp=array[i];
						array[i]=array[j];
						array[j]=temp;
				
					}
			}
		}
		System.out.println("The sorted array: ");
		for(int k=0;k<n;k++)
		{
			System.out.print(array[k]+" ");
		}
		System.out.println();
		System.out.println("the largest number is: "+array[n-1]);
		int count=0;
		for(int l=1;l<n;l++)
		{
			if(array[l]==array[l-1])
			{
				count++;
			}
			else
				continue;
		  				
		}
		System.out.println("number of times repeated: "+count+"times");	
	}
}