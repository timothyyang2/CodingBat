public class String2 {

    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return result;
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            } else if (str.substring(i, i + 3).equals("dog")) {
                countDog++;
            }
        }
        if (countCat == countDog) {
            return true;
        }
        return false;
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        if (a.length() >= b.length() && a.substring(a.length() - b.length()).toLowerCase().equals(b.toLowerCase())) {
            return true;
        }
        if (b.length() >= a.length() && b.substring(b.length() - a.length()).toLowerCase().equals(a.toLowerCase())) {
            return true;
        }
        return false;
    }

    public boolean xyzThere(String str) {
        if (str.startsWith("xyz")) {
            return true;
        }
        for (int i = 1; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz") && str.charAt(i - 1) != '.') {
                return true;
            }
        }
        return false;
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public boolean xyBalance(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' || str.charAt(i) == 'y') {
                result += str.substring(i, i + 1);
            }
        }
        if ((result.length() > 0 && result.charAt(result.length() - 1) == 'y') || result.length() == 0) {
            return true;
        }
        return false;
    }

    public String mixString(String a, String b) {
        String result = "";
        int max = Math.max(a.length(), b.length());
        for (int i = 0; i < max; i++) {
            if (i < a.length()) {
                result += a.substring(i, i + 1);
            }
            if (i < b.length()) {
                result += b.substring(i, i + 1);
            }
        }
        return result;
    }

    public String repeatEnd(String str, int n) {
        String end = str.substring(str.length() - n);
        String result = "";
        for (int i = 0; i < n; i++) {
            result += end;
        }
        return result;
    }

    public String repeatFront(String str, int n) {
        String result = "";
        for (int i = n; i > 0; i--) {
            result += str.substring(0, i);
        }
        return result;
    }

    public String repeatSeparator(String word, String sep, int count) {
        String result = "";
        if (count == 0) {
            return "";
        }
        for (int i = 0; i < count - 1; i++) {
            result = result + word + sep;
        }
        result += word;
        return result;
    }

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        for (int i = n; i < str.length() - n + 1; i++) {
            if (str.substring(i, i + n).equals(prefix)) {
                return true;
            }
        }
        return false;
    }

    public boolean xyzMiddle(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (Math.abs(str.substring(0, i).length() - str.substring(i + 3).length()) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getSandwich(String str) {
        int firstBread = str.indexOf("bread");
        int secondBread = -1;
        for (int i = str.length(); i > 5; i--) {
            if (str.substring(i - 5, i).equals("bread")) {
                secondBread = i;
                break;
            }
        }
        if (secondBread == -1 || firstBread == -1 || firstBread == secondBread - 5) {
            return "";
        }
        return str.substring(firstBread + 5, secondBread - 5);
    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public String oneTwo(String str) {
        String result = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            result = result + str.substring(i + 1, i + 3) + str.substring(i, i + 1);
        }
        return result;
    }

    public String zipZap(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                str = str.replace(str.substring(i, i + 3), "zp");
            }
        }
        return str;
    }

    public String starOut(String str) {
        String result = str;
        if (str.length() == 1 && str.charAt(0) == '*') {
            return "";
        }
        if (str.startsWith("*")) {
            result = str.substring(2);
        }
        if (str.endsWith("*")) {
            result = str.substring(0, str.length() - 2);
        }
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != '*') {
                    result = result.replace(str.substring(i - 1, i), "");
                }
                if (str.charAt(i + 1) != '*') {
                    result = result.replace(str.substring(i + 1, i + 2), "");
                }
                result = result.replace(str.substring(i, i + 1), "");
            }
        }
        return result;
    }

    public String plusOut(String str, String word) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == word.charAt(0) && str.substring(i, i + word.length()).equals(word)) {
                result += word;
                i += word.length() - 1;
            } else {
                result += "+";
            }
        }
        return result;
    }

    public String wordEnds(String str, String word) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == word.charAt(0) && str.substring(i, i + word.length()).equals(word)) {
                if (i != 0) {
                    result += str.substring(i - 1, i);
                }
                if (i + word.length() != str.length()) {
                    result += str.substring(i + word.length(), i + word.length() + 1);
                }
            }
        }
        return result;
    }
}
