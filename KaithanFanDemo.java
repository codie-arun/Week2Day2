package week2day2;

public class KaithanFanDemo {
	
	public static void main(String[] args) {
		
		
		for(int i = 0; i<10; i++)
		{
			Fan myfan = FanRegulator.getMyFan();
			myfan.setState();
		}
		
		
	}

}



class FanRegulator{
	
	static Speed chspeed = new SwitchOff();
		
	public static Fan getMyFan() {
		Fan f = new Fan();
		Speed s = chspeed;
		f.fanstate = s;
		chspeed = chspeed.next();
		return f;
	}
}