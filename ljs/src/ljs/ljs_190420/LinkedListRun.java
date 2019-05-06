package ljs.ljs_190420;

public class LinkedListRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList = new LinkedList();
		Node A = new Node(0);
		Node B = new Node(2);
		Node C = new Node(9);
		Node D = new Node(9);
		
		Node E = new Node(2);
		Node F = new Node(9);
		Node G = new Node(2);
		Node H = new Node(2);

		System.out.println(linkedList.toString());
		linkedList.addFirst(A);
		System.out.println(linkedList.toString());
		linkedList.addFirst(B);
		System.out.println(linkedList.toString());
		linkedList.addFirst(C);
		System.out.println(linkedList.toString());
		linkedList.add(3,D);
		System.out.println(linkedList.toString());
		linkedList.addLast(E);
		System.out.println(linkedList.toString());
		linkedList.addLast(F);
		System.out.println(linkedList.toString());
		linkedList.addLast(G);
		System.out.println(linkedList.toString());
		linkedList.add(7,H);
		System.out.println(linkedList.toString());
		
		linkedList.deleteFirst();
		System.out.println(linkedList.toString());
		linkedList.delete(3);
		System.out.println(linkedList.toString());
		linkedList.deleteLast();
		System.out.println(linkedList.toString());
	}

}
