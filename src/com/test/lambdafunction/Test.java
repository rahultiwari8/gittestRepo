package com.test.lambdafunction;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	
	int marks;
	String name;
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	
	

}
 
 public class Test
 {
	 public static void main(String[] args) {
		
		 ArrayList<Student> l = new ArrayList<Student>();
		 populate(l);
		 
		 Function<Student,String> f =s->
		 {
			 int marks =s.marks;
			 if(marks>=80)
			 {
				 return "A Distinction";
			 }
			 else if(marks>=60)
			 {
				 return "B Distinction";
			 }
			 else if(marks>=50)
			 {
				 return "C Distinction";
			 }
			 else
				 return "Failed Student";
		 };
		 for (Student student : l) {
			 
			 System.out.println("Student name is -> " +student.name);
			 System.out.println("Student marks is -> " +student.marks);
			 System.out.println("Student grade is -> " +f.apply(student));
			 System.out.println();
			 System.out.println();
			
		}
		 
		 Predicate<Student> p = s -> s.marks >=60;
		 System.out.println("hi");
		 
		 for (Student student2 : l) {
			if(p.test(student2))
			{
				System.out.println("Student name is -> " +student2.name);
				 System.out.println("Student marks is -> " +student2.marks);
				 System.out.println("Student grade is -> " +f.apply(student2));
			}
		}
		 
	}

	private static void populate(ArrayList<Student> l) {
		l.add(new Student(30,"Sunny"));
		l.add(new Student(50,"Hunny"));
		l.add(new Student(70,"Funny"));
		l.add(new Student(90,"Tunny"));
		l.add(new Student(50,"Aunny"));
		
		
	}
 }
