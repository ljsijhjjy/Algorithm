package ljs.ljs_190428;

public class Stack<E extends Object> {
	public int size;
	public int top; //top ��ġ
	public E[] stack;
	
	public Stack(int size) {
		this.size = size;
		this.top = -1;
		//�Է¹��� Ÿ���� ���� (size)��ŭ ����� : ĳ���� �ʿ�
		stack = (E[]) new Object[size]; 
	}
	
	public void push(E e) {
		top++;
		this.stack[top]=e;
	}
	
	public E pop() {
		E e = this.stack[top];
		top--;
		return e;
	}
	
	public E peek() {
		E e = this.stack[top];
		return e;
	}
	
	public int size() {
		return size;
	}
	
	public E get(int i) {
		//�߰��� �ִ°� �˰������ �ܼ��� index�� �˸� ��ȯ�� �ǳ�
		//�ƴϸ� �����͵��� pop���� ������ ������ ���������θ� �˾ƾ� �ϳ�?
		int temp = i;
		E e = this.stack[temp];
		return e;
	}
}
