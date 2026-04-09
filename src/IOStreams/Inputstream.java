package IOStreams;

import java.io.File;
import java.io.IOException;

public class Inputstream {

	public static void main(String[] args) throws IOException {
		String location=("C:\\Users\\ketha\\Desktop\\JAVA\\IOstream\\text1.txt");
		File fs=new File(location);

		if(fs.exists()) System.out.println("The file is available");

		else {
			System.out.println("File is not available");
			if(fs.createNewFile()) {
				System.out.println("File is Created");
			}
			else System.out.println("File is not Created");

		}

	}

}
