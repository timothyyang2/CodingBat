
public class String1 {
	
	public static String helloName(String name) {
		return "Hello " + name + "!";
	}
	
	public static String makeAbba(String a, String b) {
		return (a+b+b+a);
	}

	public static String makeTags(String tag, String word) {
		return ('<' + tag + '>' + word + '<' + '/' + tag + '>');
	}
	
	public static String makeOutWord(String out, String word) {
		return (out.substring(0, 2) + word + out.substring(2, 4));
	}

	public static String extraEnd(String str) {
		int len = str.length();
		String temp = str.substring(len-2, len);
		return (temp + temp + temp);
	}

	public static String firstTwo(String str) {
		if(str.length() >= 3) {
			return str.substring(0, 2);
		}
		return str;
	}
	
	public static String firstHalf(String str) {
		return str.substring(0, str.length()/2);
	}
	
	public static String withoutEnd(String str) {
		return str.substring(1, str.length()-1);
	}
	
	public static String comboString(String a, String b) {
		if(a.length() >= b.length()) {
			return b+a+b;
		}
		return a+b+a;
	}
	
	public static String nonStart(String a, String b) {
		return a.substring(1, a.length()) + b.substring(1, b.length());
	}
	
	public static String left2(String str) {
		return (str.substring(2) + str.substring(0, 2));
	}
	
	public static String right2(String str) {
		int len = str.length()-2;
		return (str.substring(len) + str.substring(0, len));
	}
	
	public static String theEnd(String str, boolean front) {
		if(front) {
			return str.substring(0, 1);
		}
		return str.substring(str.length()-1);
	}

	public static String withouEnd2(String str) {
		int len = str.length();
		if(len >= 3) {
			return str.substring(1, len-1);
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.println(helloName("Nick"));
		System.out.println(nonStart("John", "Cena"));
		System.out.println(withouEnd2("Bobson"));
	}
}
