package com.creational.factory;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class ConcretePersonA implements Person {
	
	public void createPerson() {
		log.info("concrete person A created");
	}

}
