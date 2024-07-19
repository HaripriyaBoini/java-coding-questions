package collection_framework;

import java.util.HashMap;
import java.util.Map;


public class MyHashMap {

    public static void main(String[] args) {
    	Map<Integer, String> hashmap1 = new HashMap<>();
        hashmap1.put(1, "haripriya");
        
        hashmap1.put(2, "hhhhhhhhh");
        hashmap1.put(3, "cccccc");              //put
        System.out.println(hashmap1);
        
        Map<Integer, String> hashmap2 = new HashMap<>();
        hashmap2.put(4, "ddddd");
        hashmap2.put(5, "eeeee");
        System.out.println(hashmap2);
        
        hashmap2.putAll(hashmap1);             //putAll
        System.out.println(hashmap2);
        
        String g=hashmap2.get(1);              //get(key)--->get(2)
        String h=hashmap2.remove(3);           // remove(key)
       
        System.out.println(g);
        System.out.println(h);
        
        if(hashmap2.containsKey(4))             //containKey(1)
        	System.out.println("is there");
        else
        	System.out.println("no");
        
        if(hashmap2.containsValue("cccc"))             //containKey(1)
        	System.out.println("is there");
        else
        	System.out.println("no");
        
        String replaced =hashmap2.replace(2, "hari");   //replace(key,value)
        System.out.println(replaced);
        
        int ss=hashmap2.size();
        System.out.println(ss);                         //size() 
        
        System.out.println(hashmap1.keySet());          //keySet()----{1,,2,3,4,5}
        System.out.println(hashmap1.values());          //values()----{hhhh,ccc,ddd}
        
        boolean str=hashmap2.isEmpty();              //isEmpty()
        System.out.println(str);
        
       
    }
}
