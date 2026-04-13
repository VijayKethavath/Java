package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable{
	private static final long serialVersionUID = 1L;
	String Name;
	String Behaviour;
	public Animal(String name, String behaviour) {
		super();
		Name = name;
		Behaviour = behaviour;
	}
	@Override
	public String toString() {
		return "Animal [Name=" + Name + ", Behaviour=" + Behaviour + "]";
	}
}
public class serialversion {
	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("ani.txt");
				FileInputStream fis=new FileInputStream("ani.txt");
				ObjectOutputStream oop=new ObjectOutputStream(fos);
				ObjectInputStream oip=new ObjectInputStream(fis);
				){
			       Animal ani=new Animal("Sea lion"," Playful nature ");
			       oop.writeObject(ani); 
			       Animal anim=(Animal) oip.readObject();
			       System.out.println(anim);
		}catch(Exception e) {
			System.out.println(e);
		}
	}




}


