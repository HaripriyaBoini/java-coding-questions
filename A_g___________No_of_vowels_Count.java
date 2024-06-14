package package1;

public class A_g___________No_of_vowels_Count {

	public static void main(String[] args) {
		int count=0;
	String str="Hi hello";
	for(int i=0;i<str.length();i++) {
		char str2=str.charAt(i);
		if(str2=='a'|str2=='i'|str2=='e'|str2=='o'|str2=='u') {
			count++;
		}
		
	}
System.out.println("no of vowels are "+count);
	}

}
