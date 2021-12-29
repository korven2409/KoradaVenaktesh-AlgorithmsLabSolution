package ProgramSolution;
import java.util.Scanner;
public class Transaction 
{
	public static void main(String args[])
	{
		int i,size,target,target_val,flag=0,flag2=0,sum=0,no_of_transactions=0;
		System.out.println("Enter no.of transactions...");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int transactions[] = new int[size];
		System.out.println("Enter the values of transactions....");
		for(i=0;i<size;i++)
		{
			transactions[i] = sc.nextInt();
		}
		System.out.println("Enter the no.of targets...");
		target = sc.nextInt();
		while(flag!=target)
		{
			System.out.println("Enter the target value...");
			target_val = sc.nextInt();
			for(i=0;i<size;i++)
			{
				sum+=transactions[i];
				no_of_transactions+=1;
				if(sum>=target_val)
				{
					System.out.println("Target"+target_val+"is reached in "+no_of_transactions+"of transactions");
					flag2++;
					break;
				}
			}
			flag++;
			no_of_transactions=0;
			sum=0;
			if(flag2==0)
			{
				System.out.println("Target not reached..");
			}
		}
	}
}
