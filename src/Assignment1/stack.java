package Assignment1;
import java.util.*;
class node{
	int value;
	node next;
}
class stack{
	node head;
	int elements=0;
	stack(){
		head=null;
	}
	boolean checkEmpty() {
		if(head==null)
			return true;
		else
			return false;
	}
	void push(int ele) {
		node newNode=new node();
		newNode.value=ele;
		newNode.next=this.head;
		this.head=newNode;
		System.out.println(newNode.value+" pushed successfully\n");
		elements++;
	}
	void pop() {
		if(this.stackSize()==0) {
			System.out.println("Empty stack");
			return;
		}
		System.out.println(this.head.value+" popped\n");
		this.head=this.head.next;
		elements--;
	}
	int stackSize() {
		return elements;
	}
}
