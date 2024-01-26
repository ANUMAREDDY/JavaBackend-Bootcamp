package com.nt.test;

import com.nt.comp.Person;
import com.nt.factory.PersonFactory;

public class College {

	public static void main(String[] args) {
	
		Person per = PersonFactory.getPerson("stu");
		per.work();

	}

}
