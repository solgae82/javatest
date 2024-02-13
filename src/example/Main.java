package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("하나");	// 1. add
		list.add("둘");
		list.add("셋");
		
		System.out.println(list);
		System.out.println(list.get(1)); // 2. get
		
		list.add(1,"넷"); //끼워넣기
		
		System.out.println(list);
		
		list.set(1, "업데이트"); //3. set, 업데이트 
		
		System.out.println(list);

		System.out.println(list.size()); //4. size	
		
		list.remove(1);	// 5. remove
		System.out.println(list);
		
		System.out.println(list.get(1));
		
		list.clear();	// 6. clear
		System.out.println(list);

		if(list.isEmpty()) System.out.println("없다1"); // 7. isEmpty
				
		list.add("하나");
		list.add("둘");
		list.add("셋");
		list.add("셋");
		list.add("셋");

		if(list.isEmpty()) System.out.println("없다2");
		
		if(list.contains("하나")) System.out.println("하나 있다"); // 8. contains
		
		//9. iterator		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		
		}
		
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		
		}
		
		System.out.println("========for: 1");
		for(String ele : list) {
				
				System.out.println(ele);
			
		}
		System.out.println("========for: 2");
		for(String ele : list) {
				
				System.out.println(ele);
			
		}
			
		
		System.out.println(list.indexOf("셋")); // 10. indexOf
		System.out.println(list.lastIndexOf("셋")); // 11. lastIndexOf
		
		Map map = new HashMap<String, String>();
		
		// 1. put
		map.put("1","하나");
		map.put("2","둘");
		map.put("3","셋");
		
		System.out.println(map);
		
		// 2. get
		System.out.println(map.get("2"));
		
		// 3. size		
		System.out.println(map.size());
		
		// 4. remove		
		String m =(String)map.remove("1");
		System.out.println(m);

		System.out.println(map);
		
		// 5.clear
		map.clear();
		System.out.println(map);
	
		// 6. isEmpty
		if(map.isEmpty()) System.out.println("없다1");
		map.put("1","하나");
		map.put("2","둘");
		map.put("3","셋");
		if(map.isEmpty()) System.out.println("없다2");
		System.out.println(map);

			
		// 7. containsKey
		if(map.containsKey("1")) System.out.println("1있다");
		
		// 8. containsValue		
		if(map.containsValue("하나")) System.out.println("하나 있다");
		if(map.containsValue("둘라")) System.out.println("둘라 있다");
		
		
		String map2 = (String)map.replace("2", "둘라");
		
		System.out.println("map2=>" + map2);
		// 9.keySet
		
		Set<Object> keySet = map.keySet();
		
		for(Object key : keySet) {
			
			String s = (String)map.get(key);
			
			System.out.println(s);
		}
		
		// 10. entrySet
		
		Set <Map.Entry<String, String>> entrySet = map.entrySet();
		
		for(Map.Entry<String, String> entry : entrySet) {
			
			System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		map.forEach((key,value)->{
			System.out.println("key:"+key + ",value:"+ value);
		});
	}

}
