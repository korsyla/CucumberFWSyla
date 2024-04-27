package com.neotech.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		
		Map<String, String> map = new LinkedHashMap<>();
		
		map.put("firstName", "AYYY");
		map.put("lastName", "yayyy");
		map.put("age", "29");
		
		System.out.println(map);
		
		String name = map.get("firstName");
		System.out.println(name);
		String lastName = map.get("lastName");
		System.out.println(lastName);
		String age = map.get("age");
		

	}

}
