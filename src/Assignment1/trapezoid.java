package Assignment1;

public class trapezoid extends quardilateral {
	float height;
	public trapezoid(int x[],int y[],float height){
		setXY(x,y);
		this.height=height;
	}
	
	public float area() {
		float b1=(float)Math.sqrt((x[1]-x[2])*(x[1]-x[2])+(y[1]-y[2])*(y[1]-y[2]));
		float b2=(float)Math.sqrt((x[3]-x[2])*(x[3]-x[2])+(y[3]-y[2])*(y[3]-y[2]));
		return 0.5f*(b1+b2)*height;
	}
}
