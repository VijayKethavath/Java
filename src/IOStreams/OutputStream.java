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
			String str="JAVA is a powerful programming "
					+ "language for building application ";
			
			byte [] bt=str.getBytes();
			fos.write(bt);
			fos.close();
			
			System.out.println("Data is succesfully written in the file");
			
		}
		else {
			System.out.println("File is not Available");
		}
		

	}

}
