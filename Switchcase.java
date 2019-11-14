import java.util.*;
public class Switchcase{
	public static void main(String[] args){
		int x;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		switch(x%7){
			case 1:
				System.out.println("sunday");
				break;
			case 2:
				System.out.println("monday");
				break;
			case 3:
				System.out.println("tuesday");
				break;
			case 4:
				System.out.println("wednesday");
				break;
			case 5:
				System.out.println("thursday");
				break;
			case 6:
				System.out.println("friday");
				break;
			case 0:
				System.out.println("saturday");
				break;
			}
		}	
}
		