package com.neotech.practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ListOfMaps {

	public static void main(String[] args) {
		
		
		List<Map<String, String>> listOfMaps = new LinkedList<>();
		
		Map<String, String> map = new HashMap<>();
		map.put("firstName", "namii");
		map.put("lastName", "lasnamii");
		
		
		listOfMaps.add(map);
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("firstName", "namii2");
		map2.put("lastName", "lasnamii2");
		
		listOfMaps.add(map2);
		
		System.out.println(listOfMaps);

	}

}
