package Assignment2;

import java.util.*;

public class Q5 {
	
	static void occurances(ArrayList<Integer> arr) {
		HashSet<Integer> uniqueElements=new HashSet<Integer>();
		for(int element:arr)
			uniqueElements.add(element);
		Iterator itr=uniqueElements.iterator();
		for(int element:uniqueElements) {
			int occurances =0;
			for(int item:arr) {
				if(item==element)
					occurances++;
			}
			System.out.print("Element : "+element+"\nOccurances : "+occurances+" \n\n");
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
		occurances(arr);
	}

}
