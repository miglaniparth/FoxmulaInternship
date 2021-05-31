package Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
	static void pair(ArrayList<Integer> arr, int k) {
		for(int i=0;i<arr.size();i++) {
			for(int j=0;j<arr.size();j++) {
				if(i==j)
					continue;
				if(arr.get(i)+arr.get(j)==k) {
					System.out.println(arr.get(i)+" + "+arr.get(j)+" = "+k);
				}
			}
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
		System.out.println("Enetr Sum 'k'");
		int k=s.nextInt();
		pair(arr,k);
	}

}
