package Execeptoin;

import java.io.FileReader;

public class Checked {

	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("text.txt");
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		

	}

}
