package com.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FactoryMainClass {
	
	public static void main(String[] args) {
		log.info("started main function to crate ");
		Person a = PersonFactory.createPerson("a");
		a.createPerson();
		Person b = PersonFactory.createPerson("b");
		b.createPerson();
	}
}
