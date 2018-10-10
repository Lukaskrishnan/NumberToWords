package com.nissan.NumberToWords;
import java.util.Scanner;

public class NumberToWords
{
	static String result;
	public static String findWord(int a)
	{   
		result="";
		pw((a / 10000000) % 100, " crore");
		pw(((a / 100000) % 100), " lakh");
		pw(((a / 1000) % 100), " thousand");
		pw(((a / 100) % 10), " Hundred");
		pw((a % 100), " ");
		//System.out.println(result);
		return result.trim();
	}
 
	public static void pw(int n, String ch)
	{
		
		String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
				" Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
				" Nineteen" };
 
		String ten[] = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety" };
 
		if (n > 19)
		{
			result=result+ten[n/10]+ " " + one[n % 10];
			System.out.print(ten[n / 10] + " " + one[n % 10]);
		}
		else
		{
			result=result+one[n];
			System.out.print(one[n]);
		}
		if (n > 0)
		{
			System.out.print(ch);
			result=result+ch;
		}
		
	}
 
	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		int n=2801;
		//System.out.println("enter the number");
		//n=S.nextInt();S.nextLine();
		System.out.print(n);
		NumberToWords obj=new NumberToWords();
		obj.findWord(n);
	}
}