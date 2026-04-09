package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class stream {

	public static void main(String[] args) {
		try {
			String copy=("C:\\Users\\ketha\\Desktop\\JAVA\\IOstream\\cop.txt");
			String paste=("C:\\Users\\ketha\\Desktop\\JAVA\\IOstream\\paste.txt");
			
			FileInputStream fis = new FileInputStream(copy);
			FileOutputStream fos = new FileOutputStream(paste);
			
			int data;
			while((data=fis.read()) != -1) {
				fos.write(data);
			}
			
			System.out.println("Successfull");
			
			fos.close();
			fis.close();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
			
			
			
		

	}

}
