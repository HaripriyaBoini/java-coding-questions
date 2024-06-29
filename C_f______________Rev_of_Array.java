package package1;

public class C_f______________Rev_of_Array {
	
	public static void reverse(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		
		}
	

	public static void main(String[] args) {
		int numbers[]= {1,2,5,6,7,8,9}; 
		
		System.out.println("original array");
		printArray(numbers);
		
		reverse(numbers);
		System.out.println("reversed array : ");
		printArray(numbers);
		
		
			}
	public static void printArray(int[] arr) {
		for(int num:arr) {
			System.out.print(num+" ");
			
		}
		System.out.println();

}
}
