package Assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class arrayList {
	ArrayList<Integer> arr=new ArrayList<Integer>();
	
	void input() {
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
				this.arr.add(element);
				}
				if(flag==1)
					break;

			}
			catch(NumberFormatException e) {
				System.out.println("Invalid Input!!\nEnter the integer elements one by one for the ArrayList\\n(To stop entering enter 'stop')");
				continue;
			}
		}
//		s.close();
	}
	
	void checkEmpty() {
		if(this.arr.size()==0)
			System.out.println("The ArrayList is empty");
		else {
//			System.out.println("The ArrayList is not empty");
		}
	}
	
	void occurances() {
		this.checkEmpty();
		HashSet<Integer> uniqueElements=new HashSet<Integer>();
		for(int element:this.arr)
			uniqueElements.add(element);
		for(int element:uniqueElements) {
			int occurances =0;
			for(int item:this.arr) {
				if(item==element)
					occurances++;
			}
			System.out.print("Element : "+element+"\nOccurances : "+occurances+" \n\n");
		}
		
	}
	
	 void pair(int k) {
		 int count=0;
		for(int i=0;i<this.arr.size();i++) {
			for(int j=0;j<this.arr.size();j++) {
				if(i==j)
					continue;
				if(this.arr.get(i)+this.arr.get(j)==k) {
					System.out.println(this.arr.get(i)+" + "+this.arr.get(j)+" = "+k);
					count++;
				}
			}
		}
		if (count==0)
			System.out.print("Not Possible");
	}
	 
	 void find(int ele) {
			if(this.arr.contains(ele))
				System.out.println("element "+ele+" found in the ArrayList");
			else
				System.out.println("element "+ele+" not found in the ArrayList");

		}
	
	
	
}
