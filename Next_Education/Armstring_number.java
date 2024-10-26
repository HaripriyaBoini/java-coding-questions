package Next_Education;

public class Armstring_number {

	public static void main(String[] args) {
		int input = 13; // You can change this to any number you want to check
        int data = input;
        int r, res = 0;
        System.out.println("input given is"+input);

        // Loop to calculate the sum of the cubes of the digits
        while (input != 0) {
            r = input % 10;         // Get the last digit
           
            res = res + (r * r * r);  
            input = input / 10;        //remove the last number and prints remaining
        }

        // Print the result
        System.out.println("Calculated result: " + res);

        // Check if the result is equal to the original number
        if (res == data) {
            System.out.println("Armstrong number-------->" + res);
        } else {
            System.out.println("Not Armstrong number-------->" + res);
        }

	}

}
