package ds.collections.HashMapEx2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
  
Process the i/p and print the number of times every word is repeated.
i/P : words
"java", "php", "android", "sap", 
					"php", "java", "win", "ios", "win", "hana",
					"android","ios","ios"

o/p:  wordName - frequency 
word : java, count=2
word : sap, count=1
word : android, count=2
word : php, count=2
word : ios, count=3
word : hana, count=1
word : win, count=2

 */
public class WordsCount {
	public static void main(String[] args) {
	//input list
		List<String> inputWords =	
			Arrays.asList("java", "php", "android", "sap", 
					"php", "java", "win", "ios", "win", "hana",
					"android","ios","ios");
	
		//create a  map
	// key : Word [String]
	// value: count [Integer]
	
	Map<String,Integer> wordsCount = new HashMap<>(); // 
	//create a hash map key as string  and integer as value
	//process each word and add to map using the loop
	
	
	for(String word:inputWords){
		if(wordsCount.containsKey(word)){
			int currCount = wordsCount.get(word);
			currCount++;
			//add word to map with updated count
			wordsCount.put(word,currCount);
		}else{
			//add word to map with count as 1
			wordsCount.put(word,1);
		}
	}
	
	//print all words with count
	for(Entry entry: wordsCount.entrySet()){
		System.out.println("word : "+entry.getKey() +
				", count="+entry.getValue());
	}
	
	}
}
