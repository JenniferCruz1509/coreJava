import java.util.Arrays;

public class FindPairClosestToZero {
	
	public static void main(String[] args) {

		int array[] = {1,-5,2, -10, 3, -6};  
		findPairsEqualsToZero(array);  

	}

	public static void findPairsEqualsToZero(int[] inputArray){
		
		int left = 0;
		int right = inputArray.length - 1 ;
		int minimumSum = Integer.MAX_VALUE;
		int minLeft = left;
		int minRight = right;
		
		Arrays.sort(inputArray);
		
		while(left < right) {
			  int sum = inputArray[left] + inputArray[right];
			  
			  if(Math.abs(sum) < Math.abs(minimumSum)){
				  minimumSum = sum ;
				  minLeft = left ;
				  minRight =  right;
				  
			  }
			  else if(sum > 0){
				  right -- ;
			  }
			  else if(sum < 0){
				  left++;
			  }
			  
	     }
		
		System.out.println( "The pair whose sum is minimun : " +inputArray[minLeft]+ " " + inputArray[minRight]);
    }

}
