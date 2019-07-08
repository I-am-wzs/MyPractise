import java.math.BigDecimal;

class varible{
	int ga;
}
class constant{
	final double PI = 3.1415926;
}
public class TestVarible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		age = 100;
		System.out.println(age);
		
		varible nvarible = new varible();
		System.out.println(nvarible.ga);
		nvarible.ga = 9;
		System.out.println(nvarible.ga);
		constant nConstant = new constant();
		//nConstant.PI = 9;//constant varible ,can not change
		double area = nConstant.PI * 4 * 4;
		System.out.println(area);
		
		
		BigDecimal bigDecimal = BigDecimal.valueOf(1.05);
		System.out.println(bigDecimal);
		
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1 & b2);
		
		System.out.println(6 + 3 + "4" );
		System.out.println(6 + 3 + "4" + 7);
	}

}
