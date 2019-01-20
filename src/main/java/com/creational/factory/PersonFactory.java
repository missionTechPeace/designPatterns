package com.creational.factory;

public class PersonFactory {

	public static Person createPerson(String type){
			if(type.equals("a")) {
				return new ConcretePersonA();
			} else if (type.equals("b")) {
				return new ConcretePersonB();
			} else {
				return null;
			}
	}
}
