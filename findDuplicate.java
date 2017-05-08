import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class findDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="java Application";
		findDuplicate(value);
		
	}
	
	public static void findDuplicate(String st)
	{
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
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
		
		Set<Map.Entry<Character, Integer>> entryset=hm.entrySet();
		System.out.println("below are the duplicate");
		Iterator it = entryset.iterator();
		while(it.hasNext())
		{
			Map.Entry<Character, Integer> entry = (Entry<Character, Integer>) it.next();
			
			if (entry.getValue()>1)
			{
				System.out.println(entry.getKey()+ " count with "+entry.getValue() );
			}
		}
		
	}

}
