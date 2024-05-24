package package1;


public class ArrayList {

	public static void main(String[] args) {
		java.util.ArrayList<String> fruits = new java.util.ArrayList<String>();
		fruits.add("apples");
		fruits.add("banana");
		System.out.println(fruits);
		
		fruits.add(2,"watermelon");  // add(1,fruit);
		fruits.add(3,"potato"); 
		fruits.remove("potato");      //remove()
		System.out.println(fruits);                   //fruits:--apples banana,watermelon
		
		java.util.ArrayList<String> veggies = new java.util.ArrayList<String>();
		veggies.add("onion");
		veggies.add("tomato");
		veggies.add("banana");
		 veggies.addAll(fruits);            //addAll
		 System.out.println("-----2---");
		 System.out.println(veggies);
		 
		 if(fruits.contains(null))                //fruit.contains(xxx)
		System.out.println("no fruits available");
		 else
			 System.out.println(fruits+"available");
		 
		 veggies.retainAll(fruits);              //retainAll-common word
		 System.out.println("--common b/w veggies and fruits------------");
		 System.out.println(fruits);
		 
		 System.out.println(fruits.removeAll(veggies));   //removeAll()
		 System.out.println(fruits);
		
		 System.out.println(veggies);
		 
		 
		 System.out.println(fruits.size());              //size(_
if(veggies.isEmpty())
		System.out.println("veggies empty");             //isEmpty()
else
	System.out.println("not empty");

System.out.println(fruits.equals(veggies));               //equals()
System.out.println(veggies.get(2));                               //get()
System.out.println(veggies.set(2,"haripriya"));
System.out.println(veggies);
System.out.println(veggies.hashCode());                 //unique value for hashcode()
System.out.println(veggies.subList(2, 4));              //displays index values subList()

	}

}
