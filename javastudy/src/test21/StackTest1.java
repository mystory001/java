package test21;

import java.util.ArrayList;

class Stack{
	
	//스택 : 가장 나중에 들어온 자료가 가장 먼저 나가는 구조(Last-In First Out)
	//데이터 저장 push(), 데이터 꺼내기 pop()
	
	
	private ArrayList<String> arrayStack = new ArrayList<String>();

	//스택 맨 뒤에 요소를 추가 메소드
	public void push(String data) {
		arrayStack.add(data);
	}
	
	//스택의 맨 뒤에서 요소를 꺼내는 메소드
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return arrayStack.remove(len-1);
	}
	
}

public class StackTest1 {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		

	}

}
