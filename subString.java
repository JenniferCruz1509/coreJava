
public class subString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "im good!";
		String checker = "im";
		System.out.println(source.indexOf(checker, 0));
		findSubString(source,checker);
	}
	
	public static void findSubString(String source, String checker)
	{
		int startIndex=-1;
		int counter=0;
		int result = source.length()-checker.length();
		while (startIndex < source.length())
		{
			startIndex++;
			if(startIndex < result)
			{
				for(int i=startIndex;i<startIndex+checker.length();i++)
				{
					String t=Character.toString(source.charAt(i));
					if(checker.contains(t))
					counter++;
					else
						{
						break; 
						}
				}
			}
				else 
				{
					counter=0;
					for(int i=startIndex;i<source.length();i++)
					{
						String t=Character.toString(source.charAt(i));
						if(checker.contains(t))
						counter++;
						else
							{
							break; 
							}
				}
			}
			
			if(counter==checker.length())
			{
			int endIndex=startIndex+checker.length()-1;
			if(source.substring(startIndex, endIndex+1).equals(checker))
			{
				System.out.println("substring begins at"+startIndex);
				System.out.println("substring ends at"+endIndex);
			}
			}
		}
	}
}
