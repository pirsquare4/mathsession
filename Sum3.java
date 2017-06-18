public class Sum3 {
	public static int[] easyNumbers = {1,2,3,5,-2,-3};
	public static int[] hardNumbers = {0,1,5,12,15,12,27,-2,-7};
	public static int[] control = {-5,1,15,-257,512,29};


	public static void main(String[] args) {
		boolean easySum = Sum3.calculate(easyNumbers);
		System.out.println("easyNumbers sum: " + easySum);

		boolean hardSum = Sum3.calculate(hardNumbers);
		System.out.println("hardNumbers sum: " + hardSum);

		boolean controlSum = Sum3.calculate(control);
		System.out.println("controlNumbers sum: " + controlSum);


  }

	public static boolean calculate(int[] numbers) {
      for (int a=0; a < numbers.length; a++){
        for (int b=0; b < numbers.length; b++){
          for (int c=0; c < numbers.length; c++){
            if (numbers[a] + numbers[b ]+ numbers[c] == 0){
              System.out.println("select " + numbers[a] + ", "
							 +  numbers[b] + "and " + numbers[c]);
              return true;
            }

          }
       	}
      }
      return false;
    }
}
