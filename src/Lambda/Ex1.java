package Lambda;

interface lambda{
	public void print();
	
}
public class Ex1 {

	public static void main(String[] args) {
	lambda obj=()-> System.out.println("lambda");
			obj.print();

	}

}
