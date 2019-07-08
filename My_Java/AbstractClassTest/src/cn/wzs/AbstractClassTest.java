package cn.wzs;
interface fly{
	int SPPED = 45;
	public void flyable();
}
interface attack{
	int strenth = 56;
	public void attackable();
}
abstract class Animal{
	public abstract void run();
	public abstract void breath(); 		
}
class Dog extends Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The Dog must can be run!");
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("The Dog must can be breath!");
	}
	
}
class hawk implements fly,attack{
	public int wighte = 90;
	@Override
	public void attackable() {
		// TODO Auto-generated method stub
		System.out.println("I can attack!");
	}

	@Override
	public void flyable() {
		// TODO Auto-generated method stub
		System.out.println("I can fly!");
	}
	
}

public class AbstractClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog();
		dog.run();
		
		fly fly1 = new hawk();
		fly1.flyable();
	}

}
