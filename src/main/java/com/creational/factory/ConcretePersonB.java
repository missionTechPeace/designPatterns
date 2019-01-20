package com.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcretePersonB  implements Person {

	public void createPerson() {
		log.info("concrete person B created");
	}

}
