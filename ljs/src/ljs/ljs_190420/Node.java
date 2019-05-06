package ljs.ljs_190420;

public class Node {
	public int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public int getData() {
		return data;
	}
	public Node getNext() {
		return next;
	}
	
	public String toString(Node node) {
		String nodeData = "[ "+node.data+"     I "+node.next+" ]";
		return nodeData;
	}
}
