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
				//���ÿ� ���� ������� ��� ��ȣ Ȯ���ϰ� �ٸ���쿣 �̹� �ִ��͵� ����ϰ� ����
				if(checkPlMa(myStack,temp)) {//��ȣ ������� �ְų� �ȳֱ�
					if(temp>=0) { //����� ��� top���� ū�͸�
						if(myStack.peek()<temp) {
							myStack.push(temp);
						}
					}
					else { //������ ��� top���� �� �����͸� �ֱ� 
						if(myStack.peek()>temp) {
							myStack.push(temp);
						}
					}
				}
				else { //��ȣ �ٸ��� �̹� �ִ°͵鸸 ����ϰ� ���� 
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
