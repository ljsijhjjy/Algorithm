package ljs.ljs_190428;
import java.util.Stack;

public class Stack_stick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String stick = "()(((()())(())()))(())"; //17개
		String stick = "(((()(()()))(())()))(()())"; //24개
		Stack<Character> myStack = new Stack<Character>();
		int cnt=0;
		
		for(int i=0; i<stick.length(); i++) {
			char temp =stick.charAt(i);
			
			//() : 레이저 , 전의 (개수만큼 잘림 , ( 안뺌 
			// ) : 쇠막대기 끝 , 잘린것 +1 , (도 빼기 
			if(temp == '(' ){
				myStack.push(temp);
				//cnt++;
			}
			else if(temp == ')' && !myStack.isEmpty()) {
				myStack.pop();
				char checkStick = stick.charAt(i-1);
				//연속된 )) 일 경우는 쇠막대기의 끝을 의미 , ()는 레이저
				if(checkStick == '(') {
					cnt += myStack.size();
				}
				else cnt ++;
			}
		}
		System.out.println("잘린 막대의 총 개수 : "+cnt);
	}

}
