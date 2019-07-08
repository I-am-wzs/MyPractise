package com.wzs;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Student<T1, T2> {
	private T1 intScore;
	private T2 stringScore;
	
	
	public T1 getIntScore() {
		return intScore;
	}


	public void setIntScore(T1 intScore) {
		this.intScore = intScore;
	}


	public T2 getStringScore() {
		return stringScore;
	}


	public void setStringScore(T2 stringScore) {
		this.stringScore = stringScore;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student<Integer, String> student = new Student<Integer,String>();
		student.setIntScore(45);
		student.setStringScore("D");
		System.out.println(student.getStringScore());
		ArrayList<Integer> list = new ArrayList<>();
		
	}

}
