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
		this(height);	//ʹ��this�����������캯���������Ƿ�����ĵ�һ����䡣
		this.weight = weight;
	}

}
