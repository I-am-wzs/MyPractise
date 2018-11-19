
public class TestIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = Math.random();
		System.out.println(d);
		
		int i = (int)(6 * Math.random() ) + 1;
		int j = (int)(6 * Math.random() ) + 1;
		int k = (int)(6 * Math.random() ) + 1;
		
		int count = i +j + k;
		if (count > 15) {
			System.out.println("今天手气不错");
		}
		if (count <= 15 && count >= 10 ) {
			System.out.println("今天手气一般");
		}
		if (count < 10) {
			System.out.println("今天手气不行");
		}
		System.out.println("得了" + count + "分");
	}

}
