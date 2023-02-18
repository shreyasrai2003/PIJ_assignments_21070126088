import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//OR java.io.*;

import java.util.Scanner;

import java.lang.Math;

class UserInput
{
	Scanner sc = new Scanner(System.in);

	//Function to print the array elements of array passed as parameter
	void printArray(float a[], int n)
	{
		for (int i = 0; i < n; i ++ )
		{
			System.out.print(a[i] + " ");
		}	
		System.out.println("");
	}

	//Function to take input of specified no. of elements.
	float[] inputMultipleNumbers(int n)
	{
		float arr[] = new float[n];
		//Defining Array
		

		for (int i = 0;i < n; i ++ )
		{
			System.out.println("Enter Element " + (i + 1) + ": ");
			arr[i] = sc.nextFloat();
		}
		//Array Elements Input from User

		return arr;
		//Returning the user Input array
	}

}