package Assignment2;

import java.util.*;
import java.util.Scanner;

public class Q2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashSet arr=new hashSet();
		arr.input();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter element to find in the Set");
		int ele=s.nextInt();
//		s.close();
		arr.find(ele);
		}
	}


