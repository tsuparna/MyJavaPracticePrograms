package hackerrank.strings.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class IsAnagram {
	
	
	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        scan.close();
        boolean ret = isAnagramUsingArrays(str1, str2);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
        
        ret = isAnagramUsingHashMap(str1, str2);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
        
        ret = isAnagramCharCount(str1, str2);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
	
	//1
	static boolean isAnagramUsingArrays(String str1, String str2) {
        boolean isAnagram=false;
        
        if(str1.length()==str2.length()) {
        	str1=str1.toUpperCase();
        	str2=str2.toUpperCase();
            
            char[] charArray1=str1.toCharArray();
            char[] charArray2=str2.toCharArray();
            
           
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            
            isAnagram= Arrays.equals(charArray1, charArray2);
        }
        
        return isAnagram;
    }
	
	
	//2
	static boolean isAnagramUsingHashMap(String str1, String str2) {
        boolean isAnagram=false;
        
        if(str1.length()==str2.length()) {
        	str1=str1.toUpperCase();
        	str2=str2.toUpperCase();
        	
            HashMap<Character, Integer> hashMap1 =  createCharCountMapKeys(str1);
            HashMap<Character, Integer> hashMap2 =  createCharCountMapKeys(str2);
        	
            isAnagram = hashMap1.equals(hashMap2);
            
        }
        
        return isAnagram;
    }
	
	
	//2.1
	static HashMap<Character, Integer> createCharCountMapKeys(String str) {
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		char[] strChars = str.toCharArray();
		for(char ch: strChars) {
			if(hashMap.containsKey(ch)) {
				int charCount = (int) hashMap.get(ch);
				hashMap.put(ch, charCount+1);
			}else {
				hashMap.put(ch, 1);
			}
		}
		return hashMap;
	}
	
	
	//3
	private static int characterRange=256;
	static boolean isAnagramCharCount(String str1, String str2) {
       
        if(str1.length()==str2.length()) {
        	str1=str1.toUpperCase();
        	str2=str2.toUpperCase();
        	
        	
        	int count[] = new int[characterRange];
        	for(int i=0; i<str1.length(); i++) {
        		count[str1.charAt(i)]++;
        		count[str2.charAt(i)]--;
        	}
        	
        	for(int i=0; i<characterRange; i++) {
        		if(count[i]!=0) {
        			return false;
        		}
        	}
        	
        }else {
        	return false;
        }
        
        return true;
    }

}
