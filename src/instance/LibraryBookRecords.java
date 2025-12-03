package instance;

public class LibraryBookRecords {
	static String libraryName;
	String Title;
	String Author;
	public void displayinfo() {
		System.out.println("Library name:"+libraryName);
		System.out.println("Title:"+Title);
		System.out.println("Author:"+Author);;
		System.out.println("---------------------------------");
	}
	

	public static void main(String[] args) {
		LibraryBookRecords book1=new LibraryBookRecords();
		LibraryBookRecords book2=new LibraryBookRecords();
		book1.libraryName="Gandi library";
				book1.Title="Maths 1B";
				book1.Author="vijay";
				book1.displayinfo();
				
				book2.Title="Maths 1A";
				book2.Author="Ajay";
				book2.displayinfo();
	}

}
