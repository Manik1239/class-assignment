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
		this(10);
		System.out.println("C class constructor");
	}
	public C(int x){
		System.out.println(x);
	}
}
public class Demo3{
	public static void main(String[] args){
		C obj=new C();
	}
}