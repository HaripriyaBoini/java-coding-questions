package package1;

public class Sum_of_digits {

	public static void main(String[] args) {
		  int number = 25;
	        int sum = sumOfDigits(number);
	        System.out.println("The sum is " + sum);
	    }

	    public static int sumOfDigits(int num) {
	        int sum = 0;

	         while (num != 0) {
	            sum += num % 10; 
	            num /= 10; 
	            
	        }
	         
	        return sum;
	}

}
