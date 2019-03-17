package ds.collections.HashMapEx2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WordsCount {
	public static void main(String[] args) {
	List<String> inputWords =	
			Arrays.asList("java", "php", "android", "sap", 
					"php", "java", "win", "ios", "win", "hana",
					"android","ios","ios");
	
	Map<String,Integer> wordsCount = new HashMap<String,Integer>();
	
	for(String word:inputWords){
		if(wordsCount.containsKey(word)){
			int currCount = wordsCount.get(word);
			currCount++;
			wordsCount.put(word,currCount);
		}else{
			wordsCount.put(word,1);
		}
	}
	
	for(Entry entry: wordsCount.entrySet()){
		System.out.println("word : "+entry.getKey() +
				", count="+entry.getValue());
	}
	
	}
}
