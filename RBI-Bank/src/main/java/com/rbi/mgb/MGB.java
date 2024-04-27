package com.rbi.mgb;

import java.util.*;

import org.springframework.stereotype.Component;
//@Component
public class MGB 
{
	Scanner sc =new Scanner(System.in);
	public  MGB()
	{
		
		System.out.println("Enter Amount-:");
		double a=sc.nextInt();
		System.out.println("Dear Customer Amount Has been Deposited By Self ");
		System.out.println("Your A/C XXXXX9576"+" Credited INR "+a);

	}
}
