package Assign_1;
import Assignment1.stack;
import java.util.*;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s1=new stack();
		stack s2=new stack();
		Scanner obj=new Scanner(System.in);
		while(true) {
			System.out.println("Select the stack you want to work with\n 1. Stack 1\n 2. Stack 2\n 3. Exit\n");
			int stackChoice=obj.nextInt();
			switch(stackChoice) {
			case 1:
				System.out.println("Select the stack operation :\n 1. Push\n 2. Pop 3. Check Empty\n");
				int operationChoice=obj.nextInt();
				switch(operationChoice) {
				case 1:
					System.out.println("Enter the element to push: \n");
					int ele=obj.nextInt();
					s1.push(ele);
					break;
				case 2:
					s1.pop();
					break;
				case 3:
					if(s1.checkEmpty())
						System.out.println("Stack is empty\n");
					else
						System.out.println("Stack is not empty\nIt has "+s1.stackSize()+" elements\n");
					break;
				}
				break;
			case 2:
				System.out.println("Select the stack operation :\n 1. Push\n 2. Pop 3. Check Empty\n");
				int operationChoice2=obj.nextInt();
				switch(operationChoice2) {
				case 1:
					System.out.println("Enter the element to push: \n");
					int ele=obj.nextInt();
					s2.push(ele);
					break;
				case 2:
					s2.pop();
					break;
				case 3:
					if(s2.checkEmpty())
						System.out.println("Stack is empty\n");
					else
						System.out.println("Stack is not empty\nIt has "+s2.stackSize()+" elements\n");
					break;
				}
				break;
			case 3:
				System.exit(0);
			}
			
			if(s1.stackSize()==s2.stackSize())
				System.out.println("Both the stacks are of same size : "+s1.stackSize());
		}

	}

}
