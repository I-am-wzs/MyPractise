package cn.wzs;
class HttpSeverlet{
	public void get() {
		System.out.println("call doing");
		doing();
	}
	public void doing() {
		System.out.println("I am dong!");
	}
}
class MyHttpServerlet extends HttpSeverlet{
	public void doing() {
		System.out.println("MyHttpServer doing!");
	}
}

public class PolymorphismTest {
	public static void main(String[] args) {
		MyHttpServerlet myHttpServerlet = new MyHttpServerlet();
		myHttpServerlet.get();
	}
}
