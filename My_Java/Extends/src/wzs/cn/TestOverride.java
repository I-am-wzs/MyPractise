package wzs.cn;

public class TestOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse horse = new Horse();
		Horse horse2 = new Horse();
		horse.run();
	}

}
class Vehicle{
	public void run() {
		System.out.println("run...");
	}
	public void stop() {
		System.out.println("stop！");
	}
	public Person whoIsPsg() {
		return new Person();
	}
}
class Horse extends Vehicle{
	public void run() {
		super.run();
		System.out.println("四蹄翻飞，嘚嘚。。。");
	}
	public Student whoIsPsg() {
		return new Student("小明", 165, "挖掘机");
	}
}