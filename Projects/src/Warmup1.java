
public class Warmup1 {

  public boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday || vacation) {
      return true;
    }
    return false;
  }

  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
      return true;
    }
    return false;
  }

  public int sumDouble(int a, int b) {
    if (a == b) {
      return (2 * a) + (2 * b);
    } else {
      return a + b;
    }
  }

  public int diff21(int n) {
    if (n > 21) {
      return 2 * Math.abs(n - 21);
    } else {
      return Math.abs(n - 21);
    }
  }

  public boolean parrotTrouble(boolean talking, int hour) {
    if (talking && (hour < 7 || hour > 20)) {
      return true;
    }
    return false;
  }

  public boolean makes10(int a, int b) {
    return a == 10 || b == 10 || a + b == 10;
  }

  public boolean nearHundred(int n) {
    return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
  }

  public boolean posNeg(int a, int b, boolean negative) {
    if (negative) {
      return (a < 0 && b < 0);
    } else {
      return ((a < 0 && b > 0) || (a > 0 && b < 0));
    }
  }

  public String notString(String str) {
    if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
      return str;
    } else {
      return "not " + str;
    }
  }

  public String missingChar(String str, int n) {
    return str.substring(0, n) + str.substring(n + 1, str.length());
  }

  public String frontBack(String str) {
    if (str.length() < 2) {
      return str;
    } else {
      return str.substring(str.length() - 1, str.length()) + str.substring(1, str.length() - 1) + str.substring(0, 1);
    }
  }

  public String front3(String str) {
    String front;

    if (str.length() >= 3) {
      front = str.substring(0, 3);
    } else {
      front = str;
    }

    return front + front + front;
  }

  public String backAround(String str) {
    String last = str.substring(str.length() - 1, str.length());
    return last + str + last;
  }

  public boolean or35(int n) {
    if (n % 3 == 0 || n % 5 == 0) {
      return true;
    }
    return false;
  }

  public String front22(String str) {
    String front2;
    if (str.length() < 2) {
      return str + str + str;
    } else {
      front2 = str.substring(0, 2);
      return front2 + str + front2;
    }
  }

  public boolean startHi(String str) {
    if (str.length() > 1 && str.substring(0, 2).equals("hi")) {
      return true;
    }
    return false;
  }

  public boolean icyHot(int temp1, int temp2) {
    if ((temp1 < 0 && temp2 > 100) || (temp1 > 0 && temp2 < 100)) {
      return true;
    }
    return false;
  }

  public boolean in1020(int a, int b) {
    if (a >= 10 && a <= 20) {
      return true;
    }
    if (b >= 10 && b <= 20) {
      return true;
    }
    return false;
  }

  public boolean hasTeen(int a, int b, int c) {
    if (a >= 13 && a <= 19) {
      return true;
    }
    if (b >= 13 && b <= 19) {
      return true;
    }
    if (c >= 13 && c <= 19) {
      return true;
    }
    return false;
  }

  public boolean loneTeen(int a, int b) {
    if (a >= 13 && a <= 19) {
      if (b >= 13 && b <= 19) {
        return false;
      }
      return true;
    }
    if (b >= 13 && b <= 19) {
      if (a >= 13 && a <= 19) {
        return false;
      }
      return true;
    }
    return false;
  }

  public String delDel(String str) {
    if (str.length() < 4) {
      return str;
    } else if (str.substring(1, 4).equals("del")) {
      return str.substring(0, 1) + str.substring(4);
    } else {
      return str;
    }
  }

  public boolean mixStart(String str) {
    if (str.length() < 3) {
      return false;
    }
    if (str.substring(1, 3).equals("ix")) {
      return true;
    }
    return false;
  }

  public String startOz(String str) {
    String result = "";
    if (str.length() < 2) {
      return str;
    }
    if (str.substring(0, 1).equals("o")) {
      result += str.substring(0, 1);
    }
    if (str.substring(1, 2).equals("z")) {
      result += str.substring(1, 2);
    }
    return result;
  }

  public int intMax(int a, int b, int c) {
    int max;
    if (a > b) {
      max = a;
    } else {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    return max;
  }

  public int close10(int a, int b) {
    if (Math.abs(10 - a) == Math.abs(10 - b)) {
      return 0;
    }
    if (Math.abs(10 - a) > Math.abs(10 - b)) {
      return b;
    }
    return a;
  }

  public boolean in3050(int a, int b) {
    if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
      return true;
    }
    if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
      return true;
    }
    return false;
  }

  public int max1020(int a, int b) {
    int max;
    if ((a < 10 || a > 20) && (b < 10 || b > 20)) {
      return 0;
    }
    if (a > b) {
      max = a;
      if (max >= 10 && max <= 20) {
        return max;
      } else {
        return b;
      }
    } else {
      max = b;
      if (max >= 10 && max <= 20) {
        return max;
      } else {
        return a;
      }
    }
  }

  public boolean stringE(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e') {
        count++;
      }
    }
    return (count >= 1 && count <= 3);
  }

  public boolean lastDigit(int a, int b) {
    if (a % 10 == b % 10) {
      return true;
    }
    return false;
  }

  public String endUp(String str) {
    if (str.length() < 3) {
      return str.toUpperCase();
    }
    return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
  }

  public String everyNth(String str, int n) {
    String result = "";
    for (int i = 0; i < str.length(); i += n) {
      result += str.charAt(i);
    }
    return result;
  }

  public static void main(String[] args) {

  }
}