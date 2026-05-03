package Collection;
import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
	   Stack<Integer> st = new Stack<>();
	   
	   //push()
	   st.push(30);
	   st.push(20);
	   st.push(80);
	   st.push(40);
	   
	   System.out.println("Stack Elements: "+ st);
	   
	   //peek()
	   System.out.println("Top Element using Peek(): "+ st.peek());
	   
	   //search()
	   System.out.println("Position of 20 from top:"+ st.search(20));
	   
	   //size()
       System.out.println("Size of the Stack: " + st.size());	  
       
       //pop
       System.out.println("Popped Element: "+ st.pop());
       System.out.println("Stack After Pop: "+ st);
       
       //isEmpty()
       System.out.println("Is stsack is Empty: "+st.isEmpty());	  
	   

	}

}
