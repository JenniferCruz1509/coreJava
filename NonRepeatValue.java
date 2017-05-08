import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class NonRepeatValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="java Application";
		NonReapeatCharacter(value);
	}
	public static void NonReapeatCharacter(String st)
	{
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		LinkedList<Character> ll = new LinkedList<Character>();
		char[] ch=st.toCharArray();
		for(int i=0;i<st.length();i++)
		{
			if(hm.containsKey(ch[i]))
			{
				hm.put(ch[i], hm.get(ch[i])+1);
			}
			else
				hm.put(ch[i], 1);
		}
		
		Set<Map.Entry<Character, Integer>> entrySet= hm.entrySet();
		System.out.println("below unique characters");
		Iterator it = entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry<Character, Integer> entry = (Entry<Character, Integer>) it.next();
			
			if (entry.getValue()==1)
			{
				ll.add(entry.getKey());
			}
		}
		
		
		System.out.println("all non repeat values " +ll);
		//System.out.println("the first non repeat value is "+ll.peekFirst());
	}

}
