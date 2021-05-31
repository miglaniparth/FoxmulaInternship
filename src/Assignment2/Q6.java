package Assignment2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayList arr=new arrayList();
		arr.input();
		arr.checkEmpty();
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr Sum 'k'");
		int k=s.nextInt();
		arr.pair(k);
		s.close();
		
	}

}
