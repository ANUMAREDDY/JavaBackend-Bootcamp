package com.nt.test;

import com.nt.comp.Person;
import com.nt.factory.PersonFactory;

public class SoftwareClient {

	public static void main(String[] args) {
		Person per = PersonFactory.getPerson("emp");
		per.work();


	}

}
