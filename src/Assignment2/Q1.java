package Assignment2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayList arr=new arrayList();
		arr.input();
//		arr.checkEmpty();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter element to find in the Set");
		int ele=s.nextInt();
//		s.close();
		arr.find(ele);
		}
	}


