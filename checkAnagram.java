public class checkAnagram {

	public static void main(String[] args) {
		
		String st = "word";
		String anagram = "drow";
        System.out.println(findAnagram(st,anagram));
	}
	
	/* first & foremost parameter for nagram is two string should have equal length
	 */
	public static boolean findAnagram(String input, String anagram){
		
		if(input.length() != anagram.length()){
			return false;
		}
		
        char[] ch = input.toCharArray();
        for(Character c : ch){
        	int index = anagram.indexOf(c);
        	if(index != -1){
        		anagram = anagram.substring(0,index) + anagram.substring(index + 1, anagram.length());
        		System.out.println(anagram);
        	}
        	else {
        		return false;
        	}
        }
		return anagram.isEmpty();
		
	}

}
