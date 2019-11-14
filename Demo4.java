import java.util.*;
public class Demo4{
	public static void main(String[] args){
		String str="Hello World";
		char[] ch=str.toCharArray();
		char[] reversed=new char[ch.length];
		int j=0;
		for(int i=ch.length-1;i>=0;i--){
			reversed[j]=ch[i];
			j++;
		}
		System.out.println(reversed);
	}
}
