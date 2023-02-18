/*
Name: Shreyas Rai
PRN: 21070126088
Batch: AIML B1

OS: Mac OS 12 Monterey
java Version: 19.0.1 2022-10-18
Java(TM) SE Runtime Environment (build 19.0.1+10-21)
Java HotSpot(TM) 64-Bit Server VM (build 19.0.1+10-21, mixed mode, sharing)
*/

//Importing all necessary Libraries/packages and Classes needed for our code
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//OR java.io.*;

import java.util.Scanner;

import java.lang.Math;

class Main //extends Calculator
{
	public static void main(String[] args) throws IOException
	{
		UserInput io = new UserInput();
		Calculator calc = new Calculator();
		/* 
		Creating objects of the user-defined classes 'UserInput' & 'Calculator'
		so we can access their methods and attributes
		*/

		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Creating objects of the Scanner and BufferedReader class so we can take input from User

		int perform = 1;
		/*
		do-while loop variable that decides whether more functions 
		will be performed or not based on User Input
		*/
		
		//do-while loop to perform operations as per need of the user
		do
		{
			System.out.println("Choose Operation to Perform... ");
			System.out.println("Menu:\n1.Add\n2.Subtract\n3.Multiply");
			System.out.println("4.Divide\n5.SquareRoot\n6.Power\n7.Mean");
			System.out.println("8.Variance\n");
			/*
			Creating a Menu driven Program for the user to select an Operation to 
			perform from the Calculator Class and taking input into a variable 
			so we can call that function using Switch Case
			*/

			System.out.println("Enter Choice: ");
			int ch = sc.nextInt();
			//Taking Input for function to be perform

			int n;

			float arr[];

			if(ch == 4 || ch == 5 || ch == 6)
			{
				n = 1;
				/*
				the divisor function requires just one dividend, power requires just one base, 
				sqrt requires just one square no. hence only 1 element is needed & therefore n = 1
				*/

				arr = io.inputMultipleNumbers(n);
				//Function Call using object of UserInput class to take User Input of elements
			}
			else if(ch == 7 || ch == 8)
			{
				System.out.println("Enter no. of Elements: ");
				n = sc.nextInt();
				//Taking No. of elements as input that user will enter to define size of the Input Array(arr)
				//User gets to decide no. of elements to input for Mean and Variance Operations

				arr = io.inputMultipleNumbers(n);
			}
			else
			{
				n = 2;
				//Basic Operations like addition, subtraction, multiplication require only 2 elements

				arr = io.inputMultipleNumbers(n);
			}

			//obj.printArray(arr, n);
			//Used for testing whether the Given Input Operation was performed Correctly or not

			/*
			Switch Case Below to perform specified Operation with respective operations
			called using object of the Calculator class's object
			*/
			switch(ch)
			{
				case 1:
					{
						System.out.println(calc.add(arr, n));
						break;
					}

				case 2:
					{
						System.out.println(calc.sub(arr, n));
						break;
					}

				case 3:
					{
						System.out.println(calc.multi(arr, n));
						break;
					}

				case 4:
					{
						System.out.println("Enter Divisor: ");
						float divisor = sc.nextFloat();
						System.out.println(calc.div(arr, n, divisor));
						break;
					}

				case 5:
					{
						System.out.println(calc.sqr(arr, n));
						break;
					}

				case 6:
					{
						System.out.println("Enter Power: ");
						float power = sc.nextFloat();
						System.out.println(calc.pow(arr, n, power));
						break;
					}

				case 7:
					{
						System.out.println(calc.mean(arr, n));
						break;
					}

				case 8:
					{
						System.out.println(calc.vari(arr, n));
						break;
					}

				default:
					{
					}
			}

			System.out.println("Perform more Operations(yes - 1, no - 0) ?");
			perform = sc.nextInt();
		}
		while(perform == 1);
	}
}