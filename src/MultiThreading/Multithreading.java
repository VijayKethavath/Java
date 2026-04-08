package MultiThreading;

class employee extends Thread{
	@Override
	public void run() {
		System.out.println("Employee "+Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
	}
}

class manager extends Thread{
	@Override
	public void run() {
		System.out.println("Manager:"+Thread.currentThread().getName()+">>"+Thread.currentThread().getId());
		
	}
}

public class Multithreading {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		
		employee e =new employee();
		e.start();
		
		
		manager m=new manager();
		m.start();
		
		System.out.println("count: "+Thread.activeCount());
		

	}

}
