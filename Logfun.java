/**
 * 
 */

package logFunction;

import java.util.Scanner;

/**
 * @author Manikandan Shanmugam
 *
 */
public class Logfun {
	
	private static Scanner s1;
	private static Scanner s2;
	
	/** 
	* This is a program for calculating base logarithmic functions. 
	    * @param args 
	*/

	static int logCalculate(double x,double base) {					//calculating log value
		double d = x/base;

		return(x>base-1)?1+logCalculate(d,base) : 0;

	}
	
	static double validateX() {
		//validating the (X) input value to be a positive real number
		s1 = new Scanner(System.in);
		System.out.println("\nEnter the value of (X):");
		String st = s1.next();
		String sd = st;
		String comp = "(^[1-9][0-9]*.?[0-9]*$)";
		double x = 0;
		boolean a = st.matches(comp);								//validating for a number not equal to 0
		if(a==false) {
			System.out.println("Incorrect X value. Please provide a positive real number greater than 0\n");
			double xt=validateX();
			return xt;
		}	
		try {														//Exception handling
			Double.parseDouble(st);
		}
		catch(NumberFormatException e) {
			System.out.println("Incorrect X value. Please provide a positive real number greater than 0\n");
			double xt=validateX();
			return xt;
		}
		x = Double.parseDouble(sd);
		return x;
	}
	
	static double validateBase() {
		//validating the base input value to be a positive real number
		double base = 0;
		s2 = new Scanner(System.in);
		System.out.println("\nEnter the value of base:");
		String st1 = s2.next();
		String sd = st1;
		if(st1.equalsIgnoreCase("1")) {								//base not equal to 1
			System.out.println("Incorrect base value. Please provide a positive real number except 1\n");
			double b=validateBase();
			return b;
		}
		String comp = "(^[1-9][0-9]*.?[0-9]*$)";
		boolean d = st1.matches(comp);								//validating for a number not equal to 0
		if(d==false) {
			System.out.println("Incorrect base value. Please provide a positive real number greater than 0\n");
			double b=validateBase();
			return b;
		}
		try {														//Exception handling
			Double.parseDouble(st1);
		}
		catch(NumberFormatException e) {
			System.out.println("Incorrect base value. Please provide a positive real number\n");
			double b=validateBase();
			return b;
		}
		base = Double.parseDouble(sd);
		return base;
	}

	static int floorCeil(double s,double x,double base) {			//checking if ceiling/flooring values exists
		if(x==1) {
			return 0;
		}
		else if(s==0) {
			double b1=base;
			double s1=s+1;
			for(int v=1;v<=s1;v++) {
				base=base*b1;
			}
			if(base<x) {
				return 1;
			}
			else if(base>x) {
				return 1;
			}
		}
		else {
			double b1=base;
			for(int v=1;v<s;v++) {
				base=base*b1;
			}
			if(base<x) {
				return 1;
			}
			else if(base>x) {
				return 2;
			}
			else {
				return 0;												//no flooring/ceiling values exists
			}
		}
		return -1;
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		// Main method which controls the execution flow
		double base = validateBase();								//validating the base value
		double x = validateX();										//validating the X value
		double s = logCalculate(x,base);							//calculating the log value
		int q = 0;
		q = floorCeil(s,x,base);									//checking for flooring and ceiling value
		if(q==1) {
			System.out.println("\nFlooring value of base "+base+" logarithm of ("+x+") is " + String.format("%.2f", s));
			s=s+1;
			System.out.println("\nCeiling value of base "+base+" logarithm of ("+x+") is " + String.format("%.2f", s));
		}
		else if(q==2) {
			System.out.println("\nCeiling value of base "+base+" logarithm of ("+x+") is " + String.format("%.2f", s));
			s=s-1;
			System.out.println("\nFlooring value of base "+base+" logarithm of ("+x+") is " + String.format("%.2f", s));
		}
		else {
			System.out.printf("\nValue of base "+base+" logarithm of ("+x+") is " + String.format("%.2f", s));
		}
	}

}
