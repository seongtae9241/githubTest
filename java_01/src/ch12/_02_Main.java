package ch12;

public class _02_Main {
	public static void main(String[] args) {
		/* (2) Runnable 인터페이스를 구현하기
		* 1. Runnable 인터페이스를 implements 받아 클래스를 작성한다.
		* 2. 추상메서드 run()을 재정의(Override)한다.
		* 3. main() 메서드에서 Thread 객체를 생성하고, 이때 implements 받은 클래스객체를 매개변수로 전달한다.
		* 4. start() 메서드를 호출해서 스레드를 실행한다.
		* 5. run() 메서드가 실행된다.
		*/
		
		Thread thread = new Thread(new _02_MyThread());
		thread.start();
	}
}
