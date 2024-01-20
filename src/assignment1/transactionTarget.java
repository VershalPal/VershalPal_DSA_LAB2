package assignment1;
import java.util.Scanner;
public class transactionTarget
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the Number of Days shop was open for : ");
		int noOfDays=sc.nextInt();
		
		int revenue[]=new int[noOfDays];
		System.out.println("Please enter the Collection for each day : ");
		for( int i=0; i<revenue.length; i++ )
		{
			revenue[i]=sc.nextInt();
		}
		
		System.out.println("Please enter Number of Targets : ");
		int totaltargets=sc.nextInt();
		int sum;
		int flag;
		for( int i=1; i<=totaltargets; i++ )
		{
			sum=0;
			flag=0;
			System.out.println("\nPlease enter value of Target "+i+" :");
			int target=sc.nextInt();
			for( int j=0; j<revenue.length; j++ )
			{
				sum+=revenue[j];
				if(sum>=target)
				{
					System.out.println("Target Achieved on Day "+(j+1)+"\n");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Target Not Achieved");
			}
		}
	}
}