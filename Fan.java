package week2day2;

public class Fan {
	
	Speed fanstate;
	public void setState()
	{
		System.out.println(fanstate);
	}
	
}

abstract class Speed {
	
	abstract Speed next();
	
}


class SwitchOn extends Speed{
	
	Speed next()
	{
		return new MediumSpeed();
	}
	
}

class MediumSpeed extends Speed{
	
	Speed next()
	{
		return new HighSpeed();
	}
}

class HighSpeed extends Speed{
	
	Speed next()
	{
		return new SwitchOff();
	}
}

class SwitchOff extends Speed{
	
	Speed next()
	{
		return new SwitchOn();
	}
}