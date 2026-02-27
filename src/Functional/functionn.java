package Functional;

import java.util.function.*;


public class functionn {

	public static void main(String[] args) {
		Function<Integer,Integer> f=new Function<Integer,Integer>(){
			public Integer apply(Integer n) {
				return n*n;
			}
		
		};
		System.out.println(f.apply(2));
		
		
		

	}

}
