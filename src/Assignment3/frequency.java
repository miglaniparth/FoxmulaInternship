package Assignment3;

import java.util.*;

class node implements Comparable<node>{
	
	int element,frequency;
	int getFrequency() {
		return this.frequency;
	}
	
    public int compareTo(node comparestu) {
        int compareage=((node)comparestu).getFrequency();
        
        return this.frequency-compareage;
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
			obj.element=i;
			obj.frequency=0;
			for(int j: arr) {
				if(i==j)
					obj.frequency++;
			}
			distinct.add(obj);
		}
//		for(node item:distinct)
//			System.out.println("\n"+item.element+"Freq: "+item.frequency);
	}

	void objSort() {
		Collections.sort(distinct);
		for(node item: distinct)
		System.out.println("Element : "+item.element+"  Frequency : "+item.frequency+"\n");
		}
	}