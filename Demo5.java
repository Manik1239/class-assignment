public class Demo5{
		public static void main(String args[])
		{
			
		
	String str1 ="Java class in turing block";
	str1=str1.toUpperCase();
	
	
	String word[]=str1.split(" ");
	int freq[]=new int[26];
	for(String str:word)
	{
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			freq[ch-'A']++;
			
		}
				}
	for(int j=0;j<26;j++)
	{
		if(freq[j]!=0)
		{
			System.out.println((char)(j+'A')+" "+freq[j]);
		}
	}
		}
	
}
