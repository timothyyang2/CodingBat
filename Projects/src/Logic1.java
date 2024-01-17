public class Logic1 {

  public boolean cigarParty(int cigars, boolean isWeekend) {
    if ((cigars >= 40 && cigars <= 60 && !isWeekend) || (isWeekend && cigars >= 40)) {
      return true;
    }
    return false;
  }

  public int dateFashion(int you, int date) {
    if (you <= 2 || date <= 2) {
      return 0;
    }
    if ((you >= 8 || date >= 8)) {
      return 2;
    }
    return 1;
  }

  public boolean squirrelPlay(int temp, boolean isSummer) {
    if ((temp >= 60 && temp <= 90 && !isSummer) || (temp >= 60 && temp <= 100 && isSummer)) {
      return true;
    }
    return false;
  }

  public int caughtSpeeding(int speed, boolean isBirthday) {
    if ((speed <= 65 && isBirthday) || (speed <= 60 && !isBirthday)) {
      return 0;
    }
    if ((speed <= 85 && isBirthday) || (speed <= 80 && !isBirthday)) {
      return 1;
    }
    return 2;
  }

  public int sortaSum(int a, int b) {
    if (a + b >= 10 && a + b <= 19) {
      return 20;
    }
    return a + b;
  }

  public String alarmClock(int day, boolean vacation) {
    if (vacation && (day == 0 || day == 6)) {
      return "off";
    } else if (!vacation && day != 0 && day != 6) {
      return "7:00";
    }
    return "10:00";
  }

  public boolean love6(int a, int b) {
    if (a == 6 || b == 6 || (a + b == 6) || Math.abs(a - b) == 6) {
      return true;
    }
    return false;
  }

  public boolean in1To10(int n, boolean outsideMode) {
    if (n >= 1 && n <= 10 && !outsideMode || (n <= 1 || n >= 10) && outsideMode) {
      return true;
    }
    return false;
  }

  public boolean specialEleven(int n) {
    if (n % 11 == 0 || n % 11 == 1) {
      return true;
    }
    return false;
  }

  public boolean more20(int n) {
    if (n % 20 == 1 || n % 20 == 2) {
      return true;
    }
    return false;
  }

  public boolean old35(int n) {
    if ((n % 3 == 0 || n % 5 == 0) && !(n % 3 == 0 && n % 5 == 0)) {
      return true;
    }
    return false;
  }

  public boolean less20(int n) {
    if ((n + 1) % 20 == 0 || (n + 2) % 20 == 0) {
      return true;
    }
    return false;
  }

  public boolean nearTen(int num) {
    if (num % 10 <= 2 || num % 10 >= 8) {
      return true;
    }
    return false;
  }

  public int teenSum(int a, int b) {
    if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
      return 19;
    }
    return a + b;
  }

  public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    if ((isMorning && !isMom) || isAsleep) {
      return false;
    }
    return true;
  }

  public int teaParty(int tea, int candy) {
    if (tea < 5 || candy < 5) {
      return 0;
    }
    if (tea >= 5 && candy >= 5 && tea < candy * 2 && candy < tea * 2) {
      return 1;
    }
    return 2;
  }

  public String fizzString(String str) {
    if (str.charAt(0) == 'f') {
      if (str.charAt(str.length() - 1) == 'b') {
        return "FizzBuzz";
      } else {
        return "Fizz";
      }
    } else if (str.charAt(str.length() - 1) == 'b') {
      return "Buzz";
    }
    return str;
  }

  public String fizzString2(int n) {
    if (n % 3 == 0) {
      if (n % 5 == 0) {
        return "FizzBuzz!";
      } else {
        return "Fizz!";
      }
    } else if (n % 5 == 0) {
      return "Buzz!";
    }
    return n + "!";
  }

  public boolean twoAsOne(int a, int b, int c) {
    if (a + b == c || b + c == a || a + c == b) {
      return true;
    }
    return false;
  }

  public boolean inOrder(int a, int b, int c, boolean bOk) {
    if ((b > a && c > b) || (bOk && c > b)) {
      return true;
    }
    return false;
  }

  public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    if (a < b && b < c || (equalOk && a <= b && b <= c)) {
      return true;
    }
    return false;
  }

  public boolean lastDigit(int a, int b, int c) {
    if (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10) {
      return true;
    }
    return false;
  }

  public boolean lessBy10(int a, int b, int c) {
    if (Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10) {
      return true;
    }
    return false;
  }

  public int withoutDoubles(int die1, int die2, boolean noDoubles) {
    if (noDoubles && die1 == die2) {
      if (die1 == 6) {
        die1 = 1;
      } else {
        die1++;
      }
    }
    return die1 + die2;
  }

  public int maxMod5(int a, int b) {
    if (a == b) {
      return 0;
    }
    if (a % 5 == b % 5) {
      return Math.min(a, b);
    }
    return Math.max(a, b);
  }

  public int redTicket(int a, int b, int c) {
    if (a != b && a != c) {
      return 1;
    }
    if (a == 2 && b == 2 && c == 2) {
      return 10;
    }
    if (a == b && b == c) {
      return 5;
    }
    return 0;
  }

  public int greenTicket(int a, int b, int c) {
    if (a == b && b == c) {
      return 20;
    }
    if (a == b || b == c || a == c) {
      return 10;
    }
    return 0;
  }

  public int blueTicket(int a, int b, int c) {
    if (a + b == 10 || b + c == 10 || a + c == 10) {
      return 10;
    }
    if (a + b == b + c + 10 || a + b == a + c + 10) {
      return 5;
    }
    return 0;
  }

  public boolean shareDigit(int a, int b) {
    if (a % 10 == b % 10 || a / 10 == b / 10 || a % 10 == b / 10 || a / 10 == b % 10) {
      return true;
    }
    return false;
  }

  public int sumLimit(int a, int b) {
    if (String.valueOf(a + b).length() > String.valueOf(a).length()) {
      return a;
    }
    return a + b;
  }

  public static void main(String[] args) {

  }

}
