package package1;

public class C_e__________Min_elem_array {

	public static void main(String[] args) {
		int[] num= {2,5,1,7,8,9};
		int min_elem=num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]<min_elem) {
				min_elem=num[i];
			}
		}
		System.out.println(" min_elem  "+min_elem);

	}

}
