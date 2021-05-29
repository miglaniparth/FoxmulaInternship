package Assignment1;

 abstract class quardilateral {
	protected int x[]=new int [4];
	protected int y[]=new int [4];
	
	protected void setXY(int x[],int y[]) {
		for(int i=0;i<4;i++) {
			this.x[i]=x[i];
			this.y[i]=y[i];
		}
	}
	abstract float area();
}
