package MultiThreading;
class Employee extends Thread{
	public Employee(String tname) {
		super(tname);
	}
	@Override
	public void run() {
		System.out.println("Employee "+Thread.currentThread().getName()+"->"+Thread.currentThread().getId());
		
	}
}
class Manager extends Thread{
	public Manager(String tname) {
		super(tname);
	}
	@Override
	public void run() {
		System.out.println("Manager "+Thread.currentThread().getName()+"->"+Thread.currentThread().getId());
		
	}
}

public class ExtendImplement {
	public static void main(String[] args) {
		Employee e =new Employee("E");
		e.start();
		
		Manager m= new Manager("M");
		m.start();
		
		System.out.println("Thread Count: " +Thread.activeCount());
		
	}

}


