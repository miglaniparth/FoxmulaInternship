package Assignment1;

public class parallelogram extends quardilateral {
	float height;
	public parallelogram(int x[],int y[],float height){
		setXY(x,y);
		this.height=height;
	}
	
	public float area() {
		float base=(float)Math.sqrt((x[1]-x[2])*(x[1]-x[2])+(y[1]-y[2])*(y[1]-y[2]));
		return base*height;
	}
}
