package com.tree;

import java.util.LinkedList;
import java.util.List;

class Node {
	Integer id;
	List<Node> children = new LinkedList<>();

	public Node(Integer id) {
		this.id = id;
	}

	public void addChild(Node node) {
		children.add(node);
	}
	
	public Node containsChild(Node node) {
		for(Node child : children) {
			if(child.id.equals(node.id)) {
				return child;
			}
		}
		return null;
	}

	public List<Node> getChildren() {
		return children;
	}

	public Integer getData() {
		return id;
	}

	@Override
	public String toString() {
		return "Node [id=" + id + ", children=" + children+"]";
	}
}