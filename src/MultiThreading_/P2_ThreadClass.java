package MultiThreading_;

class mythread extends Thread{
	
	public void run(){
		for(int i = 0;i<=10;i++) {
			System.out.println("Hello");
		}
	}
}

public class P2_ThreadClass {

	public static void main(String[] args) {
		mythread t = new mythread();
		t.start();
        
		for(int i = 0;i<=10;i++) {
			System.out.println("Hi");
		}
	}

}
