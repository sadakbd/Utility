package com.cuet;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
	
	
	public void init() {
		Pair pair1 = new Pair(new BigInteger("33"),new BigInteger(("34")));
		Pair pair2 = new Pair(new BigInteger("34"),new BigInteger(("35")));
		Pair pair3 = new Pair(new BigInteger("34"),new BigInteger(("39")));
		Pair pair4 = new Pair(new BigInteger("35"),new BigInteger(("36")));
		List<Pair> pairs = new ArrayList();
		pairs.add(pair1);
		pairs.add(pair2);
		pairs.add(pair3);
		pairs.add(pair4);
		Node root = new Node(new BigInteger("33"));
		
		for(Pair pair : pairs) {
			Node pNode = new Node(pair.pId);
			
			Node node = root.findNodebyValue(pair.cId, root);
			if(node != null) {
				node.addChild(pNode);
			}
		}
		System.out.println("node: "+root);
	}
	
	
	public static void main(String[] args) {
		MainApp app = new MainApp();
		app.init();
	}

}
