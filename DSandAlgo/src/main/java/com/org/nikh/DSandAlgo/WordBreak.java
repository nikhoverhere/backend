package com.org.nikh.DSandAlgo;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {

	public static void main(String[] args) {
		
        String temp_dictionary[] = {"mobile","samsung","sam","sung",  
                "man","mango","icecream","and",  
                "go","i","like","ice","cream"}; 
        
        Set<String> dictionary = new HashSet<>(); 
        
        for (String temp :temp_dictionary) 
        { 
            dictionary.add(temp); 
        }
        String word = "ilikesamsung";
        int size = word.length(); 
        
        // base case 
        if (size == 0) {
        	System.out.println("true");
        }
        
          
        //else check for all words 
        for (int i = 1; i <= size; i++) 
        { 
            // Now we will first divide the word into two parts , 
            // the prefix will have a length of i and check if it is  
            // present in dictionary ,if yes then we will check for  
            // suffix of length size-i recursively. if both prefix and  
            // suffix are present the word is found in dictionary. 
  
            if (dictionary.contains(word.substring(0,i)) &&  
            		dictionary.contains( word.substring(i,size))){
                    	System.out.println("true");
                    }
        
        } 
        
        

	}

}
