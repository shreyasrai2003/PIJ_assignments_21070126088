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

class Output
{
	void printSortedArrays(int[][] arr)
	//creating a method to read sorted arrays from the returned 2 dim array of the sorter method of Sort class
	//and then to print the Sorted Arrays
	{
		int[] even_arr = arr[0];
		int[] odd_arr = arr[1];
		int even = arr[2][0];
		int odd = arr[2][1];
		//reading sorted arrays and their count variables 
		//from the returned 2 dimensional array of Sort class's sorter method.

		System.out.println("Even Array:");
		//printing even array
		for (int k = 0; k < even; k++ )
		{
			System.out.print(even_arr[k] + " ");
		}
		System.out.println("");

		System.out.println("Odd Array:");
		//printing odd array
		for (int k = 0; k < odd; k++ )
		{
			System.out.print(odd_arr[k] + " ");
		}
		System.out.println("");
	}
}