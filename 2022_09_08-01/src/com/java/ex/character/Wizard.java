package com.java.ex.character;

public class Wizard {
	private String name;
	private int level;
	private int hp;
	private int mp;
	private int intel;
	private int strenth;
	private int agil;
	private int money;
	
	/* 생성자의 매개변수 값을 잘 맞춰야함
	public Wizard() {

	}
    */
	// 생성자를 사용하여 값을 최화 시킴
	public Wizard(String name, int intel, int strenth, int agil) {
		this.name = name;
		this.intel = intel;
		this.strenth = strenth;
		this.agil = agil;
		System.out.println("전사가 생성되었습니다");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getIntel() {
		return intel;
	}

	public void setIntel(int intel) {
		this.intel = intel;
	}

	public int getStrenth() {
		return strenth;
	}

	public void setStrenth(int strenth) {
		this.strenth = strenth;
	}

	public int getAgil() {
		return agil;
	}

	public void setAgil(int agil) {
		this.agil = agil;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
