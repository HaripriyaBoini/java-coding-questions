package package1;

public class C_d_____________Max_Elem_Array {

	public static void main(String[] args) {
                int[] number = {0,23,44,11,3,2};
                int max_elem=number[0];
                
                for(int i=0;i<number.length;i++) {
                	if(number[i]>max_elem) {
                		max_elem=number[i];
                		
                	}
                }
                System.out.println("max_element:  "+max_elem);
	}

}
