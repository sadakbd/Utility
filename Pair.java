package com.tree;

public class Pair {

	public final Integer childId;
	public final Integer parentId;

	public Pair(Integer childId, Integer parentId) {
		this.childId = childId;
		this.parentId = parentId;
	}

	@Override
	public String toString() {
		return "Pair [childId=" + childId + ", parentId=" + parentId + "]";
	}
	
	

}
