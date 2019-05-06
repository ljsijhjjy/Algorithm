package ljs.ljs_190420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Josephus {//linkedList
	// https://www.acmicpc.net/problem/1158 : �����۽� ���� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {7,3};//7��,3��°�� ����
		/* ���۸��� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        input = Integer.parseInt(str.split(" "));*/
		
		/* ��ĳ�ʻ�� 
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] temp = str.split(" ");
		
		int[] input = Arrays.asList(temp).stream().mapToInt(Integer::parseInt).toArray();*/
		
		//input = Integer.parseInt(temp);
        //Integer.parseInt(temp[0]);
        //Integer.parseInt(temp[1]);
        
		LinkedList<Integer> josephus_linkedList = new LinkedList<Integer>();
		
		for(int i=1; i<=input[0]; i++) {//������ ����
			josephus_linkedList.add(i); //josephus_linkedList.offer(i); ����
		}//1234567
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		int idx=0; //linkedlist�ּҸ� ���� idx
		
		while(!josephus_linkedList.isEmpty()) {//�ϳ��� �����ϰ� sb�� ������
			idx = (idx + ( input[1] - 1 ) ) % josephus_linkedList.size();
			//���ŵȼ��� ������(-1) �ٽ� 3��°   --size�� �������� �����
			//System.out.println(idx);
			sb.append(josephus_linkedList.get(idx));
			sb.append(josephus_linkedList.size()>1 ? ", " : "");
			josephus_linkedList.remove(idx);
			//System.out.println(sb.toString());
		}
		sb.append(">");
		
		System.out.println(sb.toString());
	}

}
