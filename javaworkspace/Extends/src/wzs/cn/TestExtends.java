package wzs.cn;

class Person{
	String name;
	int height;
	
	public void rest() {
		System.out.println("休息一会！");
	}
}

class Student extends Person{
	String major;
	
	public void study() {
		System.out.println("每天学习26小时！");
	}
	
	public Student(String name,int height,String major) {
		this.name = name;
		this.height = height;
		this.major = major;
	}
}

public class TestExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("小李", 165, "计算机");
		student.study();
		System.out.println(student instanceof Student);
		System.out.println(student instanceof Person);
		System.out.println(student instanceof Object);
		System.out.println(new Person() instanceof Student);
	}

}
