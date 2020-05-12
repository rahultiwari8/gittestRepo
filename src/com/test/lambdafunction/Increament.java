package com.test.lambdafunction;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Increament {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		populate(l);
		
		Predicate<Employee> p = emp-> emp.sal<3500;
		Function<Employee, Employee> f = e->
		{
			e.sal=e.sal+477;
			return e;
		};
		ArrayList<Employee> l2 = new ArrayList<Employee>();
		
		for (Employee employee : l) {
			if(p.test(employee))
			{
				l2.add(f.apply(employee));
			}
		}
		
		System.out.println(l2);
		
		System.out.println("ha ha");
		System.out.println("hi hi");
		
	}

	private static void populate(ArrayList<Employee> e) {
		e.add(new Employee(2000,"Sunny"));
		e.add(new Employee(3000,"Dunny"));
		e.add(new Employee(4000,"Funny"));
		e.add(new Employee(5000,"Gunny"));
		e.add(new Employee(6000,"Junny"));
		
	}

}

class Employee
{
	int sal;
	public Employee(int sal, String name) {
		super();
		this.sal = sal;
		this.name = name;
	}
	String name;
	
	public String toString()
	{
		return name =" " + " " +sal;
	}
}
