package ljs.ljs_190420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Josephus {//linkedList
	// https://www.acmicpc.net/problem/1158 : 조세퍼스 문제 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {7,3};//7명,3번째씩 제거
		/* 버퍼리더 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        input = Integer.parseInt(str.split(" "));*/
		
		/* 스캐너사용 
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] temp = str.split(" ");
		
		int[] input = Arrays.asList(temp).stream().mapToInt(Integer::parseInt).toArray();*/
		
		//input = Integer.parseInt(temp);
        //Integer.parseInt(temp[0]);
        //Integer.parseInt(temp[1]);
        
		LinkedList<Integer> josephus_linkedList = new LinkedList<Integer>();
		
		for(int i=1; i<=input[0]; i++) {//순차적 삽입
			josephus_linkedList.add(i); //josephus_linkedList.offer(i); 차이
		}//1234567
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		int idx=0; //linkedlist주소를 위한 idx
		
		while(!josephus_linkedList.isEmpty()) {//하나씩 제거하고 sb에 담을것
			idx = (idx + ( input[1] - 1 ) ) % josephus_linkedList.size();
			//제거된숫자 전부터(-1) 다시 3번째   --size는 원순열을 고려함
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
