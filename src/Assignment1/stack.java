package Assignment1;
import java.util.*;

public class stack{
	ArrayList <Integer> s=new ArrayList <Integer>();
	
	 boolean checkEmpty() {
		if(s.size()==0)
			return true;
		else
			return false;
	}
	
	 void push(int ele) {
		this.s.add(0,ele);
		System.out.println(ele+" pushed to the stack successfully\n");
	}
	
	 void pop() {
		if(this.checkEmpty()) {
			System.out.println("The stack is already empty\n");
		}
		else {
			System.out.println(this.s.get(0)+" popped from the stack successfully\n");
			this.s.remove(0);
		}
	}
	
	 int stackSize() {
		return this.s.size();
	}
}