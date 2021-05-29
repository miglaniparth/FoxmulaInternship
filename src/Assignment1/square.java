package Assignment1;

public class square extends quardilateral {
	public square(int x[],int y[]){
		setXY(x,y);
	}
	public float area() {
		float ans=(float)Math.sqrt((x[1]-x[2])*(x[1]-x[2])+(y[1]-y[2])*(y[1]-y[2]));
		return ans*ans;
	}
}
