package Innerclases;

abstract class AnonymousInner {
	
	abstract void animal();

	public static void main(String[] args) {
		AnonymousInner in=new AnonymousInner() {
			void animal() {
				System.out.println("Dog Barks..");
			}
		};
		in.animal();

	}

}
