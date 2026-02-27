package Lambda;
interface square{
	public int print(int num);
}

public class Ex2 {
	public static void main(String[] args) {
		
	
	square s=n->n*n;
	System.out.println(s.print(2));
	
	square r=n->{
		System.out.println("lambda with return type");
		return n*n;
		
	};
	System.out.println(r.print(4));
	

	}
}
