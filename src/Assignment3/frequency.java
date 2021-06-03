package Assignment3;

import java.util.*;

class node implements Comparable<node>{
	
	private int element,frequency;
	
	int getFrequency() {
		return this.frequency;
	}
	
	int getElement() {
		return this.element;
	}
	
	void setFrequency(int freq) {
		this.frequency=freq;
	}
	
	void setElement(int ele) {
		this.element=ele;
	}
	
   public int compareTo(node obj2) {
        int freq2=obj2.getFrequency();
        
        return this.frequency-freq2;
    }

}

class frequency{
	ArrayList<Integer> arr=new ArrayList<Integer>();
	ArrayList<node> distinct= new ArrayList<node>();
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
//		System.out.print(arr);
	}
	
	void calcFrequency() {
		HashSet<Integer> hash=new HashSet<Integer>();
		for(int i:arr) {
			hash.add(i);
		}
//		System.out.print(hash);
		for(int i:hash) {
			node obj = new node();
			obj.setElement(i);
			obj.setFrequency(0);
			for(int j: arr) {
				if(i==j)
					obj.setFrequency(obj.getFrequency()+1);
			}
			distinct.add(obj);
		}
//		for(node item:distinct)
//			System.out.println("\n"+item.element+"Freq: "+item.frequency);
	}

	void objSort() {
		Collections.sort(distinct);
		for(node item: distinct)
		System.out.println("Element : "+item.getElement()+"  Frequency : "+item.getFrequency()+"\n");
		}
	}
