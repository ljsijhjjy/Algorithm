package ljs.ljs_190428;

public class Stack<E extends Object> {
	public int size;
	public int top; //top 위치
	public E[] stack;
	
	public Stack(int size) {
		this.size = size;
		this.top = -1;
		//입력받은 타입의 스택 (size)만큼 만들기 : 캐스팅 필요
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
		//중간에 있는걸 알고싶을때 단순히 index만 알면 반환이 되나
		//아니면 위에것들을 pop으로 빼내고 무조건 위에것으로만 알아야 하나?
		int temp = i;
		E e = this.stack[temp];
		return e;
	}
}
