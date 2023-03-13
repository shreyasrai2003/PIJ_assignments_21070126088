/*
Name: Shreyas Rai
PRN: 21070126088
Batch: AIML B1

OS: Mac OS 12 Monterey
java Version: 19.0.1 2022-10-18
Java(TM) SE Runtime Environment (build 19.0.1+10-21)
Java HotSpot(TM) 64-Bit Server VM (build 19.0.1+10-21, mixed mode, sharing)
*/

import java.lang.*;
import java.util.Scanner;
//Importing required class packages

class Sort
{
	Scanner sc = new Scanner(System.in);
	//Creating Scanner class object

	public int[][] sorter()
	//defining sorter method that sorts the input array into two arrays: even and odd.
	//and then returns them and their size in a two dimensional array
	{
		System.out.println("Enter number of elements to Sort:\n");
		int n = sc.nextInt();
		//Taking input of no. of elements to sort

		int[] even_arr = new int[n];
		int[] odd_arr = new int[n];
		//declaring even and odd array for sorting input array

		int even, odd;
		even = odd = 0;
		//declaring count variables to count no. of elements in sorted arrays

		for (int i = 0; i < n; i ++ )
		//sorting loop
		{
			System.out.println("Enter data:");
			int data = sc.nextInt();
			//taking data input
			
			if (data % 2 == 0)
			//sorting into even and odd array based on remainder when divided by 2
			{
				even_arr[even] = data;
				even ++ ;
			}
			else
			{
				odd_arr[odd] = data;
				odd ++ ;
			}
		}

		int [][]arr = {even_arr, odd_arr, {even, odd}};
		//creating two dimensional arrays as we cannot return multiple arrays

		return arr;
	}
}