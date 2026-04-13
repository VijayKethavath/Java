package IOStreams;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;

class Address implements Serializable{
	String city;
	String street;
	public Address(String city, String street) {
		super();
		this.city = city;
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}}
class Employee implements Serializable {
	transient Address address;
	String name;
	public Employee(Address address, String name) {
		super();
		this.address = address;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [ Address= " + address + ", Name= " + name + "]";
	}	
}
public class ObjectStream2 {
	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("Emp.txt");
				FileInputStream fis=new FileInputStream("Emp.txt");
				ObjectOutputStream oop=new ObjectOutputStream(fos);
				ObjectInputStream oip=new ObjectInputStream(fis);
				){
			Address ad=new Address("Hyderabad","Lb nagar");
			Employee emp=new Employee(ad," Dheema ");
			System.out.println("File Created and Object inserted");
			oop.writeObject(emp); 
			Employee emp1=(Employee) oip.readObject();
			System.out.println(emp1);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
