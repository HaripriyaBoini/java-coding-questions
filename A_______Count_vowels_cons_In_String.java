package package1;
	public class A_______Count_vowels_cons_In_String{
		
	public static void main(String[] args) {
		 int vowelCount = 0;
				 int cons_Count = 0;    
         
	        
	        String str = "This is a really simple sentence";    
	          
	        str = str.toLowerCase();    
	            
	        for(int i = 0; i < str.length(); i++) {    
	              
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
	                    
	                vowelCount++;    
	            }    
	              
	            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
	                  
	                cons_Count++;    
	            }    
	        }    
	        System.out.println("Number of vowels: " + vowelCount);    
	        System.out.println("Number of consonants: " + cons_Count);     
            		
	}
	}

