package Assignment2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class treeSet {
	TreeSet<Integer> arr=new TreeSet<Integer>();
	
	void input() {
		Scanner s=new Scanner(System.in);
		String stop="stop";
		System.out.println("Enter the integer elements one by one for the TreeSet\n(To stop entering enter 'stop')");
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
				System.out.println("Invalid Input!!\nEnter the integer elements one by one for the TreeSet\\n(To stop entering enter 'stop')");
				continue;
			}

		}
		s.close();
	}
	void traverse() {
		if(this.arr.size()==0)
			System.out.println("The set is empty");
		else {
			Iterator<Integer> itr=this.arr.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next()+" ");
			}
		}
	}
}
