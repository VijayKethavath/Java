package Condition_statements;

public class Check_vowel {
	public void check(String vowel) {
		if ((vowel=="a")|| (vowel=="i")||(vowel=="e")||(vowel=="o")||(vowel=="a")||(vowel=="u")){
			System.out.println(vowel+":its a vowel");
		}
		else {
			System.out.println(vowel+":its a  consonant");
		}
	}

	public static void main(String[] args) {
		Check_vowel obj=new Check_vowel();
		obj.check("b");
		
	}

}
