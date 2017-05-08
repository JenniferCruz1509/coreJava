

import java.util.ArrayList;
import java.util.List;

public class reverseString {

	public static void main(String[] args) {

          String st = "Jennifer";
          String st1 = "Anthony";
		  String reverseString  = reversingWithIteration(st);
		  System.out.println(reverseString);
          String reversedString = reversingWithRecursion(st1);
          System.out.println(reversedString);
	}
	
	public static String  reversingWithIteration(String st){
		
		char[] ch = st.toCharArray();
		StringBuilder sb = new StringBuilder();
			
		for(int i = ch.length -1 ; i >= 0 ; i--){
			sb.append(ch[i]);
		}
		
		return sb.toString();
	}
	
	public static String reversingWithRecursion(String st){
		
		if(st.length() <2){
			return st;
		}
		System.out.println(st.substring(1));
		return reversingWithRecursion(st.substring(1)) + st.charAt(0);
		
	}

}
