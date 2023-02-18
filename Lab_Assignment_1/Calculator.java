import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//OR java.io.*;

import java.util.Scanner;

import java.lang.Math;

class Calculator //extends UserInput
{
	Scanner sc = new Scanner(System.in);

	//Below are Function Definitions of the Operations that user can perform

	float add(float arr[], int n)
	{
		float summ;
		summ = 0;

		for (int i = 0; i < n; i ++ )
		{
			summ += arr[i];
		}

		return summ;
	}

	float sub(float arr[], int n)
	{
		float diff = 0;

		for (int i = 0; i < n; i ++ )
		{
			if (i % 2 == 0)
			{
				diff += arr[i];
			}
			else
			{
				diff -= arr[i];
			}
		}

		return diff;
	}	

	float multi(float arr[], int n)
	{
		float prod = 1;

		for (int i = 0; i < n; i ++ )
		{
			prod *= arr[i];
		}

		return prod;
	}

	float div(float arr[], int n, float divisor)
	{
		float quo,summ;
		summ = 0;

		for (int i = 0; i < n; i ++ )
		{
			summ += arr[i];
		}

		quo = summ / divisor;

		return quo;
	}

	double sqr(float arr[], int n)
	{
		float summ;
		double sqr;
		summ = 0;

		for (int i = 0; i < n; i ++ )
		{
			summ += arr[i];
		}

		sqr = Math.sqrt(summ);

		return sqr;
	}	

	double pow(float arr[], int n, float power)
	{
		float summ;
		summ = 0;

		for (int i = 0; i < n; i ++ )
		{
			summ += arr[i];
		}

		double value = Math.pow(summ, power);

		return value;
	}

	float mean(float arr[], int n)
	{
		float summ;
		summ = 0;

		for (int i = 0; i < n; i ++ )
		{
			summ += arr[i];
		}

		float avg = summ / n;

		return avg;
	}

	float vari(float arr[], int n)
	{
		float summ = 0;

		for (int i = 0; i < n; i ++ )
		{
			summ += arr[i];
		}

		float avg = summ / n;

		float sum_ofsqr = 0;

		for (int i = 0; i < n; i ++ )
		{
			sum_ofsqr += Math.pow(arr[i] - avg, 2);
		}

		float variance = sum_ofsqr / n;

		return variance;
	}

}