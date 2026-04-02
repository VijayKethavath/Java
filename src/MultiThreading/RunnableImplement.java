package MultiThreading;

class Emp implements Runnable{
	@Override
	public void run() {
		System.out.println("Employee "+Thread.currentThread().getName());
	}
}
class Mgr implements Runnable{
	@Override
	public void run() {
		System.out.println("Manager "+Thread.currentThread().getName());
	}
}



public class RunnableImplement {
	public static void main(String[] args) {
		
	Emp e=new Emp();
	Thread t1=new Thread(e, "E");
    t1.start();
    
    Mgr m=new Mgr();
    Thread t2=new Thread(m, "M");
    t2.start();
    
    Runnable a=new Runnable() {
    	public void run() {
    		System.out.println("Anonymous Implementation");
    	}
    };
    Thread t3=new Thread(a);
    t3.start();
    
    Runnable L= ()->System.out.println("Lamda implementation");
    Thread t4 = new Thread(L);
    t4.start();
	}

}
