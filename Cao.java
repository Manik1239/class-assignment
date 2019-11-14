import java.util.*;
public class Cao{
	private static float radius = 10f;
	public static void main(String args[]){
		System.out.println(Circle.circumference(radius));
	}
}
class Circle{
	public static float circumference(float radius){
		return 2f*3.14f*radius;
	}
}