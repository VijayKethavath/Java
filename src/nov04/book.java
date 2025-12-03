package nov04;

public class book {
	String booktitle;
	String auther;
	int isbn;
	public void addBookDetails(String title,String auther1 ,int isbn1) {
		booktitle=title;
		auther=auther1;
		isbn=isbn1;
	}
	public String displayDetail() {
		return "Book Title:"+booktitle+"\n"+"Auther:"+auther+"\n"+"ISBN:"+isbn;
	}


	public static void main(String[] args) {
		book obj=new book();
		obj.addBookDetails("Maths 1A","Dr.srinivas",1002);
		System.out.println(obj.displayDetail());

	}

}
