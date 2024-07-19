package package1;

import java.util.Scanner;

public class A_b___________digitCount {
	

public static void main(String[] args) {


	
	Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your number:");
    int number = scanner.nextInt();

    int digitCount = countDigits(number);

    System.out.println("The number has " + digitCount + " digits.");
}

public static int countDigits(int number) {
    int count = 0;
    while (number != 0) {
        number /= 10;
        count++;
    }
    return count;
}
}

