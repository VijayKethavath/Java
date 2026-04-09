package IOStreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {

	public static void main(String[] args) throws IOException {
		String location=("C:\\Users\\ketha\\Desktop\\JAVA\\IOstream\\text2.txt");
		File fs=new File(location);
		
		if(fs.exists()) {
			System.out.println("File is available");
			
			FileOutputStream fos=new FileOutputStream(location,true);
			String str="Hello there ";
			byte [] bt=str.getBytes();
			fos.write(bt);
			fos.close();
		}
		else {
			System.out.println("File is not Available");
		}
		

	}

}
