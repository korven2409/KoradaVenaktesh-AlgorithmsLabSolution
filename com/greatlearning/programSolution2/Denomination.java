package com.greatlearning.programSolution2;
import java.util.Scanner;
import com.greatlearning.sort.DenominationSort;
public class Denomination {
	public static void main(String args[])
	{
		int i,length,cost,total=0,t=0;
		int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of denominations...");
		length = sc.nextInt();
		System.out.println("Enter the denominations...");
		int denominations[] = new int[length];
		for(i=0;i<length;i++)
		{
			denominations[i] = sc.nextInt();
		}
		System.out.println("Before sorting the denominations...");
		for(i=0;i<length;i++)
		{
			System.out.println(denominations[i]);
		}
		DenominationSort obj = new DenominationSort();
		obj.mergeSort(denominations, 0, denominations.length-1);
		System.out.println("After sorting the denominations...");
		for(i=0;i<length;i++)
		{
			System.out.println(denominations[i]);
		}
		System.out.println("Enter the total cost...");
		cost = sc.nextInt();
		while(cost!=0)
		{
			if(cost>=denominations[t])
			{
				cost = cost-denominations[t];
				n++;
			}
			else
			{
				System.out.println(denominations[t]+":"+n);
				t++;
				n=0;
			}
		}
		System.out.println(denominations[t]+":"+n);
//		System.out.println(cost);
	}
}
