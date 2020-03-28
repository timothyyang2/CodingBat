
public class String2 {
	
	public String doubleChar(String str) {
		  if(str.length()==0){
		    return "";
		  }
		  String str1 = "";
		  for(int i=0; i<str.length()-1; i++){
		    str1 = str1 + str.substring(i,i+1)+str.substring(i,i+1);
		  }
		  str1 = str1 + str.substring(str.length()-1) + str.substring(str.length()-1);
		  return str1;
		}
	
	public int countHi(String str) {
		int count = 0;
		for(int i=0; i<str.length()-1; i++){
			if(str.substring(i,i+2).equals("hi")){
		      count++;
		    }
		}
		return count;
	}
	
	public boolean catDog(String str) {
		int count = 0;
		int count1 = 0;
		for(int i=0; i<str.length()-2; i++){
			if(str.substring(i,i+3).equals("cat")){
		      count++;
		   }
		}
		for(int j=0; j<str.length()-2; j++){
			if(str.substring(j,j+3).equals("dog")){
		      count1++;
		    }
		}
		if(count==count1){
		    return true;
		}
		return false;
	}
	
	public int countCode(String str) {
		int count = 0;
		for(int i=0; i<str.length()-3; i++){
		  if(str.substring(i,i+2).equals("co") && str.substring(i+3,i+4).equals("e")){
		      count++;
		  }
		}
		return count;
	}
	
	public boolean endOther(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		if(a.endsWith(b) || b.endsWith(a)){
		    return true;
		}
		return false;
	}
	
	public boolean xyzThere(String str) {
		if(str.startsWith("xyz")){
			return true;
		}
		for(int i=0; i<str.length()-3; i++){
		  if(str.charAt(i)!='.'){
		    if(str.substring(i+1,i+4).equals("xyz")){
		        return true;
		    }
		  }
		}
		return false;
	}
	
	public boolean bobThere(String str) {
		for(int i=0; i<str.length()-2; i++){
			if(str.charAt(i)=='b' && str.charAt(i+2)=='b'){
		      return true;
		      }
		}
		return false;
	}
	
	public boolean xyBalance(String str) {
		int len = str.length() - 1;
		char ch;
		for(int i = len; i >= 0; i--) {
			ch = str.charAt(i);
			if(ch == 'x')
				return false;
			else if(ch == 'y')
				return true;
		}
		return true;  
	}

	public static void main(String[] args) {
		
	}

}
