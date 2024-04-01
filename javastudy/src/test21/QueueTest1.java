package test21;

import java.util.ArrayList;

class Queue{
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	//큐 : 처음 들어온 자료가 가장 먼저 나가는 구조 First In First Out
	//enQueue(), deQueue()
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue(){
		int len = arrayQueue.size();
		if(len ==0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return arrayQueue.remove(0);
	}
}

public class QueueTest1 {

	public static void main(String[] args) {

		Queue queue = new Queue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
	}

}
