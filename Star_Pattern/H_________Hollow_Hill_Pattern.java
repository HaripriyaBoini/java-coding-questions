package Star_Pattern;



//Hallow triangle
//                            * 
//                           * * 
//                          *   * 
//                         *     * 
//                        *       * 
//                       *         * 
//                      * * * * * * * 

public class H_________Hollow_Hill_Pattern {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
				
			}
			
			for(int j=1;j<=i;j++) {
				if(i==n||j==1||j==i) {
				System.out.print("*");}
				else {
					System.out.print(" ");
					}
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}

}
