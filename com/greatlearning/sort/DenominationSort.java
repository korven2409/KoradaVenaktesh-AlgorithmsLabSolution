package com.greatlearning.sort;
import java.util.Scanner;

public class DenominationSort {
	public void mergeSort(int denominations[],int lb, int ub)
	{
		int mid;
		if(lb<ub)
		{
			mid = (lb+ub)/2;
			mergeSort(denominations,lb,mid);
			mergeSort(denominations,mid+1,ub);
			merge(denominations,lb,mid,ub);
		}
	}
	public void merge(int denominations[],int l,int mid,int r)
	{
		int i,j,k;
		i=l;
		j=mid+1;
		k=l;
		int brr[] = new int [denominations.length];
		while(i<=mid && j<=r)
		{
			if(denominations[i]>=denominations[j])
			{
				brr[k] = denominations[i];
				i++;
			}
			else
			{
				brr[k] = denominations[j];
				j++;
			}
			k++;
		}
		if(i>mid)
		{
			while(j<=r)
			{
				brr[k] = denominations[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i<=mid)
			{
				brr[k] = denominations[i];
				i++;
				k++;
			}
		}
		for(int m=l;m<=r;m++)
		{
			denominations[m] = brr[m];
		}
	}
}
