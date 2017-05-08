import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="abc";
		List<String> ll = PermutationList("",word);
		system.out.println(ll);
	}
	public static List<String> PermutationList(String perm, String value)
	{
		ArrayList <String> al= new ArrayList<String>();
		if(value.isEmpty())
		{
			al.add(perm+value);
		}
		else
		{
			for(int i=0;i<value.length();i++)
			{
				permutationFinder(perm+value.charAt(i), value.substring(0,i) + value.substring(i+1,value.length()));
			}
		}
		return al;
	}
	
	public static void permutationFinder(String perm, String word)
	{
		if (word.isEmpty()) {
            System.out.println(perm + word);

        }
		
		else {
			for(int i = 0; i < word.length(); i++){
				permutationFinder(perm + word.charAt(i), word.substring(0,i) + word.substring(i+1, word.length()));
			}
		
	}
}
}
