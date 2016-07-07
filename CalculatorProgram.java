/* package codechef; // don't place package name! */

import java.util.*;
import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class MathsClass
{
    public void add(int a, int b)
    {
        System.out.println("Sum is: "+(a+b));
    
    }
    
    public void subtract(int a, int b)
    {
        System.out.println("Subtraction is: "+(a-b));
    
    }
    
    public void multiply(int a, int b)
    {
        System.out.println("Multiplication is: "+(a*b));
    
    }
    
    public void divide(int a, int b)
    {
        if(b==0){
            System.out.println("Denominator cannot be zero");
        }
        else
            System.out.println("Division is: "+(a/b));
    
    }
}


class CalculatorProgram
{
//	public int a;
//	public int b;
	
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	char op = sc.next().charAt(0);
	MathsClass m = new MathsClass();
	
	while( true)
	{
	    if(op == '+') break;
	    if(op == '-') break;
	    if(op == '/') break;
	    if(op == '*') break;
	    op = sc.next().charAt(0);
	}
	
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	switch(op)
	{
	    case '+':
	        
	        m.add(a,b);
	        break;    
	    case '-':
	        m.subtract(a,b);
	        break;
	    case '*':
	        m.multiply(a,b);
	        break;
	    case '/':
	        m.divide(a,b);
	        
	}
	

	}
	
}
