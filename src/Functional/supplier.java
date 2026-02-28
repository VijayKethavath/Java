package Functional;

import java.util.function.Supplier;
public class supplier {

	public static void main(String[] args) {
		Supplier<String> s=new Supplier<String>() {
			public String get(){
				return "Hello vijay";
			}
		};
		System.out.println(s.get());

	}

}
