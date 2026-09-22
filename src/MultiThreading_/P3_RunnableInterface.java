package MultiThreading_;


class mythread1 implements Runnable{
	
	@Override
	public void run(){
		for(int i = 0;i<=10;i++) {
			System.out.println("Hello");
		}
	}
}
public class P3_RunnableInterface {

	public static void main(String[] args) {
		
		mythread1 r = new mythread1();
		Thread t = new Thread(r);
		t.start();

	}

}
