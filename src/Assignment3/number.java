package Assignment3;

public class number {
	private int number;
	
	number(int number){
		this.number=number;
	}
	
	boolean isOdd() {
		if(this.number%2==0)
			return false;
		else
			return true;
	}
	
	boolean isPrime() {
		int n= this.number;
		if(n<2)
			return false;
		
		if (!this.isOdd())
			return false;
		
		for(int i=3;i<Math.sqrt(n);i+=2) {
			if(n%i==0)
				return false;
		}
		
		return true;
	}
	
	void checkNumber() {
		try {
			if(this.isOdd() && this.isPrime()) {
				throw new Exception("Invalid number");
			}
			else
				System.out.print("Number is valid");	
			}
		
		catch(Exception e) {
			System.out.print("Exception occured "+e);
		}
	}

}
