package methodOverride;

import java.util.HashMap;
import java.util.Scanner;

public class StringNonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner in = new Scanner(System.in);
		String s=in.nextLine();
		char c=NonRepeat(s);
		System.out.println("Unique number" +c);
	}
	
	public static Character NonRepeat(String s)
	{
		HashMap<Character, Integer> hChar = new HashMap<Character,Integer>();
		Character c = null;
		Integer i,len;
		len=s.length();
		for(i=0;i<len;i++)
		{
			c=s.charAt(i);
			if(hChar.containsKey(c))
			{
				hChar.put(c,hChar.get(c)+1);
			}
			else
			{
				hChar.put(c, 1);
			}
			
		}
		
		for(i=0;i<len;i++)
		{
		 c=s.charAt(i);	
		 if (hChar.get(c)==1)
		return c;
		}
		return null;
	}

}
