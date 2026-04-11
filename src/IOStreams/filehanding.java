package IOStreams;
	
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehanding {

	public static void main(String[] args) throws IOException {
	   FileWriter flw=new FileWriter("C:\\Users\\ketha\\Desktop\\JAVA\\IOstream\\text3.txt");
	   flw.write("Java is multithreading");
	   flw.close();
	   System.out.println("data added...");
	   
	   FileReader flr=new FileReader("C:\\Users\\ketha\\Desktop\\JAVA\\IOstream\\text3.txt");
	   int i;
	   while((i=flr.read())!= -1) {
		   System.out.print((char)i);
	   }
	   flr.close();

	}

}
