package com.rbi.sbi;
import java.util.*;

import org.springframework.stereotype.Component;
@Component
public class sbi 
{
	Scanner sc =new Scanner(System.in);
	public sbi()
	{
		System.out.println("Enter Holder Name :-");
		String b=sc.nextLine();
		
		System.out.println("Enter Acount No :-");
		int a= sc.nextInt()	;
		
		
		
		System.out.println("Enter Amount :-");
		int c=sc.nextInt();
		
		System.out.println("------Transaction Sucessfull Check the Below Deatils-------");
		System.out.println("Acount no XXXX0"+a);
		System.out.println("Acount Hodler Name:-"+b);
		System.out.println("Acount Tranferd By you "+c);
		
		
	}
}
