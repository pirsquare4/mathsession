public class MaxTest {
	public static int[] easyNumbers = {1,2,3,5,-2,-3};
	public static int[] hardNumbers = {0,1,5,12,15,12,27,-2,-7};
	public static int[] control = {-5,1,15,-256,512,29};


	public static void main(String[] args) {
		int easyMax = MaxTest.max(easyNumbers);
		System.out.println("easyNumbers max: " + easyMax);

		int hardMax = MaxTest.max(hardNumbers);
		System.out.println("hardNumbers max: " + hardMax);

		int controlMax = MaxTest.max(control);
		System.out.println("controlNumbers max: " + controlMax);


  }

	public static int max(int[] numbers) {
	  	int index = 0;
	  	int biggestNum = Integer.MIN_VALUE; //smallest val to start from to find max
	  	while (index < numbers.length) {
	      if (numbers[index] > biggestNum) {
	        biggestNum = numbers[index];
	      }
	      index++;
	    }

	    return biggestNum;
  }
}
