package main.java.tree;

import java.util.ArrayList;
import java.util.Iterator;

public class TreeNode {
	private String data;
	private ArrayList<TreeNode> children;
	
	public TreeNode(String data) {
		this.data = data;
		this.children = new ArrayList<>();
	}
	
	public void addChild(TreeNode node) {
		this.children.add(node);
	}
	
	public String print(int level) {
		
		String ret;
		ret = " ".repeat(level) + data + "\n";
		for(TreeNode treeNode : this.children) {
			ret += treeNode.print(level + 1);
		}
		return ret;
	}
}
