package d.dictionary;

import java.util.*;

public class Dictionary {
	
	private Map<String, String> definitions = new TreeMap<>();
	
	public void buildDictionary() {
		definitions.put("acrobat", "a person who is able to perform tricks that requires limb flexibility");
		definitions.put("bat", "an animal that lives in caves");
		definitions.put("car", "a machine made for transportation");
		definitions.put("dead", "not alive, a entity whose inner parts has ceased to function");
		definitions.put("eccentric", "known to few");
	}
	
	public void addEntry(String key, String value) throws DictionaryException {
		key = key.toLowerCase();
		value = value.toLowerCase();
		
		if(key != null && key != "" && value != null && value != "") {
			if(!definitions.containsKey(key)) {				
				definitions.put(key, value);
				System.out.println("Entry added!");
				System.out.println(key + " = " +  definitions.get(key) + ".");
				
			} else {
				throw new DictionaryException("Error: Word already exists in the dictionary.");
			}
		} else {
			throw new DictionaryException("Error: Empty input is forbidden.");
		}
	}
	
	public String getDefiniton(String key) {
		key = key.toLowerCase();
		
		if(definitions.containsKey(key)) {			
			return  key + " = " + definitions.get(key);
		}
		return null;
	}
	
	public void editEntry(String key, String value) throws DictionaryException {
		key = key.toLowerCase();
		value = value.toLowerCase();
		
		if(definitions.containsKey(key)) {
			definitions.replace(key, value);
			System.out.println("Entry edited!");
			System.out.println(key + " = " +  definitions.get(key) + ".");
		} else {
			throw new DictionaryException("Error: Word not found.");
		}
	}
	
	public void deleteEntry(String key) throws DictionaryException {
		key = key.toLowerCase();
		
		if(definitions.containsKey(key)) {
			definitions.remove(key);
			System.out.println("Entry removed!");
		} else {
			throw new DictionaryException("Error: Word not found.");
		}
	}
	
	public Set<String> getAllExistingEntries() {
		return definitions.keySet();
	}
	
}
