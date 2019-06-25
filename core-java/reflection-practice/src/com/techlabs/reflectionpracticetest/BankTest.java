package com.techlabs.reflectionpracticetest;
import com.techlabs.reflectionpractice.*;
import java.lang.reflect.*;


public class BankTest {

	public static void main(String args[]) throws Exception {

		Bank b = new Bank();
		Bank b1 = new Bank(2, "abc", "xyz", 2000);

		Class cls = b1.getClass();
		
		System.out.println("the class name is " + cls.getName());

		Constructor constructor = cls.getConstructor();
		System.out.println("constructor name is " + constructor.getName());

	
		Method methodCall1 = cls.getDeclaredMethod("display");

		//methodCall1.invoke(b);

		Method methodCall2 = cls.getDeclaredMethod("deposit", double.class);
		//methodCall2.invoke(b, 4000);

		Method methodCall3 = cls.getDeclaredMethod("show");
		methodCall3.setAccessible(true);
		//methodCall3.invoke(b);

		Method methodCall4 = cls.getMethod("getFirstName");
		//System.out.println(methodCall4.invoke(b1));

		Field field = cls.getDeclaredField("str");
		field.setAccessible(true);
		field.set(b, "Bank app using reflection");
		//methodCall1.invoke(b);

		//display(cls);
		Class cls2=b1.getClass();
		
		String s="abc";
		Class cls3=s.getClass();
		//display(cls3);
		Boolean val=false;
		//display(val.getClass());
		Integer i=1;
		display(i.getClass());
	}

	public static void display(Class c) {
		Method[] methods = c.getMethods();
		System.out.println();
		for (Method method : methods) {
			System.out.println(method.getName());
		}	
	}
}
