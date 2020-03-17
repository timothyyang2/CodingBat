
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
	
	public static String middleTwo(String str) {
		return str.substring(str.length()/2-1,str.length()/2) + str.substring(str.length()/2,str.length()/2+1);
	}
	
	public static boolean endsLy(String str) {
		if(str.length()<2) {
			return false;
		}
		if(str.substring(str.length()-2,str.length()).equals("ly")){
			return true;
		}
		return false;
	}
	
	public static String nTwice(String str, int n) {
		return str.substring(0,n) + str.substring(str.length()-n, str.length());
	}
	
	public static String twoChar(String str, int index) {
		if(str.length()<2){
			return str;
		}
		if(index>str.length()-2 || index<0){
			return str.substring(0,2);
		}
		return str.substring(index, index+2);
	}

	public static String middleThree(String str) {
		return str.substring(str.length()/2-1,str.length()/2+2);
	}
	
	public static boolean hasBad(String str) {
		if(str.length()<3 || str.length()<4 && str.charAt(0)!='b'){
			return false;
		}
		if(str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad")){
			return true;
		}
		return false;
	}
	
	public static String atFirst(String str) {
		if(str.length()<2){
			for(int i=0; i<3-str.length(); i++){
				str = str + "@";
			}
		    return str;
		}
		return str.substring(0,2);
	}

	public static String lastChars(String a, String b) {
		a = a +"@@@@";
		b = "@@@@" + b;
		return a.charAt(0) + b.substring(b.length()-1,b.length());
	}

	public static String conCat(String a, String b) {
		if(a.length()==0){
			return b;
		}
		if(b.length()==0){
		    return a;
		}
		if(a.substring(a.length()-1,a.length()).equals(b.substring(0,1))){
		    return a.substring(0,a.length()-1)+b;
		}
		return a+b;
	}
	
	public static String lastTwo(String str) {
		if(str.length()<2){
			return str;
		}
		return str.substring(0,str.length()-2) + str.substring(str.length()-1,str.length()) + str.substring(str.length()-2,str.length()-1);
	}
	
	public static String seeColor(String str) {
		if(str.startsWith("red")){
			return "red";
		}
		if(str.startsWith("blue")){
		    return "blue";
		}
		return "";
	}

	public static boolean frontAgain(String str) {
		if(str.length()<2){
			return false;
		}
		if(str.substring(0,2).equals(str.substring(str.length()-2,str.length()))){
			return true;
		}
		return false;
	}

	public static String minCat(String a, String b) {
		int omit = 0;
		if(a.length()>b.length()){
			omit = a.length()-b.length();
			a = a.substring(omit,a.length());
		}else if(a.length()<b.length()){
		    omit = b.length()-a.length();
		    b = b.substring(omit,b.length());
		}else if(a.length()==b.length()){
		    return a+b;
		}
		return a+b;
	}

	public static String extraFront(String str) {
		if(str.length()<2){
			return str+str+str;
		}
		return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
	}
	
	public static String without2(String str) {
		if(str.length()<2){
			return str;
		}
		String result = str.substring(0,2);
		String result1 = str.substring(str.length()-2,str.length());
		if(result.equals(result1)){
			str = str.substring(2);
		}
		return str;
	}
	
	public static String deFront(String str) { 
		if(str.charAt(0)=='a' && str.charAt(1)=='b'){
			str = str;
		}else if(str.charAt(0)=='a'){
		    str = str.substring(0,1)+str.substring(2);
		}else if(str.charAt(1)=='b'){
		    str = str.substring(1);
		}else{
		    return str.substring(2);
		}
		return str;
	}
	
	public static String startWord(String str, String word) {
		if(word.length()>str.length()){
			return "";
		}
		if(str.substring(1,word.length()).equals(word.substring(1))){
		    return str.substring(0,word.length());
		}
		return "";
	}
	
	public static String withoutX(String str) {
		if(str.length()<2){
		    return "";
		}
		if(str.charAt(0)=='x' && str.charAt(str.length()-1)=='x'){
		    str = str.substring(1,str.length()-1);
		}else if(str.charAt(0)=='x'){
		    str = str.substring(1);
		}else if(str.charAt(str.length()-1)=='x'){
		    str = str.substring(0,str.length()-1);
		}
		return str;
	}

	public static String withoutX2(String str) {
		if(str.length()<2){
			return "";
		}
		if(str.charAt(0)=='x' && str.charAt(1)=='x'){
		    str = str.substring(2);
		}else if(str.charAt(0)=='x'){
			str = str.substring(1);
		}else if(str.charAt(1)=='x'){
			str = str.substring(0,1) + str.substring(2);
		}
		return str;
	}




	public static void main(String[] args) {
		System.out.println(helloName("Nick"));
		System.out.println(nonStart("John", "Cena"));
		System.out.println(withouEnd2("Bobson"));
	}
}
