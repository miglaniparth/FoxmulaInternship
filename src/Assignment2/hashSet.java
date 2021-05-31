package Assignment2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class hashSet {
	HashSet<Integer> arr=new HashSet<Integer>();
	
	void input() {
		Scanner s=new Scanner(System.in);
		String stop="stop";
		System.out.println("Enter the integer elements one by one for the HashSet\n(To stop entering enter 'stop')");
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
				System.out.println("Invalid Input!!\nEnter the integer elements one by one for the HashSet\\n(To stop entering enter 'stop')");
				continue;
			}
		}
//		s.close();
	}
	
	 void checkEmpty() {
		if(this.arr.size()==0)
			System.out.println("The set is empty");
		else {
			System.out.println("The set is not empty");
		}
		
	}

	void traverse() {
		if(this.arr.size()==0)
			System.out.println("The set is empty");
		else {
			System.out.println("The elements present in the HashSet are:");
			Iterator<Integer> itr=this.arr.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next()+" ");
			}
		}
	}
	
	void find(int ele) {
		if(this.arr.contains(ele))
			System.out.println("element "+ele+" found in the set");
		else
			System.out.println("element "+ele+" not found in the set");
	}

}
