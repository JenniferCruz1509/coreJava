
public class removeDuplicate {

	public static void main(String[] args) {
		String word = "Hello";
		Character unwanted = 'l';
		String afterRemoved = removeCharacter(word, unwanted);
		System.out.println(afterRemoved);
		String afterRecurrsive = afterRecurrsiveRemove(word, unwanted);
		System.out.println(afterRecurrsive);

	}

	private static String afterRecurrsiveRemove(String word, Character unwanted) {
		// TODO Auto-generated method stub
		int index=word.indexOf(unwanted);
		System.out.println(index);
		if (index ==-1)
			{return word;}
		
		return afterRecurrsiveRemove(word.substring(0,index)+word.substring(index+1,word.length()), unwanted);
	}

	public static String removeCharacter(String word, Character unwanted) {
		StringBuilder sb = new StringBuilder();
		char[] ch = word.toCharArray();
		for(Character c : ch)
		if(c != unwanted) sb.append(c);
		else sb.append(" ");
	
		return sb.toString();
	}

}
