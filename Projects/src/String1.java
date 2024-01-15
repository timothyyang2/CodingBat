public class String1 {

    public String helloName(String name) {
        return "Hello " + name + "!";
    }
    
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
    
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
    
    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }
   
    public String extraEnd(String str) {
        String last = str.substring(str.length()-2);
        return last + last+ last;
    }
      
    public String firstTwo(String str) {
        if (str.length() < 2) {
          return str;
        }
        return str.substring(0, 2);
    }
      
    public String firstHalf(String str) {
        int index = str.length()/2;
        return str.substring(0, index);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }
    
    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
          return b + a + b;
        }
        return a + b + a;
    }
    
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
    
    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }
    
    public String right2(String str) {
        return str.substring(str.length()-2) + str.substring(0, str.length()-2);
    }
    
    public String theEnd(String str, boolean front) {
        if (front) {
          return str.substring(0, 1);
        }
        return str.substring(str.length()-1);
    }
      
    public String withouEnd2(String str) {
        if (str.length() < 2) {
          return "";
        }
        return str.substring(1, str.length()-1);
    }
    
    public String middleTwo(String str) {
        int half = str.length()/2;
        return str.substring(half-1, half) + str.substring(half, half+1); 
    }
    
    public boolean endsLy(String str) {
        if (str.length() >= 2) {
          if (str.substring(str.length()-2).equals("ly")) {
            return true;
          }
        }
        return false;
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length()-n);
    }
    
    public String twoChar(String str, int index) {
        if (index < 0 || str.length() - index < 2) {
          return str.substring(0, 2);
        }
        return str.substring(index, index+2);
    }      

    public String middleThree(String str) {
        int half = str.length()/2;
        return str.substring(half-1, half+2);
    }

    public boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (str.substring(0, 3).equals("bad") || (str.length() > 3 && str.substring(1, 4).equals("bad"))) {
          return true;
        }
        return false;
    }
      
    public String atFirst(String str) {
        if (str.length() == 1) {
          return str + "@";
        }
        if (str.length() == 0) {
          return "@@";
        }
        return str.substring(0, 2);
    }
      
    public String lastChars(String a, String b) {
        if (a.length() == 0 && b.length() != 0) {
          return "@" + b.substring(b.length()-1);
        } else if (a.length() != 0 && b.length() == 0) {
          return a.substring(0, 1) + "@";
        } else if (a.length() == 0 && b.length() == 0) {
          return "@@";
        }
        return a.substring(0, 1) + b.substring(b.length()-1);
    }
    
    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0) {
          if (a.charAt(a.length()-1) == b.charAt(0)) {
            return a.substring(0, a.length()-1) + b;
          }
        }
        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() < 2) {
          return str;
        }
        return str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
    }
      
    public String seeColor(String str) {
        if (str.length() < 3) {
          return "";
        }
        if (str.substring(0, 3).equals("red")) {
          return str.substring(0, 3);
        }
        if (str.length() > 3 && str.substring(0, 4).equals("blue")) {
          return str.substring(0, 4);
        }
        return "";
    }
    
    public boolean frontAgain(String str) {
        if (str.length() >= 2) {
          if (str.substring(0, 2).equals(str.substring(str.length()-2))) {
            return true;
          }
        }
        return false;
    }

    public String minCat(String a, String b) {
        String result = "";
        if (a.length() > b.length()) {
          result = a.substring(a.length()-b.length()) + b;
        } else if (b.length() > a.length()) {
          result = a + b.substring(b.length()-a.length());
        } else {
          result = a + b;
        }
        return result;
    }
      
    public String extraFront(String str) {
        if (str.length() < 2) {
          return str + str + str;
        }
        String first = str.substring(0, 2);
        return first + first + first;
    }
    
    public String without2(String str) {
        if (str.length() >= 2) {
          if (str.substring(0, 2).equals(str.substring(str.length()-2))) {
            return str.substring(2);
          }
        }
        return str;
    }
    
    public String deFront(String str) {    
        if (str.charAt(0) != 'a' && str.charAt(1) != 'b') {
          return str.substring(2);
        } else if (str.charAt(0) == 'a') {
          if (str.charAt(1) != 'b') {
            return str.charAt(0) + str.substring(2);
          }
        } else if (str.charAt(1) == 'b') {
          if (str.charAt(0) != 'a') {
            return str.substring(1);
          }
        }
        return str;
    }
    
    public String startWord(String str, String word) {
        if (str.length() >= word.length() && str.substring(1, word.length()).equals(word.substring(1))) {
          return str.substring(0, word.length());
        }
        return "";
    }

    public String withoutX(String str) {
        if (str.length() < 1) {
          return str;
        }
        String result = str;
        if (str.charAt(0) == 'x') {
          result = str.substring(1);
        }
        if (str.length() > 1 && str.charAt(str.length()-1) == 'x') {
          result = result.substring(0, result.length()-1);
        }
        return result;
    }
     
    public String withoutX2(String str) {
        if (str.length() < 1) {
          return str;
        }
        String result = str;
        if (str.charAt(0) == 'x') {
          result = result.substring(1);
        }
        if (str.length() > 1 && str.charAt(1) == 'x' && str.charAt(0) != 'x') {
          result = result.charAt(0) + result.substring(2);
        } else if (str.length() > 1 && str.charAt(1) == 'x' && str.charAt(0) == 'x') {
          result = result.substring(1);
        }
        return result;
    }
      
      
    public static void main(String[] args) {

    }
    
}
