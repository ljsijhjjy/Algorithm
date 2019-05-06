package ljs.ljs_190420;

public class LinkedList{
	Node head;
	Node tail;
	//LinkedList linkedList;
	
	public void addFirst(Node newNode) {
		if(head!=null) {
			//FirstNode ã��
			Node temp = head;
			newNode.next = temp;
			head = newNode;
		}else {
			head = newNode;
			tail = newNode;
		}
	}
	
	public void addLast(Node newNode) {
		if(head!=null) {
			//lastNode ã��
			Node temp = head;
			while(temp.next != null) {
				temp=temp.next;
			}
			//LastNode �������� ����
			temp.next = newNode;		
			//tail����
			this.tail = newNode;
		}else {
			head = newNode;
			tail = newNode;
		}
	}
	
	public void add(int idx,Node newNode) {
		//idx ã��
		int cnt=1;
		if(head!=null) {
			Node temp = head;
			while(temp.next!=null) {
				cnt++;
				if(cnt==idx) {
					newNode.next = temp.next;
					temp.next = newNode;
					break;
				}
				temp = temp.next;
			}
		}else {
			System.out.println("CHECK LINKEDLIST'S LENGTH");
		}
	}
	
	public void deleteFirst() {
		if(head!=null) {
			Node temp = head;
			if(temp.next!=null) {
				head = temp.next;
			}else head = null;
		}else {
			System.out.println("No Exist LinkedList");
		}
	}
	
	public void deleteLast() {
		if(head!=null) {
			Node temp = head;
			while(temp.next!=null) {
				if(temp.next.next==null) {
					temp.next = null;
					break;
				}else temp = temp.next;
				
			}
		}else {
			System.out.println("No Exist LinkedList");
		}
	}
	
	public void delete(int idx) {
		//idx ã��
		int cnt=1;
		if(head!=null) {
			Node temp = head;
			if(temp.next==null)head = null;
			while(temp.next!=null) {
				cnt++;
				if(cnt==idx) {
					if(temp.next.next!=null) {
						temp.next = temp.next.next;
					}else temp.next = null;
					break;
				}
				temp = temp.next;
			}
		}else {
			System.out.println("CHECK LINKEDLIST'S LENGTH");
		}
	}

	public String toString() {
		String str="[ ";
		if(head!=null) {
			Node temp = head;
			str+=temp.data;
			if(temp.next==null) {
				str+=" ]";
			}else str+=", ";
			while(temp.next != null) {
				temp = temp.next;
				str+=temp.data;
				if(temp.next!=null)str+=", ";
				else str+=" ]";
			}
		}else str = "No Exist LinkedList";
		return str;
	}
}
