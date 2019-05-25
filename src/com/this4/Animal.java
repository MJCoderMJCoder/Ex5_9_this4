package com.this4;

class Animal {
	int age;
	String furColor, eyeColor, name;
	float weight, height;
	
	public Animal(float height) {
		this.age = 1;
		this.height = height;
	}
	
	public Animal(String name) {
		this.age = 1;
		this.name = name;
	}
	
	public Animal(float height, float weight) {
		this(height);	//使用this调用其他构造函数，必须是方法体的第一条语句。
		this.weight = weight;
	}

}
