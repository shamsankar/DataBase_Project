package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringOccuranceCount {

	public static void main(String[] args) {
	
	        String str1 ="Clean India Green India Love India";
	        LinkedHashMap <String, Integer> hs1 = new LinkedHashMap<String, Integer>();
	        String[] words = str1.toLowerCase().split(" ");
	        for (String word: words) {
	            if (hs1.containsKey(word))
	            {
	                hs1.put(word, hs1.get(word)+1);
	                
	            }
	                else {
	                    hs1.put(word,1);
	                }
	            }
	        
	        for (Map.Entry<String, Integer> entry1 : hs1.entrySet()) {
	            System.out.print(entry1.getKey()+" ");
	            System.out.print(entry1.getValue()+" ");
	        }
	    }
		// TODO Auto-generated method stub

	}


