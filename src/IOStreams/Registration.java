package IOStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Registration {
	
    static final String filename=("C:\\Users\\ketha\\Desktop\\JAVA\\IOstream\\userdata.txt");
    static Scanner sc =new Scanner(System.in);
    
    public static void register() throws IOException {
    	System.out.println("\n...Register...\n");
    	
    	System.out.print("username : ");
    	String name=sc.nextLine();
    	
    	
    	System.out.print("Password : ");
    	String pass=sc.nextLine();
    	
    	FileWriter fw=new FileWriter(filename,true);
    	fw.write(name+","+pass+"\n");
    	fw.close();	
    	
    	System.out.println("Registration Successful\n\nThank you for registration. ");
    }
    
    
    public static void login() throws IOException {
    	System.out.println("\n...Login...\n");
    	System.out.print("Username : ");
    	String lname=sc.nextLine();
    	
    	System.out.print("Password : ");
    	String lpass=sc.nextLine();
    	
    	FileReader fr =new FileReader(filename);
    	BufferedReader br =new BufferedReader(fr);
    	
    	String line;
    	boolean match=false;
    	
    	while((line=br.readLine())!=null) {
//    		System.out.println(line);
    		String[] data=line.split(",");
    		
    		if(data[0].equals(lname)&&data[1].equals(lpass)) {
    			match=true;
    		}
    	}
    	
    	System.out.println(match?"\nLogin Successful\n":"\nLogin failed\n.");
    	
    	
    	
    	
    }
    
    
	public static void main(String[] args) throws IOException {
		
		while(true) {
			System.out.println("----- Welcome to 77r79r Bank---------\r\n"
					+ "1. Login\r\n"
					+ "2. Register\r\n"
					+ "3. Exit (use System.exit(0))\r\n"
					+ "Choose one option [1-3] : \r\n"
					+ "");
			
			int option=sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			case 1:
				login();
				break;
				
			case 2:
				register();
				break;
				
			case 3:
				System.out.println("Bye Bye...");
				System.exit(0);
				
			default:
				System.out.println("Invaild option ");
				
			}
			
			
		}

	}

}
