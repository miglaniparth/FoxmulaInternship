package Assignment1;

public class time{
	private int hour,min,sec;
	time(){
		
	}
	public time(int hour,int min,int sec){
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}
	public time add(time obj) {
		time t=new time();
		t.sec=this.sec+obj.sec;
		if(t.sec>59) {
			t.min=t.sec/60;
			t.sec=t.sec%60;
		}
		t.min+=this.min+obj.min;
		if(t.min>59) {
			t.hour=t.min/60;
			t.min=t.min%60;
		}
		t.hour=this.hour+obj.hour;
		if(t.hour>=24) {
			t.hour=t.hour%24;
		}
		System.out.println("Hours : "+t.hour+"\nMinutes : "+t.min+"\nSeconds : "+t.sec);
		return t;
	}
}