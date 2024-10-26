package Star_Pattern;

public class J____________Capital_A_Pattern {

	public static void main(String[] args) {
		int height = 7; // Number of rows for the letter 'A'
        int width = 5;  // Number of columns for the letter 'A'

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Conditions to print '*' for the letter 'A'
                if ((i == 0 && (j == 1 || j == 2 || j == 3)) || // Top part of 'A'
                    (i == 1 && (j == 1 || j == 3)) ||          // Upper diagonal lines
                    (i == 2 && (j == 0 || j == 4)) ||          // Middle diagonal lines
                    (i == 3 && (j >= 0 && j <= 4)) ||          // Horizontal middle line
                    (i > 3 && (j == 0 || j == 4))) {          // Lower diagonal lines
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println(); // Move to the next line after each row
        }

	}

}
