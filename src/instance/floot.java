package instance;

public class floot {
	float a=1;
	public float getfloatvalue() {
		return a;
	}

	public static void main(String[] args) {
		floot obj=new floot();
		float value=obj.getfloatvalue();
		System.out.println(value);

	}

}
