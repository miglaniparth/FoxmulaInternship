package Assignment1;

 class square extends quardilateral {
	 square(int x[],int y[]){
		setXY(x,y);
	}
	 float area() {
		float ans=(float)Math.sqrt((x[1]-x[2])*(x[1]-x[2])+(y[1]-y[2])*(y[1]-y[2]));
		return ans*ans;
	}
}
