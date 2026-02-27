package Functional;

import java.util.function.Consumer;

public class consumer {

	public static void main(String[] args) {
		
		Consumer<String> c=new Consumer<String> (){
			public void accept(String name) {
				System.out.println("Hello"+name);
			}
		};
		c.accept(" Daddy It's been long time");

	}

}
