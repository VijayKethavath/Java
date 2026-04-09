package Program;

import java.io.FileOutputStream;
import java.io.IOException;


public class Stream {
	public static void main(String[] args) throws IOException {
		String location ="C:\\Users\\ketha\\Desktop\\JAVA FS\\abc.txt";

		FileOutputStream fos= new FileOutputStream(location,true) ;
		String str="Hello";

		byte[] bt=str.getBytes();
		fos.write(bt);
		
		fos.close();
		System.out.println("Data created");
				


	}

}
