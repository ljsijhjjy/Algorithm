package ljs.ljs_190428;
import java.util.Stack;

public class Stack_stick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String stick = "()(((()())(())()))(())"; //17��
		String stick = "(((()(()()))(())()))(()())"; //24��
		Stack<Character> myStack = new Stack<Character>();
		int cnt=0;
		
		for(int i=0; i<stick.length(); i++) {
			char temp =stick.charAt(i);
			
			//() : ������ , ���� (������ŭ �߸� , ( �Ȼ� 
			// ) : �踷��� �� , �߸��� +1 , (�� ���� 
			if(temp == '(' ){
				myStack.push(temp);
				//cnt++;
			}
			else if(temp == ')' && !myStack.isEmpty()) {
				myStack.pop();
				char checkStick = stick.charAt(i-1);
				//���ӵ� )) �� ���� �踷����� ���� �ǹ� , ()�� ������
				if(checkStick == '(') {
					cnt += myStack.size();
				}
				else cnt ++;
			}
		}
		System.out.println("�߸� ������ �� ���� : "+cnt);
	}

}
