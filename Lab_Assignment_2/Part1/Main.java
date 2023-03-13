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

class Main
{
	public static void main(String args[])
	{
		Sort sort = new Sort();
		Output op = new Output();
		//creating objects of Sort and Output class

		int[][] arr = sort.sorter();
		//calling sorter method of Sort class using its object
		op.printSortedArrays(arr);
		//callin printSortedArrays method of Output class to print sorted arrays
	}
}

