import java.util.*;
public class Oldestone{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		{
			if(x>y&&x>z)
			{
				System.out.println(x  +"is the oldest one");
			}
			else if(x<y&&x<z)
			{
				System.out.println(x  +" is the youngest one");
			}
		}			
		{	
			if(y>z&&y>x)
			{
				System.out.println(y  +" is the oldest one");
			}
			else if(y<z&&y<x)
			{
				System.out.println(y  +" is the youngest one");
			}	
		}
		{	
		                    if(z>x&&z>y)
			{
				System.out.println(z  +" is the oldest one");
			}
			else if(z<x&&z<y)
			{
				System.out.println(z  +" is the youngest one");
			}
		}
	}
}	