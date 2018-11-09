package myProject;
class NewsInfo{
	public NewsInfo(int i, String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
		id = 1;
		标题 = string;
		内容 = string2;
		时间 = string3;
		谁   = string4; 
	}
	int id;
	String 标题;
	String 内容;
	String 时间;
	String 谁;
}
public class MyPractise {

	
	public static void main(String[] args) {
		System.out.println(Math.abs(-7));
		System.out.println("dssd");
		NewsInfo 人民1 = new NewsInfo(2,"成都新闻","7路公交事故","2018.11.08","土豆");
		System.out.println(人民1.内容 + 人民1.getClass());
	}
	
}
