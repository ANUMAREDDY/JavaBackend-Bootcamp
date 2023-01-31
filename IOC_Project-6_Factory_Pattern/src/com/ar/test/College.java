package com.ar.test;

import com.ar.comp.Food;
import com.ar.comp.Student;

public class College {
public static void main(String[] args) {
		
		Food food =new Food();
		Student st= new Student(food);
		
		st.work();
}

}
