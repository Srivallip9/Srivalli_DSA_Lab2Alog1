package com.paymoney.driver;

import com.paymoney.services.*;

import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		TransactionServiceImpl transactionServiceImpl = new TransactionServiceImpl();
		
		System.out.println("Enter the size of the transaction array : ");
		
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the values of array : ");
		
		for(int i=0; i<size; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved : ");
		
		int targetNo = sc.nextInt();
				
		while(targetNo-- != 0)
		{
			System.out.println("Enter the value of the target : ");
			
			long targetValue =  sc.nextLong();
			
			transactionServiceImpl.search(arr,targetValue);
			
		}
		
	}

}
