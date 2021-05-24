import java.util.*;
class FindingTheScoundLargestNumber
{
	public static void main(String[] args)
	{
		Scanner dc = new Scanner(System.in);
		int array[];
		int n;
		int temp;
		System.out.println("enter the array size: ");
		n = dc.nextInt();
		array = new int[n];
		for(int m=0;m<n;m++)
		{
			array[m]=dc.nextInt();
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
		for(int k=0;k<n;k++)
		{
			System.out.print(array[k]+" ");
		}
		for(int l=(n-1);l>-1;l--)
		{
			if(array[l]!=array[l-1])
			{
				System.out.println("the secound largest number is:"+array[l-1]);
				break;
			}
			else
				continue;
		  				
		}
		
	}
}