package cn.wzs;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.crypto.Data;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abcd");
		String str2 = new String("abcd");
		System.out.println(str2.equals(str1));
		//System.out.println(str1.valueOf(false));
		ArrayList<Integer> arrayList= new ArrayList<>();
		
		Calendar calendar = new GregorianCalendar();
		//calendar.set(2018, 12, 10, 16, 12);
		Date date = calendar.getTime();
		System.out.println(date);
	}

}
