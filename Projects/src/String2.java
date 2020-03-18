
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


	public static void main(String[] args) {
		
	}

}
