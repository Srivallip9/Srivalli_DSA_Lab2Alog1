package com.paymoney.services;

public class TransactionServiceImpl {
	
	public void search(int arr[],long targetValue)
	{
		long sum = 0;
		
		int acheived = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i];
			
			if(sum >= targetValue) 
			{
				System.out.println("Target achieved after " + (i+1) + " transactions");
				System.out.println(" ");
				acheived = 1;
				break;
			}
		}
		if(acheived == 0)
		{
			System.out.println("Target is not acheived");
		}

}
	
}

