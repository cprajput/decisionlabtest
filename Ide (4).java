/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length();
		Map<Character,Integer> map =new LinkedHashMap<>();
		
		for(int i=0;i<len;i++){
		    char c = str.charAt(i);
		
		    if(map.containsKey(c)){
		        map.put(c,map.get(c)+1);
		    }
		    else{
		        map.put(c ,1);
		    }
		}
		
		
    	Map<Character,Integer> sortedmap = sortmap(map);
    		
    		for(Map.Entry<Character,Integer> entry : sortedmap.entrySet()){
    		    System.out.println(entry.getKey() + "-" + entry.getValue());
    		}
    }
	
	
	
	
	public static Map<Character, Integer> sortmap(Map<Character,Integer> map) 
    { 
       
        List<Map.Entry<Character, Integer> > list =  new LinkedList<Map.Entry<Character, Integer> >(map.entrySet()); 
        
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() { 
            public int compare(Map.Entry<Character, Integer> value1,  Map.Entry<Character, Integer> value2) 
            { 
                return (value1.getValue()).compareTo(value2.getValue()); 
            } 
        }); 
        Map<Character, Integer> temp = new LinkedHashMap<Character, Integer>(); 
        
        for (Map.Entry<Character, Integer> entry : list) { 
            temp.put(entry.getKey(),entry.getValue()); 
        } 
        return temp; 
    } 
}
