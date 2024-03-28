package test18;

//wait() : 동기화된 스레드를 대기
//notify() : 동기화된 스레드(wait)를 깨움


//입출금을 처리하는 클래스
class Account{
	
	int money = 0; //멤버 변수
	
	public int showMoney() {
		return money;
	}
	
	//입금하는 메소드
	public synchronized void setMoney() {//동기화
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.money +=200000;
		System.out.println("화성 갈끄니까 " + this.showMoney());
		this.notify(); //wait() 메소드를 깨울때 사용 -> 입금 메소드 수행이 끝나면
	}
	
	//출금하는 메소드
	public synchronized void getMoney() {
		while(money <= 0) {
			
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			this.money -= 300000;
			System.out.println("한강가기 전 금액 " + this.showMoney());
		}
	}

class MyMoney extends Thread{
	
	Account account; //입출금을 담당하는 Account 클래스의 객체를 생성해서 멤버 변수
	
	MyMoney(Account account){
		this.account = account;
	}

	@Override
	public void run() {
		for(int i =0; i<10; i++) {
			account.getMoney();
		}
	}
}

class MyAccount extends Thread{
	
	Account account;
	
	MyAccount(Account account){
		this.account = account;
	}

	@Override
	public void run() {
		for(int i =0; i<10; i++) {
			account.setMoney();
		}
	}
	
}

public class Synchronization3 {

	public static void main(String[] args) {
		
		Account account = new Account();
		System.out.println(account);
		System.out.println("================");
		
		MyMoney mm = new MyMoney(account);
		MyAccount mc = new MyAccount(account);
		
		mm.start();
		mc.start();

	}

}
