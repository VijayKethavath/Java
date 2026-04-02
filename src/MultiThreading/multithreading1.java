package MultiThreading;

public class multithreading1 {
	public static void main(String[] args) throws Exception {
		Runnable r1= ()->{
			for(int i=0;i<=5;i++) {
				System.out.println("Task "+i);
				
			}
		};
		
		Runnable r2= ()->{
			for(int i=6;i<=10;i++) {
				System.out.println("Task "+i);
			}
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		System.out.println(t1.getState());
		
		t1.start();
		System.out.println(t1.getState());
//		t1.join();
		t1.sleep(2000);
		t2.start();
		System.out.println(t1.getState());
		
	}
	
	}


