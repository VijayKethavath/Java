package IOStreams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	Integer id;
	String name;
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

public class ObjectStream {


	public static void main(String[] args) {
		try(FileOutputStream fis=new FileOutputStream("student_data.txt");
				ObjectOutputStream oop=new ObjectOutputStream(fis);
				){
			Student st =new Student(001,"Devika");
			Student st1 =new Student(002,"Akshiths");
			
			oop.writeObject(st);
			oop.writeObject(st1);
			System.out.println("File Created and Object inserted");

		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
