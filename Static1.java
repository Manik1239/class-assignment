import java.util.*;
class Student{
	int rollno;
	String name;
	static String colname;

void display(){
	int x=10;
	System.out.println(name +" "+ rollno);
	}
}
class Static1{
	public static void main(String[] args){
		Student s1=new Student();
		Student s2=new Student();
		s2.display();
	}
}