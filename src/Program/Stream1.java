package Program;
import java.io.*;

public class Stream1 {

	public static void main(String[] args) throws IOException {
		String location="\\C:\\Users\\ketha\\Desktop\\JAVA FS\\xyz.txt";
		
		File file=new File(location);
		
		if(file.exists()) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
			boolean newFile=file.createNewFile();
			System.out.println("Created");
		}

	}

}
