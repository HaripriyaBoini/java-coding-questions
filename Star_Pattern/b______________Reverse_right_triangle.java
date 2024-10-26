package Star_Pattern;


// Reverse right triangle
//               *
//              **
//             ***
//            ****
//           *****


public class b______________Reverse_right_triangle {

	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				
			}for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}





//*
//**
//***
//****     *****
//**********
