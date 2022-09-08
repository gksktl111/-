package com.java.ex.main;

import com.java.ex.character.Wizard; // 다른 패키지에 있으므로 import가 필요함 (같은 패키지에 있으면 상관X)

public class MainClass {

	public static void main(String[] args) {
		Wizard wiz1 = new Wizard("반장", 30, 100, 50);
		//Wizard wiz2 = new Wizard();  생성자의 매개변수 값을 잘 맞춰야함
		System.out.print("Hp : " + wiz1.getHp());
	}

}
