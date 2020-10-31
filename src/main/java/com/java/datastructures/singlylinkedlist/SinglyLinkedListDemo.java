package com.java.datastructures.singlylinkedlist;

class Node<T extends Comparable<T>> {
	private T data;
	private Node<T> nextNode;

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setdData(T data) {
		this.data = data;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> newNextNode) {
		this.nextNode = newNextNode;
	}

}

class LinkedListDemo<T extends Comparable<T>> {
	private Node<T> root;
	private int numberOfNodes;

	public void insert(T data) {
		Node<T> node = new Node<T>(data);
		if (root == null) {
			this.root = node;
		} else {
			Node<T> oldRoot = this.root;
			this.root = node;
			this.root.setNextNode(oldRoot);
		}
	}

	public void traverseList() {
		if (this.root == null) {
			System.out.println("Linked List is empty");
		}
		Node<T> node = this.root;
		while (node != null) {
			System.out.println(node.getData());
			node = node.getNextNode();
		}
	}

}

public class SinglyLinkedListDemo {

	public static void main(String[] args) {

		LinkedListDemo linkedListDemo = new LinkedListDemo();
		linkedListDemo.insert(10);
		linkedListDemo.insert(20);
		linkedListDemo.insert(30);
		linkedListDemo.insert(40);
		linkedListDemo.insert(50);
		linkedListDemo.insert(60);

		linkedListDemo.traverseList();

	}
}
