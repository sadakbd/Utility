package com.cuet;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Node {
	private BigInteger value;

	@Override
	public String toString() {
		return "Node [value=" + value + ", children=" + children + "]";
	}

	private List<Node> children = new ArrayList<>();

	public Node(BigInteger value) {
		this.value = value;
	}

	public Node findNodebyValue(BigInteger input, Node node) {

		if (node != null) {
			if (node.value.equals(input)) {
				return node;
			} else {
				Node foundNode = null;
				for (Node child : node.children) {

					foundNode = findNodebyValue(input, child);
					if (foundNode != null)
						return foundNode;
				}

			}
		}

		return null;

	}

	public void addChild(Node child) {
		children.add(child);
	}

}