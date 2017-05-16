import java.util.Arrays;
import java.util.Collections;

public class reverseSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arraySort[] = new Integer[]
				{
						new Integer(5),
						new Integer(15),
						new Integer(1),
						new Integer(50),
						new Integer(55)
				};
		Arrays.sort(arraySort, Collections.reverseOrder());
		for (Integer i : arraySort)
		{
			System.out.println(i.intValue());
		}

	}

}
