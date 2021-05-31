package Assignment2;

import java.util.*;
import java.util.Scanner;

public class Q1 {
	
	static void checkEmpty(ArrayList arr) {
		if(arr.size()==0)
			System.out.println("The ArrayList is empty");
		else {
			System.out.println("The ArrayList is not empty");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		String stop="stop";
		System.out.println("Enter the integer elements one by one for the ArrayList\n(To stop entering enter 'stop')");
		while(true) {
			String ele=s.nextLine();
			int element=0;
			int flag=0;
			if(ele.compareToIgnoreCase(stop)==0)
				break;
			try {
				String[] eles=ele.split(" ");
				for(String elem:eles) {
				if(elem.compareToIgnoreCase(stop)==0) {
					flag=1;
					break;
					}
				
				element=Integer.parseInt(elem);
				arr.add(element);
				}
				if(flag==1)
					break;

			}
			catch(NumberFormatException e) {
				System.out.println("Invalid Input!!\nEnter the integer elements one by one for the ArrayList\\n(To stop entering enter 'stop')");
				continue;
			}
			
			

		}
		checkEmpty(arr);
		
		
		}
	}


