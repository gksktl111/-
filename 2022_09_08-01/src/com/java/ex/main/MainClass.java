package com.java.ex.main;

import com.java.ex.character.Archer;
import com.java.ex.character.Warrior;
import com.java.ex.character.Wizard; // 다른 패키지에 있으므로 import가 필요함 (같은 패키지에 있으면 상관X)
// 
public class MainClass {

	public static void main(String[] args) {
		// 이름,지능,힘,민첩
		
		Warrior war1 = new Warrior("전사1", 30, 100, 35);
		Warrior war2 = new Warrior("전사2", 30, 85, 40);
		
		Archer arc1 = new Archer("궁수1", 50, 70, 80);
		Archer arc2 = new Archer("궁수2", 35, 65, 80);
		
		Wizard wiz1 = new Wizard("마법사1", 100, 30, 40);
		Wizard wiz2 = new Wizard("마법사2", 85, 45, 45);  //생성자의 매개변수를 다르게하여 오버로딩함
		
		System.out.println("이름 : " + war1.getName());
		System.out.println("level : " + war1.getLevel());
		System.out.println("strenth : " + war1.getStrenth());
		System.out.println("intel : " + war1.getIntel());
		System.out.println("agil : " + war1.getAgil());
		System.out.println("damage : " + war1.WarriorCalDamage());
		
		System.out.println("--------------------------------");
		
		System.out.println("이름 : " + war2.getName());
		System.out.println("level : " + war2.getLevel());
		System.out.println("strenth : " + war2.getStrenth());
		System.out.println("intel : " + war2.getIntel());
		System.out.println("agil : " + war2.getAgil());
		System.out.println("damage : " + war2.WarriorCalDamage());
		
		System.out.println("--------------------------------");
		
		System.out.println("이름 : " + arc1.getName());
		System.out.println("level : " + arc1.getLevel());
		System.out.println("strenth : " + arc1.getStrenth());
		System.out.println("intel : " + arc1.getIntel());
		System.out.println("agil : " + arc1.getAgil());
		System.out.println("damage : " + arc1.ArcherCalDamage());
		
		System.out.println("--------------------------------");
		
		System.out.println("이름 : " + arc2.getName());
		System.out.println("level : " + arc2.getLevel());
		System.out.println("strenth : " + arc2.getStrenth());
		System.out.println("intel : " + arc2.getIntel());
		System.out.println("agil : " + arc2.getAgil());
		System.out.println("damage : " + arc2.ArcherCalDamage());
		
		System.out.println("--------------------------------");
		
		System.out.println("이름 : " + wiz1.getName());
		System.out.println("level : " + wiz1.getLevel());
		System.out.println("strenth : " + wiz1.getStrenth());
		System.out.println("intel : " + wiz1.getIntel());
		System.out.println("agil : " + wiz1.getAgil());
		System.out.println("damage : " + wiz1.WizardCalDamage());
		
		System.out.println("--------------------------------");
		
		System.out.println("이름 : " + wiz2.getName());
		System.out.println("level : " + wiz2.getLevel());
		System.out.println("strenth : " + wiz2.getStrenth());
		System.out.println("intel : " + wiz2.getIntel());
		System.out.println("agil : " + wiz2.getAgil());
		System.out.println("damage : " + wiz2.WizardCalDamage());
		
	}
}
