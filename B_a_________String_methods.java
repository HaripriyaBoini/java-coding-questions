package package1;

public class B_a_________String_methods {

	public static void main(String[] args) {
		String s1="good morning hyderabad";
		//length()
		System.out.println("length of a string "+"("+s1.length()+")");      //1
		
		//lowercase and uppercase
		
		System.out.println("Lowercase string "+"("+s1.toLowerCase()+")");    //2
		System.out.println("uppercase string "+"("+s1.toUpperCase()+")");    //3
		
		//substring(index1,index2)
        System.out.println("substring of s1 is :"+s1.substring(2, 7));  //prints upto 6th letter //4
        //contains(string)
        System.out.println(s1.contains("morning"));  //returns true false   //5
        //replace()
        System.out.println(s1.replace('g', 'f'));     //6
        
        //split()
         String[] fruits = s1.split(" ");         //make sure wherever that space is there at that point it will be splitted
        
       System.out.println("Original String: " + s1);             //7
        System.out.println("Fruits after splitting by comma:");
        for (String fruit : fruits) {
            System.out.println(fruit);
            
        }
        String s2="haripriya";
        if(s1.equals(s2))                                           //8
        System.out.println("true they are equal");
        else
        	System.out.println("false not equal");
        
        //startWith()
        
        System.out.println(s1.startsWith("good"));                    //9
        //endWith()
        System.out.println(s1.endsWith("morning"));                  //10
        if(s1.equalsIgnoreCase(s2)) {                                 //11
        	System.out.println(true);
        }
      System.out.println(s1.charAt(7));                               //12
      System.out.println(s1.concat(s2));                              //13
      
      System.out.println(s1.indexOf("d"));
      System.out.println(s1.lastIndexOf("g"));                     //14
      
      System.out.println(s1.isEmpty());                             //15
      System.out.println(s1.trim());
      
      
      
      
        	
        

	}

}
