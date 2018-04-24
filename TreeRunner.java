package com.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeRunner {

	private void prepData() {

		pairs.sort((p1, p2) -> {
			if (p1.childId.compareTo(p2.childId) == 0) {
				return p1.parentId.compareTo(p2.parentId);
			} else {
				return p1.childId.compareTo(p2.childId);
			}
		});

		for (Pair pair : pairs) {
			System.out.println(pair.childId + "->" + pair.parentId);
		}


	}
}
