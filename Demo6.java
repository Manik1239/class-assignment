import java.io.*;
class Demo6{
public static void main(String[] args)
{
try{
FileWriter fw=new FileWriter("data.txt");
fw.write("Hello World");
fw.close();
}
catch(Exception e){
System.out.println(e);
}
}
}