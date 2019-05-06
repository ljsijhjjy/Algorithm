package ljs.ljs_190428;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stack_tab {
	// https://www.acmicpc.net/problem/2879
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int cnt = 5;
		int[] tab = {1,2,3,1,4};
		int[] corrTab = {2,1,5,4,3};*/
		
		Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
		scan.nextLine();
        String str = scan.nextLine();
        String str2 = scan.nextLine();
		String[] tab1 = str.split(" ");
		String[] tab2 = str2.split(" ");
		
		int[] tab = Arrays.asList(tab1).stream().mapToInt(Integer::parseInt).toArray();
        int[] corrTab = Arrays.asList(tab2).stream().mapToInt(Integer::parseInt).toArray();
		
		System.out.println(cntTab(cnt,tab,corrTab));
	}
	public static int cntTab(int cnt, int[] tab, int[] corrTab) {
		int rtnCnt=0;
		int temp=0;
		
		Stack<Integer> myStack = new Stack<Integer>();
		//myStack.setSize(cnt);
		
		for(int i=0; i<cnt; i++) {
			temp = tab[i]-corrTab[i];
			
			if(myStack.isEmpty()) {
				myStack.push(temp);
			}else {
				//스택에 뭐가 들어있을 경우 부호 확인하고 다를경우엔 이미 있던것들 계산하고 비우기
				if(checkPlMa(myStack,temp)) {//부호 같을경우 넣거나 안넣기
					if(temp>=0) { //양수의 경우 top보다 큰것만
						if(myStack.peek()<temp) {
							myStack.push(temp);
						}
					}
					else { //음수의 경우 top보다 더 작은것만 넣기 
						if(myStack.peek()>temp) {
							myStack.push(temp);
						}
					}
				}
				else { //부호 다르면 이미 있는것들만 계산하고 비우기 
					rtnCnt+=Math.abs(myStack.pop());
					myStack.removeAllElements();
					myStack.push(temp);
				}
			}
			System.out.println(myStack.toString());
			if(i==cnt-1) rtnCnt+=Math.abs(myStack.pop());
			System.out.println(rtnCnt);
		}
		
		return rtnCnt;
	}
	
	public static boolean checkPlMa(Stack<Integer> stack, int temp) {
		boolean check = false;
		
		if(stack.peek()>=0 && temp>=0)check = true;
		else if(stack.peek()<0 && temp<0)check = true;
		else check = false;
		
		return check;
	}
}
