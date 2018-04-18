package com.app2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OrderByValue {

	public void mapOrder() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		Map<String, Object > map1 = new HashMap<String, Object >();
		map1.put("name", "www");
		map1.put("id", 5);
		map1.put("cid", 10);

		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("name", "ttt");
		map2.put("id", 4);
		map2.put("cid", 11);

		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("name", "ggg");
		map3.put("id", 7);
		map3.put("cid", 13);
		Map<String, Object> map4 = new HashMap<String, Object>();
		map4.put("name", "dd");
		map4.put("id", 7);
		map4.put("cid", 12);

		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);

		Collections.sort(list, new Comparator<Map<String, Object>>() {
			public int compare(final Map<String, Object> o1, final Map<String, Object> o2) {
				Integer child11 = (Integer) o1.get("id");
				Integer child12 = (Integer) o2.get("id");
				Integer child21 = (Integer) o1.get("cid");
				Integer child22 = (Integer) o2.get("cid");
				
				int childComp = child11.compareTo(child12);
				return ((childComp == 0) ? child21.compareTo(child22) : childComp);

			}


		});
		for (Map<String, Object> entry : list) {
			System.out.println(entry.get("name") + " ==== " + entry.get("id")+" ==== " + entry.get("cid"));
		}

	}

	public static void main(String a[]) {
		OrderByValue orderByValue = new OrderByValue();
		orderByValue.mapOrder();

	}
}
