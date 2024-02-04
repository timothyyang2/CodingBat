public class String3 {

    public int countYZ(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((Character.toLowerCase(str.charAt(i)) == 'y' || Character.toLowerCase(str.charAt(i)) == 'z')
                    && (!Character.isLetter(str.charAt(i + 1)))) {
                count++;
            }
        }
        if (Character.toLowerCase(str.charAt(str.length() - 1)) == 'y'
                || Character.toLowerCase(str.charAt(str.length() - 1)) == 'z') {
            count++;
        }
        return count;
    }

    public String withoutString(String base, String remove) {
        String result = "";
        for (int i = 0; i < base.length();) {
            if (!(i + remove.length() > base.length())
                    && base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
                i += remove.length();
                continue;
            } else {
                result += base.substring(i, i + 1);
                i++;
            }
        }
        return result;
    }

    public boolean equalIsNot(String str) {
        int is = 0;
        int not = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!(i + 2 > str.length()) && str.substring(i, i + 2).equals("is")) {
                is++;
            }
            if (!(i + 3 > str.length()) && str.substring(i, i + 3).equals("not")) {
                not++;
            }
        }
        return is == not;
    }

    public boolean gHappy(String str) {
        boolean happy = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i - 1) == 'g') {
                    happy = true;
                } else if (i < str.length() - 1 && str.charAt(i + 1) == 'g') {
                    happy = true;
                } else {
                    happy = false;
                }
            }
        }
        return happy;
    }

    public int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && str.charAt(i - 1) == str.charAt(i) && i < str.length() - 1
                    && str.charAt(i + 1) == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public int sumDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return count;
    }

    public String sameEnds(String string) {
        String current = "";
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            current += string.charAt(i);
            if (i < string.length() / 2 && current.equals(string.substring(string.length() - current.length()))) {
                result = current;
            }
        }
        return result;
    }

    public String mirrorEnds(String string) {
        String current = "";
        String result = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            current += string.charAt(i);
            if (current.equals(string.substring(0, current.length()))) {
                result = current;
            }
        }
        return result;
    }

    public int maxBlock(String str) {
        int count = 0;
        int maxBlock = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > maxBlock) {
                maxBlock = count;
            }
            count = 0;
        }
        return maxBlock;
    }

    public int sumNumbers(String str) {
        String current = "";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
                    current += str.charAt(i);
                } else {
                    current += str.charAt(i);
                    sum += Integer.parseInt(current);
                    current = "";
                }
            }
        }
        return sum;
    }

    public String notReplace(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1))
                    || i + 2 < str.length() && Character.isLetter(str.charAt(i + 2))) {
                result += str.charAt(i);
            } else if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {
                result += "is not";
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }

}
