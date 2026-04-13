package IOStreams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Objectinputstream {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("student_data.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				){ 
			Student st=(Student)ois.readObject();
			Student st1=(Student)ois.readObject();
			
			System.out.println(st);
			System.out.println(st1);
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
