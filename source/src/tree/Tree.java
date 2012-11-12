package tree;

import java.util.*;

public class Tree <E extends Comparable<E>> implements Iterable<E>{
	private TreeNode topOfTree;

	public Tree() {
		topOfTree = null;
	}

	public void add(E thingToStore) {
		TreeNode thisOne = new TreeNode(thingToStore);

		// Is this the first node into the tree?
		// If so, just return it as the root

		if (topOfTree == null) {
			topOfTree = thisOne;
			return;
		}

		addInternal(thisOne, topOfTree);
	}

	private void addInternal(TreeNode thisOne, TreeNode currentTree) {

		int comparison = thisOne.compareTo(currentTree);

		if (comparison == 0) {
			throw new IllegalArgumentException("Tree can't contain duplicates");
		} else if (comparison < 0) {
			if (currentTree.leftSide == null) {
				currentTree.leftSide = thisOne;
			}
			else {
				addInternal(thisOne, currentTree.leftSide);
			}
		} else // comparison > 0
			{
			if (currentTree.rightSide == null) {
				currentTree.rightSide = thisOne;
			}
			else {
				addInternal(thisOne, currentTree.rightSide);
			}
		}
	}
	
	public Iterator<E> iterator() {
		List<E> sortedList = new ArrayList<E>();
		getSortedListInternal(topOfTree, sortedList);
		return sortedList.iterator();
	}
	
	private void getSortedListInternal(TreeNode currentTree, List<E> aList) {
		if(currentTree == null) {
			return;
		}
		
		getSortedListInternal(currentTree.leftSide, aList);
		aList.add(currentTree.thingToStore);
		getSortedListInternal(currentTree.rightSide, aList);
	}

	public E find(E what) {
		return findInternal(what, topOfTree);
	}

	private E findInternal(E what, TreeNode currentTree) {
		E objectToReturn;

		if (currentTree == null) {
			return null;
		}

		int comparison = what.compareTo(currentTree.thingToStore);

		if (comparison == 0) {
			objectToReturn = currentTree.thingToStore;
		} else if (comparison < 0) {
			objectToReturn = findInternal(what, currentTree.leftSide);
		} else // comparison > 0
			{
			objectToReturn = findInternal(what, currentTree.rightSide);
		}

		return objectToReturn;
	}
	
	private class TreeNode implements Comparable <TreeNode>{
		private E			thingToStore;
		private TreeNode	leftSide;
		private TreeNode	rightSide;

		public TreeNode(E what) {
			thingToStore = what;
		}

		@Override
		public String toString() {
			return thingToStore.toString();
		}

		public int compareTo (TreeNode what) {
			return thingToStore.compareTo(what.thingToStore);
		}
	}
}