import java.util.*;
class A{
	public A(){
		super();
		System.out.println("A class constructor");
	}
}
class B extends A{
	public B(){
		super();
		System.out.println("B class constructor");
	}	
}
class C extends B{
	public C(){	
		super();
		System.out.println("C class constructor");
	}
	public C(int x){
	}
}
public class Demo2{
	public static void main(String[] args){
		C obj=new C();
	}
}