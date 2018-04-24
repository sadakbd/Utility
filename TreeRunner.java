package com.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeRunner {

	/*
	 * 14833 14834 14834 14835 14835 14820 14834 96636 96636 36637 14835 36638 36638
	 * 1000 34585 32899
	 * 
	 */
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


	public static void main(String[] args) {
		List<Pair> pairs = new ArrayList<Pair>();
		Pair pair1 = new Pair(14833, 14834);
		Pair pair2 = new Pair(14834, 14835);
		Pair pair3 = new Pair(14835, 14820);
		Pair pair4 = new Pair(14834, 96636);
		Pair pair5 = new Pair(96636, 36637);
		Pair pair6 = new Pair(14835, 36638);
		Pair pair7 = new Pair(36638, 1000);
		Pair pair8 = new Pair(34585, 32899);
		pairs.add(pair1);
		pairs.add(pair2);
		pairs.add(pair3);
		pairs.add(pair4);
		pairs.add(pair5);
		pairs.add(pair6);
		pairs.add(pair7);
		pairs.add(pair8);
		Node root = new Node(14833);
		Node temp = root;
		for (Pair pair : pairs) {
			System.out.println(temp.id + "---" + pair.childId);
			Node childNode = new Node(pair.parentId);
			Node node = root.containsChild(childNode);
			System.out.println("Child: " + childNode.id+" contains: "+node);
			if (pair.childId.equals(temp.id) || node != null) {

				if(node != null) {
					System.out.println("somethimg");
				}
				
				root.addChild(childNode);
				temp = childNode;
				System.out.println("root: " + root);
			} else {
				System.out.println("Hi");
			}
		}
	}
}
