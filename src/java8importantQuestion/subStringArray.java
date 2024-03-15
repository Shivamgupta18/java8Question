package java8importantQuestion;

public class subStringArray {
      public static void main(String[] args) {
    	  String Str = "LIELIEILIEAMLIECOOL";
    	  String Sub = "LIE";
		System.out.println(extractSecretMessage(Str,Sub));
	}

	 static String extractSecretMessage(String Str, String Sub) {
		// TODO Auto-generated method stub
		Str=Str.replaceAll(Sub," ");
		Str=Str.trim();
		return Str;
	}
}
