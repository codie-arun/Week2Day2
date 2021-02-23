package week2day2;

import java.util.Scanner;

public class BadChildDogDemo {

	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a item...:");
		String item=scan.next();
		
		BullDog tiger=new BullDog();
		NaughtyChild baby=new NaughtyChild();
		baby.playWithDog(tiger,"week2day2."+item);
		
		scan.close();
	}
	
}

class BullDog{
	public void play(String item) throws Exception{
		
		Item i = (Item)Class.forName(item).newInstance();
		i.respond();
		
	}
}


class NaughtyChild{
	public void playWithDog(BullDog dog,String item) throws Exception{
		dog.play(item);
	}
}


abstract class Item{
	abstract void respond();
}

class Stick extends Item{
	
	void respond() {
		System.out.println("you beat I bite......");
	}
	
}

class Stone extends Item{
	
	void respond() {
		System.out.println("you hit I bark.....");
	}
	
}