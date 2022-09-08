package com.java.ex.main;

import com.java.ex.character.Wizard; // 다른 패키지에 있으므로 import가 필요함 (같은 패키지에 있으면 상관X)

public class MainClass {

	public static void main(String[] args) {
		Wizard wiz1 = new Wizard("반장", 30, 100, 50);
		Wizard wiz2 = new Wizard();  //생성자의 매개변수를 다르게하여 오버로딩함
		
		System.out.println("이름 : " + wiz1.getName());
		System.out.println("level : " + wiz1.getLevel());
		System.out.println("strenth : " + wiz1.getStrenth());
		System.out.println("intel : " + wiz1.getIntel());
		System.out.println("agil : " + wiz1.getAgil());

	}

}
