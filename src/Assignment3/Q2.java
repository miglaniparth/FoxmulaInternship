package Assignment3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("Enter a number\n");
		
		int n= s.nextInt();
		
		number obj=new number(n);
		obj.checkNumber();
		
		s.close();

	}

}
