package main.java.tree;

public class Main {
	public static void main(String[] args) {
		TreeNode drinks = new TreeNode("Drinks");
		
		
		TreeNode hot = new TreeNode("hot");
		TreeNode tea = new TreeNode("tea");
		hot.addChild(tea);
		
		
		TreeNode cold = new TreeNode("cold");
		TreeNode fanta = new TreeNode("fanta");
		cold.addChild(fanta);
		
		
		drinks.addChild(hot);
		drinks.addChild(cold);
		
		System.out.println(drinks.print(0));
	}
}
